// Generated from DummyFlow.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DummyFlowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, E_OP=12, T_OP=13, ESPACOS=14;
	public static final int
		RULE_program = 0, RULE_model = 1, RULE_layer = 2, RULE_fun = 3, RULE_tensor = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "model", "layer", "fun", "tensor"
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

	@Override
	public String getGrammarFileName() { return "DummyFlow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DummyFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DummyFlowParser.EOF, 0); }
		public List<ModelContext> model() {
			return getRuleContexts(ModelContext.class);
		}
		public ModelContext model(int i) {
			return getRuleContext(ModelContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(10);
				model();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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
	public static class ModelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DummyFlowParser.ID, 0); }
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
			setState(19);
			match(T__0);
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					layer();
					setState(21);
					match(T__1);
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(28);
			layer();
			setState(29);
			match(T__2);
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
	public static class LayerContext extends ParserRuleContext {
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
	 
		public LayerContext() { }
		public void copyFrom(LayerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalMaxContext extends LayerContext {
		public GlobalMaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterGlobalMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitGlobalMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DenseContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public DenseContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterDense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitDense(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AvgContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public AvgContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitAvg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public MaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalizationContext extends LayerContext {
		public NormalizationContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterNormalization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitNormalization(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivationContext extends LayerContext {
		public TerminalNode ID() { return getToken(DummyFlowParser.ID, 0); }
		public ActivationContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterActivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitActivation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAvgContext extends LayerContext {
		public GlobalAvgContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterGlobalAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitGlobalAvg(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layer);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new GlobalMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new GlobalAvgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__5);
				setState(34);
				tensor();
				}
				break;
			case T__6:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				match(T__6);
				setState(36);
				tensor();
				}
				break;
			case T__7:
				_localctx = new NormalizationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				match(T__7);
				}
				break;
			case NUM:
				_localctx = new DenseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				tensor();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==E_OP || _la==T_OP) {
					{
					{
					setState(39);
					fun();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				_localctx = new ActivationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				match(ID);
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
	public static class FunContext extends ParserRuleContext {
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	 
		public FunContext() { }
		public void copyFrom(FunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementWiseContext extends FunContext {
		public TerminalNode E_OP() { return getToken(DummyFlowParser.E_OP, 0); }
		public TerminalNode NUM() { return getToken(DummyFlowParser.NUM, 0); }
		public ElementWiseContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterElementWise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitElementWise(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TensorWiseContext extends FunContext {
		public TerminalNode T_OP() { return getToken(DummyFlowParser.T_OP, 0); }
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public TensorWiseContext(FunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterTensorWise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitTensorWise(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case E_OP:
				_localctx = new ElementWiseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(E_OP);
				setState(49);
				match(NUM);
				}
				break;
			case T_OP:
				_localctx = new TensorWiseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T_OP);
				setState(51);
				tensor();
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
	public static class TensorContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(DummyFlowParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(DummyFlowParser.NUM, i);
		}
		public TensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).enterTensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyFlowListener ) ((DummyFlowListener)listener).exitTensor(this);
		}
	}

	public final TensorContext tensor() throws RecognitionException {
		TensorContext _localctx = new TensorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tensor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(NUM);
					setState(55);
					match(T__8);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(61);
			match(NUM);
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
		"\u0004\u0001\u000e@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002)\b"+
		"\u0002\n\u0002\f\u0002,\t\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0005\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0000E\u0000\r\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000"+
		"\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000"+
		"\b:\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001"+
		"\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001"+
		"\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0005\n\u0000\u0000\u0013"+
		"\u0019\u0005\u0001\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015"+
		"\u0016\u0005\u0002\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017"+
		"\u0014\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e"+
		"\u0003\u0001\u0000\u0000\u0000\u001f/\u0005\u0004\u0000\u0000 /\u0005"+
		"\u0005\u0000\u0000!\"\u0005\u0006\u0000\u0000\"/\u0003\b\u0004\u0000#"+
		"$\u0005\u0007\u0000\u0000$/\u0003\b\u0004\u0000%/\u0005\b\u0000\u0000"+
		"&*\u0003\b\u0004\u0000\')\u0003\u0006\u0003\u0000(\'\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+/\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-/\u0005"+
		"\n\u0000\u0000.\u001f\u0001\u0000\u0000\u0000. \u0001\u0000\u0000\u0000"+
		".!\u0001\u0000\u0000\u0000.#\u0001\u0000\u0000\u0000.%\u0001\u0000\u0000"+
		"\u0000.&\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0005\u0001"+
		"\u0000\u0000\u000001\u0005\f\u0000\u000015\u0005\u000b\u0000\u000023\u0005"+
		"\r\u0000\u000035\u0003\b\u0004\u000040\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u000b\u0000"+
		"\u000079\u0005\t\u0000\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u000b\u0000\u0000>\t\u0001"+
		"\u0000\u0000\u0000\u0006\r\u0019*.4:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}