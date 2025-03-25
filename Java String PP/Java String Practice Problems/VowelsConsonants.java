import java.util.*;

public class VowelsConsonants{
 public static int countvandc(String text,String vowels,int vowel_count,int consonant_count){
  for(int i=0;i<text.length();i++){
   char c = text.charAt(i);
   if(Character.isLetter(c)){
    if(vowels.contains(String.valueOf(c))){vowel_count++; return vowel_count;}
	else{consonant_count++;return consonant_count;}
   }
  }
  return -1; //no letters found
 }
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String text = input.nextLine();
  int vowel_count = 0;
  int consonant_count = 0;
  String vowels = "aeiouAEIOU";
  System.out.println(countvandc(text,vowels,vowel_count,consonant_count));
 } 
} 