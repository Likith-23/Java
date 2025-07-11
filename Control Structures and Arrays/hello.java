import java.util.*;
public class hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLO USER, PLEASe enter name");
        String name = sc.nextLine();
        System.out.println("ENTER YOUR LUCKY NUMBER");
        int lucky = sc.nextInt();
        System.out.println("HELLO..."+ name + "Your LUCKY number is"+ lucky);
        
    }
}
