import java.util.Scanner;
public class p14{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        for(int n = a; n<=b; n++){
            int count = 0;
            for(int i = 1; i<=n; i++){
                if(n % i == 0){
                    count++;
                }
                if(count == 0){
                    System.out.println(n + " Is a prime");
                } else {
                    System.out.println(n + " Is a composite number");
                }
            }
        }
    }
}