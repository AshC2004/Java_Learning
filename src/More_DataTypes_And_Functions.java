import java.util.*;

public class More_DataTypes_And_Functions {
    public static void main(String[] args) {

        //Min and Max of integer values
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        System.out.println("Min Value of int can be: "+a);
        System.out.println("Max value of int can be: "+b);

        //Another way of doing the same thing above
        System.out.println(
                "Integer Range: ("
                        + Integer.MIN_VALUE
                        + " to "
                        + Integer.MAX_VALUE
                        + ")"
        );

        // Wrapper Classes in Java : A class is a building block for
        // object-oriented programming and allows us to build custom data types.

        // Primitive to Wrapper (Autoboxing)
        int num = 42;
        Integer wrapped = num;  // Autoboxing

        // Wrapper to Primitive (Unboxing)
        int original = wrapped; // Unboxing

        // Using Wrapper in Collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // Autoboxed automatically
        list.add(20);

        // Wrapper class utility methods
        String str = "123";
        int parsed = Integer.parseInt(str); // String to int

        System.out.println("Wrapped Integer: " + wrapped);
        System.out.println("Unwrapped Integer: " + original);
        System.out.println("ArrayList: " + list);
        System.out.println("Parsed int from string: " + parsed);

        // Overflow and Underflow:
        // Each primitive type has a minimum and maximum limit defined by its wrapper class.
        // When values exceed these bounds, overflow or underflow occurs.
   
    
    }


}
