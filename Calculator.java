import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
            System.out.println("Hello, what is your name?");
            String name = names.nextLine();
            System.out.println(name + ", type your first number");
                Scanner numbers= new Scanner(System.in);
                    int firstnumber = numbers.nextInt();
                        System.out.println(name + ", type your second number");
                            int secondnumber = numbers.nextInt();    
                            int result = firstnumber + secondnumber;
                             System.out.print(name + ", Your number is " + result);                
        
    }
}
