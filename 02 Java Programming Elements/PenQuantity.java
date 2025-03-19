import java.util.*;

public class PenQuantity {
    public static void main(String[] args) {
        int pens = 14,students = 3;
		float reminder,quantity_pen;
        reminder = pens%students;
		quantity_pen = pens/students;
        System.out.println("The Pen Per Student is " + quantity_pen+ 
                           " and the remaining pen not distributed is " + reminder);
}
}