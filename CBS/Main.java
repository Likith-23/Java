import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        boolean infiniteloop= true;
        double[] accountbalance = new double[1000];
        String[] accountname = new String[1000];
        int option, size = 100;
        while(infiniteloop){
            System.out.println("WELCOME TO CODINGAL Banking SERVICES");
            System.out.println("Banking Menu:");
            System.out.println("SELECT ANY ONE OPTION FROM BELOW");
            System.out.println("1. ADD CUSTOMER");
            System.out.println("3. QUIT");
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER YOUR OPTION TO PROCEED......................................................");
            option = sc.nextInt();
            if (option == 1){
                System.out.println("ADD CUSTOMER");
                sc.nextLine();
                System.out.println("ENTER CUSTOMER NAME");
                String name = sc.nextLine();
                accountname[size]=name;
                System.out.println("ENTER OPENING AMOUNT");
                double amt = sc.nextDouble();
                accountbalance[size]=amt;
                System.out.println("ACCOUNT CREATED SUCCESSFULLY!!!!");
                System.out.println("ACCOUNT DETAILS");
                System.out.println("ACCOUNT NUMBER"+(size));
                System.out.println("ACCOUNT NAME"+accountname[size]);
                System.out.println("Account Balance"+accountbalance[size]);
                size = size+1;
            }
            else if(option==3){
                System.out.println("Terminating");
                System.out.println("DEvelopED BY Likith");
                System.out.println("Built in India");
                infiniteloop = false;
            }
            else{
                System.out.println("Invalid input");
                System.out.println("Terminating");
                System.out.println("DEvelopED BY Likith");
                System.out.println("Built in India");
                System.exit(0);
                
            }
        } 
    }
}