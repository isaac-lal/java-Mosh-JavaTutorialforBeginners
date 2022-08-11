// Bro Code: Java Full Course -Learn to code today- [Free] (Variables - 20:26)

public class variables {
    public static void main(String[] args) {
        int x; // declaration
        x = 123; // assignment
        int y = 123; // initalization
        double nice = 25.3; // can be fraction numbers
        boolean yes = true;
        float ok = 3.14f; // fractions but with an f at the end
        char symbol = '@'; // can only store one character
        String name = "Isaac"; // reference types are uppercase letter: S

        long wow = 1238435702740174L; 

        System.out.println(x); // printing this with quotes will literally print the character
        System.out.println(y);

        System.out.println("My number is: " + x); //string concatenation 
        System.out.println("The student debt I owe is: " + wow);
        System.out.println(yes);
        System.out.println(nice);
        System.out.println(ok);
        System.out.println(symbol);
        System.out.println("Hello " + name);
    }
}
