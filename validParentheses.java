/*
  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
  determine if the input string is valid.

  An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order
  
*/ 

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Stack;

import org.junit.jupiter.api.Test;

public class validParentheses {
  public static void main(String[] args) {
    String s="()[]{}";    
    System.out.println(isValidParentheses(s));
  } 
  
  public static boolean isValidParentheses(String s) {
    Stack<Character> st=new Stack<Character>();
    char[] c=s.toCharArray();
    int n=c.length;
    for(int i=0;i<n;++i){
        if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
            st.push(c[i]);
        }
        else{
            if(st.size()==0){return false;}
            if(c[i]==')'){
                if(st.peek()=='('){st.pop();}
                else{return false;}
            }
            else if(c[i]==']'){
                if(st.peek()=='['){st.pop();}
                else{return false;}
            }
            else{
                if(st.peek()=='{'){st.pop();}
                else{return false;}
            }
        }
    }
    if(st.size()!=0){
        return false;
    }
    return true;
  }
  
  @Test
  public void testValidParentheses(){
    assertEquals(true,isValidParentheses("()[]{}"));
    assertEquals(true,isValidParentheses("()"));
    assertEquals(false,isValidParentheses("(]"));
    assertEquals(false,isValidParentheses("([)]"));
    assertEquals(true,isValidParentheses("{[]}"));
  }
}