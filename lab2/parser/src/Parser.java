import java.io.InputStream;
import java.text.ParseException;

public class Parser {
    private LexicalAnalyzer lex;
    Tree S() throws ParseException {
        Token token = lex.nextToken();
        if (token != Token.VAR && token != Token.VAL) {
            throw new ParseException("Expected keyword", lex.curPos());
        }
        token = lex.nextToken();
        if (token != Token.NAME) {
            throw new ParseException("Expected name of variable", lex.curPos());
        }
        token = lex.nextToken();
        if (token != Token.COLON) {
            throw new ParseException("Expected colon", lex.curPos());
        }
        return new Tree("S", new Tree("keyword"), new Tree("name"),  new Tree(":"), T());
    }

    Tree T() throws ParseException {
        Token token = lex.nextToken();
        if (token == Token.STRING ||
            token == Token.DOUBLE) {
            return new Tree("T", new Tree("type"));
        }
        if (token == Token.INT) {
            return new Tree("T", new Tree("Int"), I());
        }
        throw new ParseException("Expected type", lex.curPos());
    }

    Tree I() throws ParseException {
        Token token = lex.nextToken();
        if (token == Token.SEMICOLON) {
            return new Tree(";");
        }
        if (token != Token.EQUALS) {
            throw new ParseException("Expected semicolon or equals", lex.curPos());
        }
        token = lex.nextToken();
        if (token != Token.NUMBER) {
            throw new ParseException("Expected number", lex.curPos());
        }
        token = lex.nextToken();
        if (token != Token.SEMICOLON) {
            throw new ParseException("Expected semicolon", lex.curPos());
        }
        return new Tree("I", new Tree("="), new Tree("number", new Tree(";")));
    }

    Tree parse(InputStream is) throws ParseException {
        lex = new LexicalAnalyzer(is);
        return S();
    }
}
