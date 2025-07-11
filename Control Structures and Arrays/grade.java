import java.util.*;
public class grade {
    public static void main(String[] args){
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SUBJECTS");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("ENTER MARKS OF " +n + " subjects. Press Enter to provide marks of another subject");
        for (int i = 0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        for (int j = 0; j<n; j++){
            sum = sum+ marks[j];
        }
        int percentage = sum / n;
        System.out.println("Percentage - "+percentage);
        if (percentage>=95) {
            result = "YOU SCORED A GRADE! ";
        }
        else if (percentage>90 && percentage<95) {
            result = "YOU SCORED B!";
        }
        else{
            result = "YOU PASSED";
        }
        System.out.println(result);
    }
}
