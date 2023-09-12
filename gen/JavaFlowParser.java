// Generated from JavaFlow.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaFlowParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, NUM=26, OP=27, ESPACOS=28;
	public static final int
		RULE_program = 0, RULE_model = 1, RULE_layer = 2, RULE_tensor = 3, RULE_exp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "model", "layer", "tensor", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'gmax'", "'max'", "'gavg'", "'avg'", "'conv'", 
			"'deconv'", "'flatten'", "'reshape'", "'resize'", "'dense'", "'iden'", 
			"'norm'", "'elu'", "'exp'", "'gelu'", "'sigmoid'", "'linear'", "'softmax'", 
			"'tanh'", "'relu'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "NUM", "OP", "ESPACOS"
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
	public String getGrammarFileName() { return "JavaFlow.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaFlowParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaFlowParser.EOF, 0); }
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
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitProgram(this);
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
		public TerminalNode ID() { return getToken(JavaFlowParser.ID, 0); }
		public List<TensorContext> tensor() {
			return getRuleContexts(TensorContext.class);
		}
		public TensorContext tensor(int i) {
			return getRuleContext(TensorContext.class,i);
		}
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
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
			setState(19);
			match(T__0);
			setState(20);
			tensor();
			setState(21);
			match(T__1);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16777200L) != 0)) {
				{
				{
				setState(22);
				layer();
				setState(23);
				match(T__1);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			tensor();
			setState(31);
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
	public static class TanhContext extends LayerContext {
		public TanhContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterTanh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitTanh(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResizingContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public ResizingContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterResizing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitResizing(this);
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
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeluContext extends LayerContext {
		public GeluContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterGelu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitGelu(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FlattenContext extends LayerContext {
		public FlattenContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterFlatten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitFlatten(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExponentialContext extends LayerContext {
		public ExponentialContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitExponential(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeConvContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public DeConvContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterDeConv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitDeConv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinearContext extends LayerContext {
		public LinearContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterLinear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitLinear(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EluContext extends LayerContext {
		public EluContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterElu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitElu(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalMaxContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public GlobalMaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterGlobalMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitGlobalMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DenseContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public DenseContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterDense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitDense(this);
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
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitAvg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReshapeContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public ReshapeContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterReshape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitReshape(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SoftmaxContext extends LayerContext {
		public SoftmaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterSoftmax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitSoftmax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConvContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public ConvContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterConv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitConv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalizationContext extends LayerContext {
		public NormalizationContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterNormalization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitNormalization(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReluContext extends LayerContext {
		public ReluContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterRelu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitRelu(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentityContext extends LayerContext {
		public IdentityContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterIdentity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitIdentity(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAvgContext extends LayerContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public GlobalAvgContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterGlobalAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitGlobalAvg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SigmoidContext extends LayerContext {
		public SigmoidContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterSigmoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitSigmoid(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layer);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new GlobalMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__3);
				setState(34);
				tensor();
				}
				break;
			case T__4:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__4);
				setState(36);
				tensor();
				}
				break;
			case T__5:
				_localctx = new GlobalAvgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(T__5);
				setState(38);
				tensor();
				}
				break;
			case T__6:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(T__6);
				setState(40);
				tensor();
				}
				break;
			case T__7:
				_localctx = new ConvContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				match(T__7);
				setState(42);
				tensor();
				}
				break;
			case T__8:
				_localctx = new DeConvContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				match(T__8);
				setState(44);
				tensor();
				}
				break;
			case T__9:
				_localctx = new FlattenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(45);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new ReshapeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(46);
				match(T__10);
				setState(47);
				tensor();
				}
				break;
			case T__11:
				_localctx = new ResizingContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				match(T__11);
				setState(49);
				tensor();
				}
				break;
			case T__12:
				_localctx = new DenseContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(50);
				match(T__12);
				setState(51);
				tensor();
				}
				break;
			case T__13:
				_localctx = new IdentityContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(52);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new NormalizationContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(53);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new EluContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(54);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ExponentialContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(55);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new GeluContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(56);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new SigmoidContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(57);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new LinearContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(58);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new SoftmaxContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(59);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new TanhContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(60);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new ReluContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(61);
				match(T__22);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterTensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitTensor(this);
		}
	}

	public final TensorContext tensor() throws RecognitionException {
		TensorContext _localctx = new TensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tensor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					exp(0);
					setState(65);
					match(T__23);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(72);
			exp(0);
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
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GroupContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitGroup(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode OP() { return getToken(JavaFlowParser.OP, 0); }
		public OpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitOp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ExpContext {
		public TerminalNode NUM() { return getToken(JavaFlowParser.NUM, 0); }
		public ConstContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlowListener ) ((JavaFlowListener)listener).exitConst(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(NUM);
				}
				break;
			case T__0:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(T__0);
				setState(77);
				exp(0);
				setState(78);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					match(OP);
					setState(84);
					exp(3);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003D\b\u0003\n\u0003\f\u0003G\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004Y\t\u0004\u0001\u0004\u0000"+
		"\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000m\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000"+
		"\u0000\u0006E\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\n\f\u0003"+
		"\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000"+
		"\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000"+
		"\u0012\u0013\u0005\u0019\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000"+
		"\u0014\u0015\u0003\u0006\u0003\u0000\u0015\u001b\u0005\u0002\u0000\u0000"+
		"\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0002\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000"+
		"\u001f \u0005\u0003\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005"+
		"\u0004\u0000\u0000\"?\u0003\u0006\u0003\u0000#$\u0005\u0005\u0000\u0000"+
		"$?\u0003\u0006\u0003\u0000%&\u0005\u0006\u0000\u0000&?\u0003\u0006\u0003"+
		"\u0000\'(\u0005\u0007\u0000\u0000(?\u0003\u0006\u0003\u0000)*\u0005\b"+
		"\u0000\u0000*?\u0003\u0006\u0003\u0000+,\u0005\t\u0000\u0000,?\u0003\u0006"+
		"\u0003\u0000-?\u0005\n\u0000\u0000./\u0005\u000b\u0000\u0000/?\u0003\u0006"+
		"\u0003\u000001\u0005\f\u0000\u00001?\u0003\u0006\u0003\u000023\u0005\r"+
		"\u0000\u00003?\u0003\u0006\u0003\u00004?\u0005\u000e\u0000\u00005?\u0005"+
		"\u000f\u0000\u00006?\u0005\u0010\u0000\u00007?\u0005\u0011\u0000\u0000"+
		"8?\u0005\u0012\u0000\u00009?\u0005\u0013\u0000\u0000:?\u0005\u0014\u0000"+
		"\u0000;?\u0005\u0015\u0000\u0000<?\u0005\u0016\u0000\u0000=?\u0005\u0017"+
		"\u0000\u0000>!\u0001\u0000\u0000\u0000>#\u0001\u0000\u0000\u0000>%\u0001"+
		"\u0000\u0000\u0000>\'\u0001\u0000\u0000\u0000>)\u0001\u0000\u0000\u0000"+
		">+\u0001\u0000\u0000\u0000>-\u0001\u0000\u0000\u0000>.\u0001\u0000\u0000"+
		"\u0000>0\u0001\u0000\u0000\u0000>2\u0001\u0000\u0000\u0000>4\u0001\u0000"+
		"\u0000\u0000>5\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001"+
		"\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000>9\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0003"+
		"\b\u0004\u0000AB\u0005\u0018\u0000\u0000BD\u0001\u0000\u0000\u0000C@\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0003\b\u0004\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0006\u0004"+
		"\uffff\uffff\u0000KQ\u0005\u001a\u0000\u0000LM\u0005\u0001\u0000\u0000"+
		"MN\u0003\b\u0004\u0000NO\u0005\u0003\u0000\u0000OQ\u0001\u0000\u0000\u0000"+
		"PJ\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000QW\u0001\u0000\u0000"+
		"\u0000RS\n\u0002\u0000\u0000ST\u0005\u001b\u0000\u0000TV\u0003\b\u0004"+
		"\u0003UR\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000\u0006\r\u001b>EPW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}