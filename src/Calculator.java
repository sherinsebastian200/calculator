import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operation");
        int operation = sc.nextInt();
        System.out.println("Enter 1 Addition. 2.substraction 3.multiplication 4.division");

        switch(operation)
        {
            case 1:
                int result = num1+num2;
                System.out.println("num1+num2 =" +result);
            }
        }

}
