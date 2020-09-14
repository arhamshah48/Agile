import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Palindrome{
  public static void main(String[] args) {
    String s="abcba";
    System.out.println(isPalindrome(s));
  }
  public static boolean isPalindrome(String s){
    char[] c=s.toCharArray();
    int i=0,j=c.length-1;
    while(i<j){
      if(c[i]!=c[j]){return false;}
      ++i;
      --j;
    }
    return true;
  }

  @Test
  public void testIsPalindrome(){
    assertEquals(true,isPalindrome("abcba"));
    assertEquals(false,isPalindrome("abbb"));
    assertEquals(true,isPalindrome("aaaaa"));
    assertEquals(true,isPalindrome("aaaaa"));
  }


}