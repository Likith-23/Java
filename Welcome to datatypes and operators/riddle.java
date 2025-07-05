public class riddle {
    public static void main(String[] args){
        int a = 45;
        int b = 90;
        System.out.println("Guess the answers...");
        System.out.println("Unary Operator" +(a++));
        System.out.println("Unary Operator" +(b++));
        System.out.println(a);
        System.out.println(b);
        int largest = (a>b)?a:b;
        System.out.println("THE LARGER NUMBER IS..."+largest);
    }
}
