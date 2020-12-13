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
	 * Enter a parse tree produced by {@link MainParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(MainParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(MainParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#other_white_space}.
	 * @param ctx the parse tree
	 */
	void enterOther_white_space(MainParser.Other_white_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#other_white_space}.
	 * @param ctx the parse tree
	 */
	void exitOther_white_space(MainParser.Other_white_spaceContext ctx);
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
	 * Enter a parse tree produced by {@link MainParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(MainParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(MainParser.CommentContext ctx);
}