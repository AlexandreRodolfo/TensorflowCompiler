// Generated from JavaFlow2.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaFlow2Parser}.
 */
public interface JavaFlow2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaFlow2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaFlow2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlow2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaFlow2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFlow2Parser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(JavaFlow2Parser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlow2Parser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(JavaFlow2Parser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalMax(JavaFlow2Parser.GlobalMaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalMax}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalMax(JavaFlow2Parser.GlobalMaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Max}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterMax(JavaFlow2Parser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Max}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitMax(JavaFlow2Parser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterGlobalAvg(JavaFlow2Parser.GlobalAvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalAvg}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitGlobalAvg(JavaFlow2Parser.GlobalAvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterAvg(JavaFlow2Parser.AvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitAvg(JavaFlow2Parser.AvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterDense(JavaFlow2Parser.DenseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Dense}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitDense(JavaFlow2Parser.DenseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterNormalization(JavaFlow2Parser.NormalizationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normalization}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitNormalization(JavaFlow2Parser.NormalizationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Activation}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void enterActivation(JavaFlow2Parser.ActivationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Activation}
	 * labeled alternative in {@link JavaFlow2Parser#layer}.
	 * @param ctx the parse tree
	 */
	void exitActivation(JavaFlow2Parser.ActivationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Group}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGroup(JavaFlow2Parser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Group}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGroup(JavaFlow2Parser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Op}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOp(JavaFlow2Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Op}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOp(JavaFlow2Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConst(JavaFlow2Parser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link JavaFlow2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConst(JavaFlow2Parser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFlow2Parser#tensor}.
	 * @param ctx the parse tree
	 */
	void enterTensor(JavaFlow2Parser.TensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFlow2Parser#tensor}.
	 * @param ctx the parse tree
	 */
	void exitTensor(JavaFlow2Parser.TensorContext ctx);
}