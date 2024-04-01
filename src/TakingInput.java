import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input from the users");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int a= sc.nextInt();
        System.out.println("enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}
