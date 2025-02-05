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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, NUM=9, E_OP=10, 
		T_OP=11, ESPACOS=12, COMENTARIOS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ID", "NUM", 
			"E_OP", "T_OP", "ESPACOS", "COMENTARIOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'max'", "'avg'", "'drop'", "'norm'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "NUM", "E_OP", 
			"T_OP", "ESPACOS", "COMENTARIOS"
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
		"\u0004\u0000\r[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u00075\b\u0007\u000b"+
		"\u0007\f\u00076\u0001\b\u0004\b:\b\b\u000b\b\f\b;\u0001\b\u0001\b\u0004"+
		"\b@\b\b\u000b\b\f\bA\u0003\bD\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nM\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0005\fU\b\f\n\f\f\fX\t\f\u0001\f\u0001\f\u0000"+
		"\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0001\u000009\u0003\u0000*+--//\u0002\u0000"+
		"&&@@\u0002\u0000\n\n  \u0002\u0000\n\n\r\ra\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001"+
		"\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005"+
		"\u001f\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t\'\u0001"+
		"\u0000\u0000\u0000\u000b,\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000"+
		"\u0000\u000f4\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000\u0000\u0013"+
		"E\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017N\u0001"+
		"\u0000\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001b\u001c\u0005(\u0000"+
		"\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005)\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005m\u0000\u0000 !\u0005"+
		"a\u0000\u0000!\"\u0005x\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000#$"+
		"\u0005a\u0000\u0000$%\u0005v\u0000\u0000%&\u0005g\u0000\u0000&\b\u0001"+
		"\u0000\u0000\u0000\'(\u0005d\u0000\u0000()\u0005r\u0000\u0000)*\u0005"+
		"o\u0000\u0000*+\u0005p\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005"+
		"n\u0000\u0000-.\u0005o\u0000\u0000./\u0005r\u0000\u0000/0\u0005m\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000012\u0005x\u0000\u00002\u000e\u0001\u0000"+
		"\u0000\u000035\u0007\u0000\u0000\u000043\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7\u0010\u0001\u0000\u0000\u00008:\u0007\u0001\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<C\u0001\u0000\u0000\u0000=?\u0005.\u0000\u0000>@\u0007"+
		"\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0012\u0001"+
		"\u0000\u0000\u0000EF\u0007\u0002\u0000\u0000F\u0014\u0001\u0000\u0000"+
		"\u0000GH\u0005~\u0000\u0000HM\u0005>\u0000\u0000IJ\u0005-\u0000\u0000"+
		"JM\u0005>\u0000\u0000KM\u0007\u0003\u0000\u0000LG\u0001\u0000\u0000\u0000"+
		"LI\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NO\u0007\u0004\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0006"+
		"\u000b\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RV\u0005#\u0000\u0000"+
		"SU\b\u0005\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0006\f\u0000\u0000Z\u001a\u0001\u0000"+
		"\u0000\u0000\u0007\u00006;ACLV\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}