import java.util.Scanner;
public class ExceptionOutOfBound
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		builtInException(str);
		System.out.println(str.charAt(str.length()));//error
	}
	public static void builtInException(String str)
	{
	 try
	 {
			System.out.println(str.charAt(str.length()));
	 }
	 catch(StringIndexOutOfBoundsException e)
	 {
		System.out.println("out of limit");
	 }
		
	}
}