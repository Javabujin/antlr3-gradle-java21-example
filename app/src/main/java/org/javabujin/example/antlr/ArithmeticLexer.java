// $ANTLR 3.5.3 ArithmeticLexer.g 2025-01-25 23:13:29

/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ArithmeticLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ArithmeticLexer() {} 
	public ArithmeticLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ArithmeticLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "ArithmeticLexer.g"; }

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:14:3: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// ArithmeticLexer.g:14:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// ArithmeticLexer.g:14:5: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ArithmeticLexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:17:4: ( ( '0' .. '9' )+ )
			// ArithmeticLexer.g:17:6: ( '0' .. '9' )+
			{
			// ArithmeticLexer.g:17:6: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ArithmeticLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:20:8: ( ( '\\r' )? '\\n' )
			// ArithmeticLexer.g:20:10: ( '\\r' )? '\\n'
			{
			// ArithmeticLexer.g:20:10: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// ArithmeticLexer.g:20:10: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:23:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// ArithmeticLexer.g:23:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// ArithmeticLexer.g:23:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ArithmeticLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:27:6: ( '=' )
			// ArithmeticLexer.g:27:8: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:30:5: ( '+' )
			// ArithmeticLexer.g:30:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:33:6: ( '-' )
			// ArithmeticLexer.g:33:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:36:5: ( '*' )
			// ArithmeticLexer.g:36:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "OPENPAREN"
	public final void mOPENPAREN() throws RecognitionException {
		try {
			int _type = OPENPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:39:10: ( '(' )
			// ArithmeticLexer.g:39:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPENPAREN"

	// $ANTLR start "CLOSEPAREN"
	public final void mCLOSEPAREN() throws RecognitionException {
		try {
			int _type = CLOSEPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ArithmeticLexer.g:42:11: ( ')' )
			// ArithmeticLexer.g:42:13: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSEPAREN"

	@Override
	public void mTokens() throws RecognitionException {
		// ArithmeticLexer.g:1:8: ( ID | INT | NEWLINE | WS | EQUAL | PLUS | MINUS | STAR | OPENPAREN | CLOSEPAREN )
		int alt5=10;
		switch ( input.LA(1) ) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=1;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=2;
			}
			break;
		case '\r':
			{
			int LA5_3 = input.LA(2);
			if ( (LA5_3=='\n') ) {
				int LA5_4 = input.LA(3);
				if ( ((LA5_4 >= '\t' && LA5_4 <= '\n')||LA5_4=='\r'||LA5_4==' ') ) {
					alt5=4;
				}

				else {
					alt5=3;
				}

			}

			else {
				alt5=4;
			}

			}
			break;
		case '\n':
			{
			int LA5_4 = input.LA(2);
			if ( ((LA5_4 >= '\t' && LA5_4 <= '\n')||LA5_4=='\r'||LA5_4==' ') ) {
				alt5=4;
			}

			else {
				alt5=3;
			}

			}
			break;
		case '\t':
		case ' ':
			{
			alt5=4;
			}
			break;
		case '=':
			{
			alt5=5;
			}
			break;
		case '+':
			{
			alt5=6;
			}
			break;
		case '-':
			{
			alt5=7;
			}
			break;
		case '*':
			{
			alt5=8;
			}
			break;
		case '(':
			{
			alt5=9;
			}
			break;
		case ')':
			{
			alt5=10;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// ArithmeticLexer.g:1:10: ID
				{
				mID(); 

				}
				break;
			case 2 :
				// ArithmeticLexer.g:1:13: INT
				{
				mINT(); 

				}
				break;
			case 3 :
				// ArithmeticLexer.g:1:17: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 4 :
				// ArithmeticLexer.g:1:25: WS
				{
				mWS(); 

				}
				break;
			case 5 :
				// ArithmeticLexer.g:1:28: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 6 :
				// ArithmeticLexer.g:1:34: PLUS
				{
				mPLUS(); 

				}
				break;
			case 7 :
				// ArithmeticLexer.g:1:39: MINUS
				{
				mMINUS(); 

				}
				break;
			case 8 :
				// ArithmeticLexer.g:1:45: STAR
				{
				mSTAR(); 

				}
				break;
			case 9 :
				// ArithmeticLexer.g:1:50: OPENPAREN
				{
				mOPENPAREN(); 

				}
				break;
			case 10 :
				// ArithmeticLexer.g:1:60: CLOSEPAREN
				{
				mCLOSEPAREN(); 

				}
				break;

		}
	}



}
