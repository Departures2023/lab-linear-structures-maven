package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.LinkedStack;
import edu.grinnell.csc207.linear.Stack;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Khanh Do, Kevin Tang
 */ 
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+
    
  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) throws Exception{
    Stack<Character> parens = new LinkedStack<Character>();

    /*
     * Step through the characters in the expression
    When you encounter an open paren or open square bracket, push it 
      on the stack
    When you encounter a close paren or close square bracket, pop 
      the corresponding opening character off the stack.  If the two
      characters don't match, issue an error.
    If you encounter a closing character with an empty stack, that 
      close paren or bracket is mismatched.
If the stack is not empty, there are unmatched open or closed parens.
     */

    for (int i = 0; i < str.length(); i++) {
      Character strChar = str.charAt(i);
      if (strChar == '(' || strChar == '[') {
        parens.push(strChar);
      } else if (strChar == ')' || strChar == ']') {
        if (parens.isEmpty()) {
          return false;
        }
        Character popOff = parens.pop();
        switch (strChar) {
          case ')':
            if (popOff != '(') {
              return false;}
            break;
          case ']':
            if (popOff != '['){ 
              return false;}
            break;
        }
      }
    }

    return parens.isEmpty();
  } // checkMatching
} // class StringUtils    

