// Generated from Main.g4 by ANTLR 4.9
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
	 * Enter a parse tree produced by {@link MainParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void enterVariable_type(MainParser.Variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#variable_type}.
	 * @param ctx the parse tree
	 */
	void exitVariable_type(MainParser.Variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MainParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MainParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MainParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MainParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MainParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MainParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#white_space}.
	 * @param ctx the parse tree
	 */
	void enterWhite_space(MainParser.White_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#white_space}.
	 * @param ctx the parse tree
	 */
	void exitWhite_space(MainParser.White_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#simple_punctuations}.
	 * @param ctx the parse tree
	 */
	void enterSimple_punctuations(MainParser.Simple_punctuationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#simple_punctuations}.
	 * @param ctx the parse tree
	 */
	void exitSimple_punctuations(MainParser.Simple_punctuationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#first_operators}.
	 * @param ctx the parse tree
	 */
	void enterFirst_operators(MainParser.First_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#first_operators}.
	 * @param ctx the parse tree
	 */
	void exitFirst_operators(MainParser.First_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#second_operators}.
	 * @param ctx the parse tree
	 */
	void enterSecond_operators(MainParser.Second_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#second_operators}.
	 * @param ctx the parse tree
	 */
	void exitSecond_operators(MainParser.Second_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(MainParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(MainParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void enterLogical_operators(MainParser.Logical_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#logical_operators}.
	 * @param ctx the parse tree
	 */
	void exitLogical_operators(MainParser.Logical_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operators(MainParser.Relational_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#relational_operators}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operators(MainParser.Relational_operatorsContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void enterArray_assign(MainParser.Array_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#array_assign}.
	 * @param ctx the parse tree
	 */
	void exitArray_assign(MainParser.Array_assignContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression(MainParser.Value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression(MainParser.Value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void enterComparison_statement(MainParser.Comparison_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#comparison_statement}.
	 * @param ctx the parse tree
	 */
	void exitComparison_statement(MainParser.Comparison_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(MainParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(MainParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#value_comparison}.
	 * @param ctx the parse tree
	 */
	void enterValue_comparison(MainParser.Value_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#value_comparison}.
	 * @param ctx the parse tree
	 */
	void exitValue_comparison(MainParser.Value_comparisonContext ctx);
}