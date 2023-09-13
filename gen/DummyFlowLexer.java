// Generated from DummyFlow.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DummyFlowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, E_OP=12, T_OP=13, ESPACOS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "NUM", "E_OP", "T_OP", "ESPACOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'gmax'", "'gavg'", "'max'", "'avg'", "'norm'", 
			"'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"E_OP", "T_OP", "ESPACOS"
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


	public DummyFlowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DummyFlow.g4"; }

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
		"\u0004\u0000\u000e[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0004\t>\b\t\u000b"+
		"\t\f\t?\u0001\n\u0004\nC\b\n\u000b\n\f\nD\u0001\n\u0001\n\u0004\nI\b\n"+
		"\u000b\n\f\nJ\u0003\nM\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\fV\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0000"+
		"\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000009\u0003\u0000*+-"+
		"-//\u0002\u0000&&@@\u0002\u0000\n\n  `\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003\u001f"+
		"\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001\u0000"+
		"\u0000\u0000\t(\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000\u0000"+
		"\r1\u0001\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u0011:\u0001"+
		"\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000"+
		"\u0000\u0017N\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001b"+
		"W\u0001\u0000\u0000\u0000\u001d\u001e\u0005(\u0000\u0000\u001e\u0002\u0001"+
		"\u0000\u0000\u0000\u001f \u0005,\u0000\u0000 \u0004\u0001\u0000\u0000"+
		"\u0000!\"\u0005)\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$\u0005g"+
		"\u0000\u0000$%\u0005m\u0000\u0000%&\u0005a\u0000\u0000&\'\u0005x\u0000"+
		"\u0000\'\b\u0001\u0000\u0000\u0000()\u0005g\u0000\u0000)*\u0005a\u0000"+
		"\u0000*+\u0005v\u0000\u0000+,\u0005g\u0000\u0000,\n\u0001\u0000\u0000"+
		"\u0000-.\u0005m\u0000\u0000./\u0005a\u0000\u0000/0\u0005x\u0000\u0000"+
		"0\f\u0001\u0000\u0000\u000012\u0005a\u0000\u000023\u0005v\u0000\u0000"+
		"34\u0005g\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005n\u0000\u0000"+
		"67\u0005o\u0000\u000078\u0005r\u0000\u000089\u0005m\u0000\u00009\u0010"+
		"\u0001\u0000\u0000\u0000:;\u0005x\u0000\u0000;\u0012\u0001\u0000\u0000"+
		"\u0000<>\u0007\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0014"+
		"\u0001\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EL\u0001\u0000\u0000\u0000FH\u0005.\u0000\u0000GI\u0007\u0001"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"LF\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NO\u0007\u0002\u0000\u0000O\u0018\u0001\u0000\u0000\u0000"+
		"PQ\u0005~\u0000\u0000QV\u0005>\u0000\u0000RS\u0005-\u0000\u0000SV\u0005"+
		">\u0000\u0000TV\u0007\u0003\u0000\u0000UP\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u001a\u0001\u0000\u0000"+
		"\u0000WX\u0007\u0004\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\r\u0000"+
		"\u0000Z\u001c\u0001\u0000\u0000\u0000\u0006\u0000?DJLU\u0001\u0006\u0000"+
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