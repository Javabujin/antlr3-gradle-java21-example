// $ANTLR 3.5.3 ArithmeticParser.g 2024-11-03 13:20:44

/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ArithmeticParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLOSEPAREN", "EQUAL", "ID", "INT", 
		"MINUS", "NEWLINE", "OPENPAREN", "PLUS", "STAR", "WS"
	};
	public static final int EOF=-1;
	public static final int CLOSEPAREN=4;
	public static final int EQUAL=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int MINUS=8;
	public static final int NEWLINE=9;
	public static final int OPENPAREN=10;
	public static final int PLUS=11;
	public static final int STAR=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ArithmeticParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ArithmeticParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ArithmeticParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ArithmeticParser.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// ArithmeticParser.g:20:1: prog : ( stat )+ ;
	public final ArithmeticParser.prog_return prog() throws RecognitionException {
		ArithmeticParser.prog_return retval = new ArithmeticParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope stat1 =null;


		try {
			// ArithmeticParser.g:20:5: ( ( stat )+ )
			// ArithmeticParser.g:21:5: ( stat )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// ArithmeticParser.g:21:5: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= INT)||(LA1_0 >= NEWLINE && LA1_0 <= OPENPAREN)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ArithmeticParser.g:22:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog69);
					stat1=stat();
					state._fsp--;

					adaptor.addChild(root_0, stat1.getTree());

					 System.out.println((stat1!=null?((CommonTree)stat1.getTree()):null).toStringTree()); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class stat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stat"
	// ArithmeticParser.g:27:1: stat : ( expr NEWLINE -> expr | ID EQUAL expr NEWLINE -> ^( EQUAL ID expr ) | NEWLINE ->);
	public final ArithmeticParser.stat_return stat() throws RecognitionException {
		ArithmeticParser.stat_return retval = new ArithmeticParser.stat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NEWLINE3=null;
		Token ID4=null;
		Token EQUAL5=null;
		Token NEWLINE7=null;
		Token NEWLINE8=null;
		ParserRuleReturnScope expr2 =null;
		ParserRuleReturnScope expr6 =null;

		CommonTree NEWLINE3_tree=null;
		CommonTree ID4_tree=null;
		CommonTree EQUAL5_tree=null;
		CommonTree NEWLINE7_tree=null;
		CommonTree NEWLINE8_tree=null;
		RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// ArithmeticParser.g:27:5: ( expr NEWLINE -> expr | ID EQUAL expr NEWLINE -> ^( EQUAL ID expr ) | NEWLINE ->)
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
			case OPENPAREN:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==EQUAL) ) {
					alt2=2;
				}
				else if ( ((LA2_2 >= MINUS && LA2_2 <= NEWLINE)||(LA2_2 >= PLUS && LA2_2 <= STAR)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ArithmeticParser.g:28:5: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat105);
					expr2=expr();
					state._fsp--;

					stream_expr.add(expr2.getTree());
					NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat107);  
					stream_NEWLINE.add(NEWLINE3);


					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 28:18: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ArithmeticParser.g:30:7: ID EQUAL expr NEWLINE
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_stat124);  
					stream_ID.add(ID4);

					EQUAL5=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_stat126);  
					stream_EQUAL.add(EQUAL5);

					pushFollow(FOLLOW_expr_in_stat128);
					expr6=expr();
					state._fsp--;

					stream_expr.add(expr6.getTree());
					NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat130);  
					stream_NEWLINE.add(NEWLINE7);


					// AST REWRITE
					// elements: EQUAL, expr, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 30:29: -> ^( EQUAL ID expr )
					{
						// ArithmeticParser.g:30:32: ^( EQUAL ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_EQUAL.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ArithmeticParser.g:32:7: NEWLINE
					{
					NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_stat149);  
					stream_NEWLINE.add(NEWLINE8);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 32:15: ->
					{
						root_0 = null;
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stat"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ArithmeticParser.g:35:1: expr : mulExpr ( ( PLUS ^| MINUS ^) mulExpr )* ;
	public final ArithmeticParser.expr_return expr() throws RecognitionException {
		ArithmeticParser.expr_return retval = new ArithmeticParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PLUS10=null;
		Token MINUS11=null;
		ParserRuleReturnScope mulExpr9 =null;
		ParserRuleReturnScope mulExpr12 =null;

		CommonTree PLUS10_tree=null;
		CommonTree MINUS11_tree=null;

		try {
			// ArithmeticParser.g:35:5: ( mulExpr ( ( PLUS ^| MINUS ^) mulExpr )* )
			// ArithmeticParser.g:36:5: mulExpr ( ( PLUS ^| MINUS ^) mulExpr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mulExpr_in_expr168);
			mulExpr9=mulExpr();
			state._fsp--;

			adaptor.addChild(root_0, mulExpr9.getTree());

			// ArithmeticParser.g:37:5: ( ( PLUS ^| MINUS ^) mulExpr )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ArithmeticParser.g:38:9: ( PLUS ^| MINUS ^) mulExpr
					{
					// ArithmeticParser.g:38:9: ( PLUS ^| MINUS ^)
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==PLUS) ) {
						alt3=1;
					}
					else if ( (LA3_0==MINUS) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ArithmeticParser.g:38:10: PLUS ^
							{
							PLUS10=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr185); 
							PLUS10_tree = (CommonTree)adaptor.create(PLUS10);
							root_0 = (CommonTree)adaptor.becomeRoot(PLUS10_tree, root_0);

							}
							break;
						case 2 :
							// ArithmeticParser.g:38:17: MINUS ^
							{
							MINUS11=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr189); 
							MINUS11_tree = (CommonTree)adaptor.create(MINUS11);
							root_0 = (CommonTree)adaptor.becomeRoot(MINUS11_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mulExpr_in_expr193);
					mulExpr12=mulExpr();
					state._fsp--;

					adaptor.addChild(root_0, mulExpr12.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class mulExpr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mulExpr"
	// ArithmeticParser.g:42:1: mulExpr : atom ( STAR ^ atom )* ;
	public final ArithmeticParser.mulExpr_return mulExpr() throws RecognitionException {
		ArithmeticParser.mulExpr_return retval = new ArithmeticParser.mulExpr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token STAR14=null;
		ParserRuleReturnScope atom13 =null;
		ParserRuleReturnScope atom15 =null;

		CommonTree STAR14_tree=null;

		try {
			// ArithmeticParser.g:42:8: ( atom ( STAR ^ atom )* )
			// ArithmeticParser.g:43:5: atom ( STAR ^ atom )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_atom_in_mulExpr216);
			atom13=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom13.getTree());

			// ArithmeticParser.g:44:5: ( STAR ^ atom )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==STAR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ArithmeticParser.g:45:9: STAR ^ atom
					{
					STAR14=(Token)match(input,STAR,FOLLOW_STAR_in_mulExpr232); 
					STAR14_tree = (CommonTree)adaptor.create(STAR14);
					root_0 = (CommonTree)adaptor.becomeRoot(STAR14_tree, root_0);

					pushFollow(FOLLOW_atom_in_mulExpr235);
					atom15=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom15.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulExpr"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// ArithmeticParser.g:49:1: atom : ( INT | ID | OPENPAREN ! expr CLOSEPAREN !);
	public final ArithmeticParser.atom_return atom() throws RecognitionException {
		ArithmeticParser.atom_return retval = new ArithmeticParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT16=null;
		Token ID17=null;
		Token OPENPAREN18=null;
		Token CLOSEPAREN20=null;
		ParserRuleReturnScope expr19 =null;

		CommonTree INT16_tree=null;
		CommonTree ID17_tree=null;
		CommonTree OPENPAREN18_tree=null;
		CommonTree CLOSEPAREN20_tree=null;

		try {
			// ArithmeticParser.g:49:5: ( INT | ID | OPENPAREN ! expr CLOSEPAREN !)
			int alt6=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case ID:
				{
				alt6=2;
				}
				break;
			case OPENPAREN:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// ArithmeticParser.g:50:5: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT16=(Token)match(input,INT,FOLLOW_INT_in_atom258); 
					INT16_tree = (CommonTree)adaptor.create(INT16);
					adaptor.addChild(root_0, INT16_tree);

					}
					break;
				case 2 :
					// ArithmeticParser.g:52:7: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID17=(Token)match(input,ID,FOLLOW_ID_in_atom267); 
					ID17_tree = (CommonTree)adaptor.create(ID17);
					adaptor.addChild(root_0, ID17_tree);

					}
					break;
				case 3 :
					// ArithmeticParser.g:54:7: OPENPAREN ! expr CLOSEPAREN !
					{
					root_0 = (CommonTree)adaptor.nil();


					OPENPAREN18=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_atom276); 
					pushFollow(FOLLOW_expr_in_atom279);
					expr19=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr19.getTree());

					CLOSEPAREN20=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_atom281); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog69 = new BitSet(new long[]{0x00000000000006C2L});
	public static final BitSet FOLLOW_expr_in_stat105 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_stat107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat124 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_EQUAL_in_stat126 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_expr_in_stat128 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_stat130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mulExpr_in_expr168 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_PLUS_in_expr185 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_MINUS_in_expr189 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_mulExpr_in_expr193 = new BitSet(new long[]{0x0000000000000902L});
	public static final BitSet FOLLOW_atom_in_mulExpr216 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_STAR_in_mulExpr232 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_atom_in_mulExpr235 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INT_in_atom258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_atom276 = new BitSet(new long[]{0x00000000000004C0L});
	public static final BitSet FOLLOW_expr_in_atom279 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_atom281 = new BitSet(new long[]{0x0000000000000002L});
}
