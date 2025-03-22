import java.util.*;

public class DivideChocolates {
    public static int[] findRemainderAndQuotient(int numberOfChildren, int numberOfchocolates) {
        int quotient = numberOfchocolates / numberOfChildren;
        int remainder = numberOfchocolates % numberOfChildren;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfchocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int[] result = findRemainderAndQuotient(numberOfChildren, numberOfchocolates);
        System.out.println("Each child gets " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
