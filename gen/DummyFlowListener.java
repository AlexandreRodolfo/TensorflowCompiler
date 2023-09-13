// Generated from DummyFlow.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DummyFlowParser}.
 */
public interface DummyFlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DummyFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DummyFlowParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyFlowParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DummyFlowParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyFlowParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(DummyFlowParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyFlowParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(DummyFlowParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMax(DummyFlowParser.GlobalMaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMax(DummyFlowParser.GlobalMaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAvg(DummyFlowParser.GlobalAvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAvg(DummyFlowParser.GlobalAvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Max}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterMax(DummyFlowParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Max}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitMax(DummyFlowParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterAvg(DummyFlowParser.AvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitAvg(DummyFlowParser.AvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterNormalization(DummyFlowParser.NormalizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitNormalization(DummyFlowParser.NormalizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterDense(DummyFlowParser.DenseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitDense(DummyFlowParser.DenseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Activation}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterActivation(DummyFlowParser.ActivationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Activation}
	 * labeled alternative in {@link DummyFlowParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitActivation(DummyFlowParser.ActivationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementWise}
	 * labeled alternative in {@link DummyFlowParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterElementWise(DummyFlowParser.ElementWiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementWise}
	 * labeled alternative in {@link DummyFlowParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitElementWise(DummyFlowParser.ElementWiseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TensorWise}
	 * labeled alternative in {@link DummyFlowParser#fun}.
	 * @param ctx the parse tree
	 */
	void enterTensorWise(DummyFlowParser.TensorWiseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TensorWise}
	 * labeled alternative in {@link DummyFlowParser#fun}.
	 * @param ctx the parse tree
	 */
	void exitTensorWise(DummyFlowParser.TensorWiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyFlowParser#tensor}.
	 * @param ctx the parse tree
	 */
	void enterTensor(DummyFlowParser.TensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyFlowParser#tensor}.
	 * @param ctx the parse tree
	 */
	void exitTensor(DummyFlowParser.TensorContext ctx);
}