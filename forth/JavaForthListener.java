// Generated from JavaForth.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaForthParser}.
 */
public interface JavaForthListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaForthParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaForthParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(JavaForthParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(JavaForthParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(JavaForthParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(JavaForthParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaForthParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaForthParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaForthParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaForthParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaForthParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaForthParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaForthParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaForthParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaForthParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaForthParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaForthParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaForthParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaForthParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaForthParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaForthParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaForthParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaForthParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaForthParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaForthParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaForthParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaForthParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaForthParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaForthParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaForthParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaForthParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaForthParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaForthParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaForthParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaForthParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaForthParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaForthParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaForthParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaForthParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaForthParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaForthParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaForthParser.ArgumentsContext ctx);
}