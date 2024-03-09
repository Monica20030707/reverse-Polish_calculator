// Generated from /Users/phuongthuynguyendang/Desktop/Winter 2024/CS320/Week 5/ANTLR/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, NUMBER=9, 
		INTEGER=10, FLOAT=11, SCIENTIFIC=12, FUNCTION=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEWLINE", "NUMBER", 
			"INTEGER", "FLOAT", "SCIENTIFIC", "FUNCTION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NEWLINE", "NUMBER", 
			"INTEGER", "FLOAT", "SCIENTIFIC", "FUNCTION"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\u0004\u0000\rz\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004"+
		"\u0007+\b\u0007\u000b\u0007\f\u0007,\u0001\b\u0001\b\u0001\b\u0003\b2"+
		"\b\b\u0001\t\u0004\t5\b\t\u000b\t\f\t6\u0001\n\u0004\n:\b\n\u000b\n\f"+
		"\n;\u0001\n\u0001\n\u0005\n@\b\n\n\n\f\nC\t\n\u0001\u000b\u0004\u000b"+
		"F\b\u000b\u000b\u000b\f\u000bG\u0001\u000b\u0001\u000b\u0003\u000bL\b"+
		"\u000b\u0001\u000b\u0004\u000bO\b\u000b\u000b\u000b\f\u000bP\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\fy\b\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u0001\u0000\u0004\u0002\u0000\n\n\r\r\u0001\u000009\u0002"+
		"\u0000EEee\u0002\u0000++--\u008c\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001"+
		"\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001"+
		"\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000"+
		"\u0000\u000b%\u0001\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f"+
		"*\u0001\u0000\u0000\u0000\u00111\u0001\u0000\u0000\u0000\u00134\u0001"+
		"\u0000\u0000\u0000\u00159\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000"+
		"\u0000\u0019x\u0001\u0000\u0000\u0000\u001b\u001c\u0005^\u0000\u0000\u001c"+
		"\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005*\u0000\u0000\u001e\u0004"+
		"\u0001\u0000\u0000\u0000\u001f \u0005/\u0000\u0000 \u0006\u0001\u0000"+
		"\u0000\u0000!\"\u0005+\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005"+
		"-\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000&\f\u0001"+
		"\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u000e\u0001\u0000\u0000\u0000"+
		")+\u0007\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0010\u0001"+
		"\u0000\u0000\u0000.2\u0003\u0013\t\u0000/2\u0003\u0015\n\u000002\u0003"+
		"\u0017\u000b\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0012\u0001\u0000\u0000\u000035\u0007\u0001"+
		"\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0014\u0001\u0000\u0000"+
		"\u00008:\u0007\u0001\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=A\u0005.\u0000\u0000>@\u0007\u0001\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000B\u0016\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DF\u0007\u0001\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0007\u0002\u0000\u0000JL\u0007\u0003\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000MO\u0007\u0001\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\u0018\u0001\u0000\u0000\u0000RS\u0005l\u0000\u0000ST\u0005o\u0000\u0000"+
		"Ty\u0005g\u0000\u0000UV\u0005l\u0000\u0000Vy\u0005n\u0000\u0000WX\u0005"+
		"s\u0000\u0000XY\u0005i\u0000\u0000Yy\u0005n\u0000\u0000Z[\u0005c\u0000"+
		"\u0000[\\\u0005o\u0000\u0000\\y\u0005s\u0000\u0000]^\u0005t\u0000\u0000"+
		"^_\u0005a\u0000\u0000_y\u0005n\u0000\u0000`a\u0005a\u0000\u0000ab\u0005"+
		"s\u0000\u0000bc\u0005i\u0000\u0000cy\u0005n\u0000\u0000de\u0005a\u0000"+
		"\u0000ef\u0005c\u0000\u0000fg\u0005o\u0000\u0000gy\u0005s\u0000\u0000"+
		"hi\u0005a\u0000\u0000ij\u0005t\u0000\u0000jk\u0005a\u0000\u0000ky\u0005"+
		"n\u0000\u0000lm\u0005s\u0000\u0000mn\u0005i\u0000\u0000no\u0005n\u0000"+
		"\u0000oy\u0005h\u0000\u0000pq\u0005c\u0000\u0000qr\u0005o\u0000\u0000"+
		"rs\u0005s\u0000\u0000sy\u0005h\u0000\u0000tu\u0005t\u0000\u0000uv\u0005"+
		"a\u0000\u0000vw\u0005n\u0000\u0000wy\u0005h\u0000\u0000xR\u0001\u0000"+
		"\u0000\u0000xU\u0001\u0000\u0000\u0000xW\u0001\u0000\u0000\u0000xZ\u0001"+
		"\u0000\u0000\u0000x]\u0001\u0000\u0000\u0000x`\u0001\u0000\u0000\u0000"+
		"xd\u0001\u0000\u0000\u0000xh\u0001\u0000\u0000\u0000xl\u0001\u0000\u0000"+
		"\u0000xp\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000y\u001a\u0001"+
		"\u0000\u0000\u0000\n\u0000,16;AGKPx\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}