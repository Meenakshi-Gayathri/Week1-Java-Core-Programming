import java.util.*;

public class FindLength{
 public static int lengthreturn(String text){
  int count = 0;
  try{
   while(true){
    text.charAt(count);
	count++;
   }
  }catch(IndexOutOfBoundsException e){
   //System.out.println("Exception has occured "+e.getMessage());
  }
  return count;
 }
 
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  int length1 = lengthreturn(text);
  int length2 = text.length();
  System.out.println(length1);
  System.out.println(length2);
  if(length1==length2){
	System.out.println("true"); 
  }
  else {System.out.println("false");}
 }
}