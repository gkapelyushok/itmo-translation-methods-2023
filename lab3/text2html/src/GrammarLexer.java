// Generated from ../grammar/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARET=1, UNDERSCORE=2, LEFT_CURL=3, RIGHT_CURL=4, SLASH=5, DOLLAR=6, DOUBLE_DOLLAR=7, 
		NEW_LINE=8, SPACE=9, DIGIT=10, CHARACTER=11, PUNCTUATION=12, ITALICS=13, 
		BOLD=14, MONOSPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CARET", "UNDERSCORE", "LEFT_CURL", "RIGHT_CURL", "SLASH", "DOLLAR", 
			"DOUBLE_DOLLAR", "NEW_LINE", "SPACE", "DIGIT", "CHARACTER", "PUNCTUATION", 
			"ITALICS", "BOLD", "MONOSPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'_'", "'{'", "'}'", "'\\'", "'$'", "'$$'", null, null, 
			null, null, null, "'textit'", "'textbf'", "'texttt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CARET", "UNDERSCORE", "LEFT_CURL", "RIGHT_CURL", "SLASH", "DOLLAR", 
			"DOUBLE_DOLLAR", "NEW_LINE", "SPACE", "DIGIT", "CHARACTER", "PUNCTUATION", 
			"ITALICS", "BOLD", "MONOSPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000fW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u00070\b\u0007\u000b"+
		"\u0007\f\u00071\u0001\u0007\u0001\u0007\u0001\b\u0004\b7\b\b\u000b\b\f"+
		"\b8\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0004\u0002\u0000\n\n\r\r\u0001\u0000  \u0002"+
		"\u0000AZaz\u0005\u0000!#\'/:@``||X\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000"+
		"\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000"+
		"\u000b)\u0001\u0000\u0000\u0000\r+\u0001\u0000\u0000\u0000\u000f/\u0001"+
		"\u0000\u0000\u0000\u00116\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000"+
		"\u0000\u0015>\u0001\u0000\u0000\u0000\u0017@\u0001\u0000\u0000\u0000\u0019"+
		"B\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dP\u0001"+
		"\u0000\u0000\u0000\u001f \u0005^\u0000\u0000 \u0002\u0001\u0000\u0000"+
		"\u0000!\"\u0005_\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005{"+
		"\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005}\u0000\u0000&\b\u0001"+
		"\u0000\u0000\u0000\'(\u0005\\\u0000\u0000(\n\u0001\u0000\u0000\u0000)"+
		"*\u0005$\u0000\u0000*\f\u0001\u0000\u0000\u0000+,\u0005$\u0000\u0000,"+
		"-\u0005$\u0000\u0000-\u000e\u0001\u0000\u0000\u0000.0\u0007\u0000\u0000"+
		"\u0000/.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0006"+
		"\u0007\u0000\u00004\u0010\u0001\u0000\u0000\u000057\u0007\u0001\u0000"+
		"\u000065\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0006"+
		"\b\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u000209\u0000=\u0014\u0001"+
		"\u0000\u0000\u0000>?\u0007\u0002\u0000\u0000?\u0016\u0001\u0000\u0000"+
		"\u0000@A\u0007\u0003\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BC\u0005"+
		"t\u0000\u0000CD\u0005e\u0000\u0000DE\u0005x\u0000\u0000EF\u0005t\u0000"+
		"\u0000FG\u0005i\u0000\u0000GH\u0005t\u0000\u0000H\u001a\u0001\u0000\u0000"+
		"\u0000IJ\u0005t\u0000\u0000JK\u0005e\u0000\u0000KL\u0005x\u0000\u0000"+
		"LM\u0005t\u0000\u0000MN\u0005b\u0000\u0000NO\u0005f\u0000\u0000O\u001c"+
		"\u0001\u0000\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005e\u0000\u0000RS\u0005"+
		"x\u0000\u0000ST\u0005t\u0000\u0000TU\u0005t\u0000\u0000UV\u0005t\u0000"+
		"\u0000V\u001e\u0001\u0000\u0000\u0000\u0003\u000018\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}