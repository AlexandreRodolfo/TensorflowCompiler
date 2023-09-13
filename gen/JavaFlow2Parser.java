// Generated from JavaFlow2.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaFlow2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUM=12, OP=13, ESPACOS=14;
	public static final int
		RULE_program = 0, RULE_model = 1, RULE_layer = 2, RULE_exp = 3, RULE_tensor = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "model", "layer", "exp", "tensor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'gmax'", "'max'", "'gavg'", "'avg'", "'dense'", 
			"'norm'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUM", "OP", "ESPACOS"
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
	public String getGrammarFileName() { return "JavaFlow2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaFlow2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaFlow2Parser.EOF, 0); }
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
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitProgram(this);
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
		public TerminalNode ID() { return getToken(JavaFlow2Parser.ID, 0); }
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
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitModel(this);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalMaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterGlobalMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitGlobalMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DenseContext extends LayerContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DenseContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterDense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitDense(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AvgContext extends LayerContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AvgContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitAvg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxContext extends LayerContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MaxContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitMax(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalizationContext extends LayerContext {
		public NormalizationContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterNormalization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitNormalization(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActivationContext extends LayerContext {
		public TerminalNode ID() { return getToken(JavaFlow2Parser.ID, 0); }
		public ActivationContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterActivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitActivation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalAvgContext extends LayerContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GlobalAvgContext(LayerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterGlobalAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitGlobalAvg(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layer);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new GlobalMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__3);
				setState(32);
				exp(0);
				}
				break;
			case T__4:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(T__4);
				setState(34);
				exp(0);
				}
				break;
			case T__5:
				_localctx = new GlobalAvgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(T__5);
				setState(36);
				exp(0);
				}
				break;
			case T__6:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				match(T__6);
				setState(38);
				exp(0);
				}
				break;
			case T__7:
				_localctx = new DenseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(T__7);
				setState(40);
				exp(0);
				}
				break;
			case T__8:
				_localctx = new NormalizationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				match(T__8);
				}
				break;
			case ID:
				_localctx = new ActivationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
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
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitGroup(this);
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
		public TerminalNode OP() { return getToken(JavaFlow2Parser.OP, 0); }
		public OpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitOp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstContext extends ExpContext {
		public TensorContext tensor() {
			return getRuleContext(TensorContext.class,0);
		}
		public ConstContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitConst(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(46);
				tensor();
				}
				break;
			case T__0:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				match(T__0);
				setState(48);
				exp(0);
				setState(49);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					match(OP);
					setState(55);
					exp(3);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TensorContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(JavaFlow2Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(JavaFlow2Parser.NUM, i);
		}
		public TensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tensor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).enterTensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaFlow2Listener ) ((JavaFlow2Listener)listener).exitTensor(this);
		}
	}

	public final TensorContext tensor() throws RecognitionException {
		TensorContext _localctx = new TensorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tensor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(NUM);
					setState(62);
					match(T__9);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(68);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
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
		"\u0004\u0001\u000eG\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004@\b\u0004\n\u0004\f\u0004C\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0001\u0006\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000L\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0012\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u00063\u0001"+
		"\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001\u0000"+
		"\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000"+
		"\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u000b"+
		"\u0000\u0000\u0013\u0019\u0005\u0001\u0000\u0000\u0014\u0015\u0003\u0004"+
		"\u0002\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0018\u0001\u0000"+
		"\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0003"+
		"\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0005\u0004\u0000"+
		"\u0000 ,\u0003\u0006\u0003\u0000!\"\u0005\u0005\u0000\u0000\",\u0003\u0006"+
		"\u0003\u0000#$\u0005\u0006\u0000\u0000$,\u0003\u0006\u0003\u0000%&\u0005"+
		"\u0007\u0000\u0000&,\u0003\u0006\u0003\u0000\'(\u0005\b\u0000\u0000(,"+
		"\u0003\u0006\u0003\u0000),\u0005\t\u0000\u0000*,\u0005\u000b\u0000\u0000"+
		"+\u001f\u0001\u0000\u0000\u0000+!\u0001\u0000\u0000\u0000+#\u0001\u0000"+
		"\u0000\u0000+%\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0005\u0001\u0000\u0000"+
		"\u0000-.\u0006\u0003\uffff\uffff\u0000.4\u0003\b\u0004\u0000/0\u0005\u0001"+
		"\u0000\u000001\u0003\u0006\u0003\u000012\u0005\u0003\u0000\u000024\u0001"+
		"\u0000\u0000\u00003-\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u0000"+
		"4:\u0001\u0000\u0000\u000056\n\u0002\u0000\u000067\u0005\r\u0000\u0000"+
		"79\u0003\u0006\u0003\u000385\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0007\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\f\u0000\u0000>@\u0005"+
		"\n\u0000\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0005\f\u0000\u0000E\t\u0001\u0000\u0000"+
		"\u0000\u0006\r\u0019+3:A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}