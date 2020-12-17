// Generated from .\Main.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MainParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MainParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#any_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAny_declaration(MainParser.Any_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#any_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAny_declaration(MainParser.Any_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assigned_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssigned_expression(MainParser.Assigned_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assigned_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssigned_expression(MainParser.Assigned_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#variable_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_vartype(MainParser.Variable_declaration_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_vartype(MainParser.Variable_declaration_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#variable_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration_no_vartype(MainParser.Variable_declaration_no_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration_no_vartype(MainParser.Variable_declaration_no_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_size}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(MainParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_size}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(MainParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void enterArray_variable(MainParser.Array_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_variable}.
	 * @param ctx the parse tree
	 */
	void exitArray_variable(MainParser.Array_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration_vartype(MainParser.Array_declaration_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_declaration_vartype}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration_vartype(MainParser.Array_declaration_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#array_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration_no_vartype(MainParser.Array_declaration_no_vartypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_declaration_no_vartype}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration_no_vartype(MainParser.Array_declaration_no_vartypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void enterScan_statement(MainParser.Scan_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#scan_statement}.
	 * @param ctx the parse tree
	 */
	void exitScan_statement(MainParser.Scan_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#display_message_parameter}.
	 * @param ctx the parse tree
	 */
	void enterDisplay_message_parameter(MainParser.Display_message_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#display_message_parameter}.
	 * @param ctx the parse tree
	 */
	void exitDisplay_message_parameter(MainParser.Display_message_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_parameter}.
	 * @param ctx the parse tree
	 */
	void enterValue_parameter(MainParser.Value_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_parameter}.
	 * @param ctx the parse tree
	 */
	void exitValue_parameter(MainParser.Value_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(MainParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(MainParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MainParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MainParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#sub_expression}.
	 * @param ctx the parse tree
	 */
	void enterSub_expression(MainParser.Sub_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#sub_expression}.
	 * @param ctx the parse tree
	 */
	void exitSub_expression(MainParser.Sub_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression(MainParser.Value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression(MainParser.Value_expressionContext ctx);
}