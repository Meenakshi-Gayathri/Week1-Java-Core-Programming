import java.util.*;

public class ReverseString{
 public static String reversestring(String text,String reverse){
  for(int i=text.length()-1;i>=0;i--){
   reverse += text.charAt(i);
  }
  return reverse;
 }
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  String reverse = "";
  System.out.print(reversestring(text,reverse));
 }
}