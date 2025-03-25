import java.util.*;

public class Palindrome{
 public static void checkpalindrome(String text){
  String reverse = "";
  int strlength = text.length();
  for(int i=(strlength-1);i>=0;i--){
   reverse = reverse+text.charAt(i);
  }
  if (text.toLowerCase().equals(reverse.toLowerCase())) {
      System.out.println(text + " is a Palindrome String.");
    }
  else {
      System.out.println(text + " is not a Palindrome String.");
    }
 } 
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String text = input.nextLine();
  checkpalindrome(text);
  
 }
}