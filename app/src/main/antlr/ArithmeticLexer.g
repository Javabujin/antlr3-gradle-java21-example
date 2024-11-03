lexer grammar ArithmeticLexer;

// Package declaration.
@lexer::header {
/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;
}

// Lexer rules
ID: ('a'..'z' | 'A'..'Z')+
    ;

INT: '0'..'9'+
    ;

NEWLINE: '\r'? '\n'
    ;

WS: (' ' | '\t' | '\n' | '\r' )+ 
    { skip(); }
    ;

EQUAL: '='
    ;

PLUS: '+'
    ;

MINUS: '-'
    ;

STAR: '*'
    ;

OPENPAREN: '('
    ;
    
CLOSEPAREN: ')'
    ;
