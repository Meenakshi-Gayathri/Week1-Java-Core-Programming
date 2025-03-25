import java.util.*;

public class Palindrome{
 public static String reversestring(String text,String reverse){
  for(int i=text.length()-1;i>=0;i--){
   reverse += text.charAt(i);
  }
  return reverse;
 }
 public static String checkpalindrome(String text,String result1){
  if(text.equals(result1)){return "Is a palindrome";}
  else{return "Not a palindrome";}
 }
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  String reverse = "";
  String result1=reversestring(text,reverse);
  System.out.println(checkpalindrome(text,result1));
 }
}