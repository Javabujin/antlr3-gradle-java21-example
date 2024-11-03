tree grammar ArithmeticTreeParser;

options {
    tokenVocab=ArithmeticParser;
    ASTLabelType=CommonTree;
}

// Package declaration.
@treeparser::header {
/**
This code is automatically generated using `gradlew run generateGrammarSource`. 
Not for manual edits, fix the grammar then regenerate instead. 
*/

package org.javabujin.example.antlr;

import java.util.HashMap;
import java.util.Optional;
}

// Top-level definitions.
@members {
/** Map variable names to Integer object holding value. */
HashMap<String, Integer> memory = new HashMap<>();
}

// Parser rules.

prog: stat+
    ;

stat: 
    expr 
    { System.out.println($expr.value); }
    
    | ^(EQUAL ID expr)
    { memory.put($ID.text, new Integer($expr.value)); }
    ;

expr returns [int value]
:
    ^(PLUS a=expr b=expr) 
    { $value = a + b; }

    | ^(MINUS a=expr b=expr) 
    { $value = a - b; }   
    
    | ^(STAR a=expr b=expr) 
    { $value = a * b; }

    | ID
    {
        Optional<Integer> _value = Optional.ofNullable(memory.get($ID.text));

        if (_value.isPresent()) {
            $value = _value.get();
        } else {
            System.err.println("Undefined variable `" + $ID.text + "`.");
        }
    }

    | INT
    { $value = Integer.parseInt($INT.text); }
    ;