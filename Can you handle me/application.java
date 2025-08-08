import java.util.Scanner;
public class application{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ENTER TWO NUMBERS...");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println("REQUIRED ANSWER "+z);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.toString());
        }
            finally{
                System.out.println("Finally block");
                sc.close();
            }
            System.out.println("done!");
        }
    }
