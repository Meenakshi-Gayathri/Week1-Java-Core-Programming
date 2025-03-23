import java.util.*;

public class SubstringCompare{
 public static String substringcharat(String text,int start_index,int end_index){
  char ch1 = text.charAt(start_index);
  char ch2 = text.charAt(end_index-1);
  String result1 = String.valueOf(ch1)+ch2;
  return result1;
 } 
 
 public static String substringmethod(String text,int start_index,int end_index){
  String result2 = text.substring(start_index,end_index);
  return result2;
 }
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  int start_index = in.nextInt();
  int end_index = in.nextInt();
  String result1 = substringcharat(text,start_index,end_index);
  String result2 = substringmethod(text,start_index,end_index);
  System.out.println(result1);
  System.out.println(result2);
  if(result1.equals(result2)){
   System.out.println("The substrings generated are the same");
  }
  else{
   System.out.println("The substrings generated are not the same");
  }
 }
}