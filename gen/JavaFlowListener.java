// Generated from JavaFlow.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaFlowParser}.
 */
public interface JavaFlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaFlowParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaFlowParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFlowParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(JavaFlowParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlowParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(JavaFlowParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMax(JavaFlowParser.GlobalMaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMax(JavaFlowParser.GlobalMaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Max}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterMax(JavaFlowParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Max}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitMax(JavaFlowParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAvg(JavaFlowParser.GlobalAvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAvg(JavaFlowParser.GlobalAvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterAvg(JavaFlowParser.AvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitAvg(JavaFlowParser.AvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conv}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterConv(JavaFlowParser.ConvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conv}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitConv(JavaFlowParser.ConvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeConv}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterDeConv(JavaFlowParser.DeConvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeConv}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitDeConv(JavaFlowParser.DeConvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Flatten}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterFlatten(JavaFlowParser.FlattenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Flatten}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitFlatten(JavaFlowParser.FlattenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reshape}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterReshape(JavaFlowParser.ReshapeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reshape}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitReshape(JavaFlowParser.ReshapeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Resizing}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterResizing(JavaFlowParser.ResizingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Resizing}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitResizing(JavaFlowParser.ResizingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterDense(JavaFlowParser.DenseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitDense(JavaFlowParser.DenseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identity}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterIdentity(JavaFlowParser.IdentityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identity}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitIdentity(JavaFlowParser.IdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterNormalization(JavaFlowParser.NormalizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitNormalization(JavaFlowParser.NormalizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Elu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterElu(JavaFlowParser.EluContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Elu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitElu(JavaFlowParser.EluContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterExponential(JavaFlowParser.ExponentialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exponential}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitExponential(JavaFlowParser.ExponentialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Gelu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGelu(JavaFlowParser.GeluContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Gelu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGelu(JavaFlowParser.GeluContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sigmoid}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterSigmoid(JavaFlowParser.SigmoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sigmoid}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitSigmoid(JavaFlowParser.SigmoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Linear}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLinear(JavaFlowParser.LinearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Linear}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLinear(JavaFlowParser.LinearContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Softmax}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterSoftmax(JavaFlowParser.SoftmaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Softmax}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitSoftmax(JavaFlowParser.SoftmaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tanh}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterTanh(JavaFlowParser.TanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tanh}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitTanh(JavaFlowParser.TanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterRelu(JavaFlowParser.ReluContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relu}
	 * labeled alternative in {@link JavaFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitRelu(JavaFlowParser.ReluContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFlowParser#tensor}.
	 * @param ctx the parse tree
	 */
	void enterTensor(JavaFlowParser.TensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlowParser#tensor}.
	 * @param ctx the parse tree
	 */
	void exitTensor(JavaFlowParser.TensorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Group}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGroup(JavaFlowParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGroup(JavaFlowParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp(JavaFlowParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp(JavaFlowParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConst(JavaFlowParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link JavaFlowParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConst(JavaFlowParser.ConstContext ctx);
}