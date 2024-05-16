import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

public class LexicalAnalyzer {
    private final InputStream is;
    private int curChar;
    private int curPos;
    private Token curToken;

    private static final String NAME_PATTERN = "";

    public LexicalAnalyzer(InputStream is) throws ParseException {
        this.is = is;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank(int c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = is.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public Token nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
        switch (curChar) {
            case ':' -> {
                nextChar();
                curToken = Token.COLON;
            }
            case '=' -> {
                nextChar();
                curToken = Token.EQUALS;
            }
            case ';' -> {
                nextChar();
                curToken = Token.SEMICOLON;
            }
            case -1 -> curToken = Token.END;
            default -> {
                String word = getNextWord();
                switch (word) {
                    case "var" -> {
                        nextChar();
                        curToken = Token.VAR;
                    }
                    case "val" -> {
                        nextChar();
                        curToken = Token.VAL;
                    }
                    case "Int" -> {
                        nextChar();
                        curToken = Token.INT;
                    }
                    case "String" -> {
                        nextChar();
                        curToken = Token.STRING;
                    }
                    case "Double" -> {
                        nextChar();
                        curToken = Token.DOUBLE;
                    }
                    default -> {
                        if (word.matches(NAME_PATTERN)) {
                            nextChar();
                            curToken = Token.NAME;
                        } else {
                            try {
                                Integer.parseInt(word);
                                nextChar();
                                curToken = Token.NUMBER;
                            } catch (NumberFormatException e) {
                                throw new ParseException("Illegal keyword " + word, curPos - word.length());
                            }
                        }
                    }
                }
            }
        }
        return curToken;
    }

    private String getNextWord() throws ParseException {
        StringBuilder sb = new StringBuilder();
        while (Character.isAlphabetic(curChar) || Character.isDigit(curChar) || curChar == '_' || curChar == '-') {
            sb.append((char) curChar);
            nextChar();
        }
        if (sb.length() == 0) {
            throw new ParseException("Illegal character " + curChar, curPos);
        }
        return sb.toString();
    }

    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos;
    }
}
