public class variables {
    public static void main(String[] args) {
        int age = 30, temperature = 80; // initialization
        age = 35; // changing variable value
        System.out.println("My age is: " + age);
        System.out.println("The tempreature is: " + temperature + " degrees");

        int myAge = 30;
        int herAge = myAge; // camel case notation: capitalize first letter of every word except the first word
        System.out.println(herAge);
    }
}
