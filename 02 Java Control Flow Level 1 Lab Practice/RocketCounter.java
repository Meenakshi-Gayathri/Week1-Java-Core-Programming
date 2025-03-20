import java.util.Scanner;

public class RocketCounter {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);
        count = input.nextInt();
		while(count>=1){
		count--;
		System.out.println(+count);  
		}       
    }
}
