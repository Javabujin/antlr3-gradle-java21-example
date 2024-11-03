parser grammar ArithmeticParser;

options {
    tokenVocab=ArithmeticLexer;
    output=AST;
    ASTLabelType=CommonTree;
}

// Package declaration.
@parser::header {
/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;
}

// Parser rules.
prog: 
    (
        stat 
        { System.out.println($stat.tree.toStringTree()); }
    )+ 
    ;

stat: 
    expr NEWLINE -> expr
    
    | ID EQUAL expr NEWLINE -> ^(EQUAL ID expr)

    | NEWLINE -> 
    ;

expr:
    mulExpr
    (
        (PLUS^| MINUS^) mulExpr
    )*
    ;

mulExpr:
    atom
    (
        STAR^ atom
    )*
    ;

atom:
    INT

    | ID

    | OPENPAREN! expr CLOSEPAREN!
    ;