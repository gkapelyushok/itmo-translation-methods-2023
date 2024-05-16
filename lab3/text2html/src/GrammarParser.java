// Generated from ../grammar/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CARET=1, UNDERSCORE=2, LEFT_CURL=3, RIGHT_CURL=4, SLASH=5, DOLLAR=6, DOUBLE_DOLLAR=7, 
		NEW_LINE=8, SPACE=9, DIGIT=10, CHARACTER=11, PUNCTUATION=12, ITALICS=13, 
		BOLD=14, MONOSPACE=15;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_eq1 = 2, RULE_eq2 = 3, RULE_math_command = 4, 
		RULE_expr = 5, RULE_text_command = 6, RULE_text = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "line", "eq1", "eq2", "math_command", "expr", "text_command", 
			"text"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7392L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public Eq1Context eq1() {
			return getRuleContext(Eq1Context.class,0);
		}
		public Eq2Context eq2() {
			return getRuleContext(Eq2Context.class,0);
		}
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public Text_commandContext text_command() {
			return getRuleContext(Text_commandContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			int _alt;
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				eq1();
				}
				break;
			case DOUBLE_DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				eq2();
				}
				break;
			case DIGIT:
			case CHARACTER:
			case PUNCTUATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(23);
						text();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(26); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				text_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Eq1Context extends ParserRuleContext {
		public List<TerminalNode> DOLLAR() { return getTokens(GrammarParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(GrammarParser.DOLLAR, i);
		}
		public List<Math_commandContext> math_command() {
			return getRuleContexts(Math_commandContext.class);
		}
		public Math_commandContext math_command(int i) {
			return getRuleContext(Math_commandContext.class,i);
		}
		public Eq1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq1(this);
		}
	}

	public final Eq1Context eq1() throws RecognitionException {
		Eq1Context _localctx = new Eq1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_eq1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DOLLAR);
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				math_command();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7174L) != 0) );
			setState(37);
			match(DOLLAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Eq2Context extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_DOLLAR() { return getTokens(GrammarParser.DOUBLE_DOLLAR); }
		public TerminalNode DOUBLE_DOLLAR(int i) {
			return getToken(GrammarParser.DOUBLE_DOLLAR, i);
		}
		public List<Math_commandContext> math_command() {
			return getRuleContexts(Math_commandContext.class);
		}
		public Math_commandContext math_command(int i) {
			return getRuleContext(Math_commandContext.class,i);
		}
		public Eq2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEq2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEq2(this);
		}
	}

	public final Eq2Context eq2() throws RecognitionException {
		Eq2Context _localctx = new Eq2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_eq2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DOUBLE_DOLLAR);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				math_command();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7174L) != 0) );
			setState(45);
			match(DOUBLE_DOLLAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Math_commandContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(GrammarParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(GrammarParser.CHARACTER, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(GrammarParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(GrammarParser.PUNCTUATION, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(GrammarParser.UNDERSCORE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CARET() { return getToken(GrammarParser.CARET, 0); }
		public Math_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMath_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMath_command(this);
		}
	}

	public final Math_commandContext math_command() throws RecognitionException {
		Math_commandContext _localctx = new Math_commandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_math_command);
		try {
			int _alt;
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(47);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(50); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(52);
						match(CHARACTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(55); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PUNCTUATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
						match(PUNCTUATION);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				match(UNDERSCORE);
				setState(63);
				expr();
				}
				break;
			case CARET:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(CARET);
				setState(65);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CHARACTER() { return getToken(GrammarParser.CHARACTER, 0); }
		public TerminalNode DIGIT() { return getToken(GrammarParser.DIGIT, 0); }
		public TerminalNode LEFT_CURL() { return getToken(GrammarParser.LEFT_CURL, 0); }
		public TerminalNode RIGHT_CURL() { return getToken(GrammarParser.RIGHT_CURL, 0); }
		public List<Math_commandContext> math_command() {
			return getRuleContexts(Math_commandContext.class);
		}
		public Math_commandContext math_command(int i) {
			return getRuleContext(Math_commandContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CHARACTER);
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(DIGIT);
				}
				break;
			case LEFT_CURL:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(LEFT_CURL);
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(71);
					math_command();
					}
					}
					setState(74); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7174L) != 0) );
				setState(76);
				match(RIGHT_CURL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Text_commandContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(GrammarParser.SLASH, 0); }
		public TerminalNode LEFT_CURL() { return getToken(GrammarParser.LEFT_CURL, 0); }
		public TerminalNode RIGHT_CURL() { return getToken(GrammarParser.RIGHT_CURL, 0); }
		public TerminalNode ITALICS() { return getToken(GrammarParser.ITALICS, 0); }
		public TerminalNode BOLD() { return getToken(GrammarParser.BOLD, 0); }
		public TerminalNode MONOSPACE() { return getToken(GrammarParser.MONOSPACE, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public Text_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterText_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitText_command(this);
		}
	}

	public final Text_commandContext text_command() throws RecognitionException {
		Text_commandContext _localctx = new Text_commandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_text_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SLASH);
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(LEFT_CURL);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) {
				{
				{
				setState(83);
				text();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RIGHT_CURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTER() { return getTokens(GrammarParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(GrammarParser.CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(GrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(GrammarParser.DIGIT, i);
		}
		public List<TerminalNode> PUNCTUATION() { return getTokens(GrammarParser.PUNCTUATION); }
		public TerminalNode PUNCTUATION(int i) {
			return getToken(GrammarParser.PUNCTUATION, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_text);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91);
						match(CHARACTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(96);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(99); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PUNCTUATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						match(PUNCTUATION);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000fm\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0019\b\u0001\u000b\u0001\f\u0001"+
		"\u001a\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\"\b\u0002\u000b\u0002\f\u0002#\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0004\u0003*\b\u0003\u000b\u0003\f\u0003+\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0004\u00041\b\u0004\u000b\u0004\f\u00042\u0001\u0004"+
		"\u0004\u00046\b\u0004\u000b\u0004\f\u00047\u0001\u0004\u0004\u0004;\b"+
		"\u0004\u000b\u0004\f\u0004<\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004C\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0004\u0005I\b\u0005\u000b\u0005\f\u0005J\u0001\u0005\u0001\u0005"+
		"\u0003\u0005O\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0004\u0007]\b\u0007\u000b\u0007\f\u0007^\u0001\u0007\u0004"+
		"\u0007b\b\u0007\u000b\u0007\f\u0007c\u0001\u0007\u0004\u0007g\b\u0007"+
		"\u000b\u0007\f\u0007h\u0003\u0007k\b\u0007\u0001\u0007\u0000\u0000\b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\r\u000f{\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u0004"+
		"\u001f\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\bB\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000\u0000"+
		"\u000ej\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0001\u0001\u0000\u0000\u0000\u0015\u001e\u0003\u0004\u0002\u0000\u0016"+
		"\u001e\u0003\u0006\u0003\u0000\u0017\u0019\u0003\u000e\u0007\u0000\u0018"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001e\u0001\u0000\u0000\u0000\u001c\u001e\u0003\f\u0006\u0000\u001d\u0015"+
		"\u0001\u0000\u0000\u0000\u001d\u0016\u0001\u0000\u0000\u0000\u001d\u0018"+
		"\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0003"+
		"\u0001\u0000\u0000\u0000\u001f!\u0005\u0006\u0000\u0000 \"\u0003\b\u0004"+
		"\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0006\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\')\u0005\u0007\u0000"+
		"\u0000(*\u0003\b\u0004\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0007\u0000\u0000.\u0007\u0001\u0000\u0000\u0000"+
		"/1\u0005\n\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003C\u0001\u0000\u0000"+
		"\u000046\u0005\u000b\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008C\u0001"+
		"\u0000\u0000\u00009;\u0005\f\u0000\u0000:9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=C\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000\u0000?C\u0003\n\u0005\u0000"+
		"@A\u0005\u0001\u0000\u0000AC\u0003\n\u0005\u0000B0\u0001\u0000\u0000\u0000"+
		"B5\u0001\u0000\u0000\u0000B:\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DO\u0005\u000b"+
		"\u0000\u0000EO\u0005\n\u0000\u0000FH\u0005\u0003\u0000\u0000GI\u0003\b"+
		"\u0004\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0004\u0000\u0000MO\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000"+
		"\u0000NE\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000O\u000b\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0005\u0000\u0000QR\u0007\u0000\u0000\u0000"+
		"RV\u0005\u0003\u0000\u0000SU\u0003\u000e\u0007\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0004\u0000\u0000Z\r\u0001\u0000\u0000\u0000[]\u0005\u000b\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_k\u0001\u0000\u0000\u0000`b\u0005\n\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000dk\u0001\u0000\u0000\u0000eg\u0005"+
		"\f\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"j\\\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000"+
		"\u0000k\u000f\u0001\u0000\u0000\u0000\u0010\u0013\u001a\u001d#+27<BJN"+
		"V^chj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}