import java.util.*;

public class RemoveDuplicates{
 public static String displaymodified(String text){
  String result = "";
  for(int i=0;i<text.length();i++){
   char c = text.charAt(i);
   if(result.indexOf(c)==-1){
    result+=c;
   }
  }
  return result;
 }
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  System.out.println(displaymodified(text));
 }
}