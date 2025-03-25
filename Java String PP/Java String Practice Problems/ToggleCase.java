import java.util.*;

public class ToggleCase{
 public static String togglecases(String text){
  String result = "";
  for(int i=0;i<text.length();i++){
   char c = text.charAt(i);
   if(Character.isUpperCase(c)){result+=Character.toLowerCase(c);}
   else if(Character.isLowerCase(c)){result+=Character.toUpperCase(c);}
   else{result+=c;}
  }
  return result;
 }
 public static void main(String[] Args){
  Scanner in = new Scanner(System.in);
  String text = in.nextLine();
  System.out.println(togglecases(text));
 }
}