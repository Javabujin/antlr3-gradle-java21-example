// $ANTLR 3.5.3 ArithmeticTreeParser.g 2024-11-03 13:20:44

/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;

import java.util.HashMap;
import java.util.Optional;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ArithmeticTreeParser extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ArithmeticTreeParser(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ArithmeticTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ArithmeticTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ArithmeticTreeParser.g"; }


	/** Map variable names to Integer object holding value. */
	HashMap<String, Integer> memory = new HashMap<>();



	// $ANTLR start "prog"
	// ArithmeticTreeParser.g:29:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// ArithmeticTreeParser.g:29:5: ( ( stat )+ )
			// ArithmeticTreeParser.g:29:7: ( stat )+
			{
			// ArithmeticTreeParser.g:29:7: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= EQUAL && LA1_0 <= MINUS)||(LA1_0 >= PLUS && LA1_0 <= STAR)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ArithmeticTreeParser.g:29:7: stat
					{
					pushFollow(FOLLOW_stat_in_prog53);
					stat();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// ArithmeticTreeParser.g:32:1: stat : ( expr | ^( EQUAL ID expr ) );
	public final void stat() throws RecognitionException {
		CommonTree ID2=null;
		int expr1 =0;
		int expr3 =0;

		try {
			// ArithmeticTreeParser.g:32:5: ( expr | ^( EQUAL ID expr ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ID && LA2_0 <= MINUS)||(LA2_0 >= PLUS && LA2_0 <= STAR)) ) {
				alt2=1;
			}
			else if ( (LA2_0==EQUAL) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ArithmeticTreeParser.g:33:5: expr
					{
					pushFollow(FOLLOW_expr_in_stat71);
					expr1=expr();
					state._fsp--;

					 System.out.println(expr1); 
					}
					break;
				case 2 :
					// ArithmeticTreeParser.g:36:7: ^( EQUAL ID expr )
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_stat92); 
					match(input, Token.DOWN, null); 
					ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_stat94); 
					pushFollow(FOLLOW_expr_in_stat96);
					expr3=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 memory.put((ID2!=null?ID2.getText():null), new Integer(expr3)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "expr"
	// ArithmeticTreeParser.g:40:1: expr returns [int value] : ( ^( PLUS a= expr b= expr ) | ^( MINUS a= expr b= expr ) | ^( STAR a= expr b= expr ) | ID | INT );
	public final int expr() throws RecognitionException {
		int value = 0;


		CommonTree ID4=null;
		CommonTree INT5=null;
		int a =0;
		int b =0;

		try {
			// ArithmeticTreeParser.g:41:5: ( ^( PLUS a= expr b= expr ) | ^( MINUS a= expr b= expr ) | ^( STAR a= expr b= expr ) | ID | INT )
			int alt3=5;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt3=1;
				}
				break;
			case MINUS:
				{
				alt3=2;
				}
				break;
			case STAR:
				{
				alt3=3;
				}
				break;
			case ID:
				{
				alt3=4;
				}
				break;
			case INT:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// ArithmeticTreeParser.g:42:5: ^( PLUS a= expr b= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr125); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr129);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr133);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = a + b; 
					}
					break;
				case 2 :
					// ArithmeticTreeParser.g:45:7: ^( MINUS a= expr b= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr151); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr155);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr159);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = a - b; 
					}
					break;
				case 3 :
					// ArithmeticTreeParser.g:48:7: ^( STAR a= expr b= expr )
					{
					match(input,STAR,FOLLOW_STAR_in_expr184); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr188);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr192);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 value = a * b; 
					}
					break;
				case 4 :
					// ArithmeticTreeParser.g:51:7: ID
					{
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_expr209); 

					        Optional<Integer> _value = Optional.ofNullable(memory.get((ID4!=null?ID4.getText():null)));

					        if (_value.isPresent()) {
					            value = _value.get();
					        } else {
					            System.err.println("Undefined variable `" + (ID4!=null?ID4.getText():null) + "`.");
					        }
					    
					}
					break;
				case 5 :
					// ArithmeticTreeParser.g:62:7: INT
					{
					INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_expr224); 
					 value = Integer.parseInt((INT5!=null?INT5.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog53 = new BitSet(new long[]{0x00000000000019E2L});
	public static final BitSet FOLLOW_expr_in_stat71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_in_stat92 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat94 = new BitSet(new long[]{0x00000000000019C0L});
	public static final BitSet FOLLOW_expr_in_stat96 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_expr125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr129 = new BitSet(new long[]{0x00000000000019C0L});
	public static final BitSet FOLLOW_expr_in_expr133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr155 = new BitSet(new long[]{0x00000000000019C0L});
	public static final BitSet FOLLOW_expr_in_expr159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STAR_in_expr184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr188 = new BitSet(new long[]{0x00000000000019C0L});
	public static final BitSet FOLLOW_expr_in_expr192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_expr209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr224 = new BitSet(new long[]{0x0000000000000002L});
}
