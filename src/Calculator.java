import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1,num2,ex;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 Addition. 2.substraction 3.multiplication 4.division 5.exit5");
            int operation = sc.nextInt();
            if (operation != 5) {
                System.out.println("Enter first number");
                 num1 = sc.nextInt();

                System.out.println("Enter second number");
                 num2 = sc.nextInt();
            } else
                break;

            switch (operation) {
                case 1:
                    int result = num1 + num2;
                    System.out.println("num1+num2 =" + result);
                    break;
                case 2:
                    int sub = num1 - num2;
                    System.out.println("num1-num2 =" + sub);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("num1-num2" + mult);
                    break;
                case 4:
                    try{
                        int div = num1 / num2;
                        System.out.println("num1/num2" + div);

                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println("num2 is zero");
                    }

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid input");


            }
            System.out.println("do you want to continue ?1.yes 2.no");
            ex=sc.nextInt();

        }while (ex==1);

    }
}
