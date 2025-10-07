import java.util.Scanner;
public class p12{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        
        do{
            System.out.println("Enter the Number: ");
            number = scanner.nextInt();
            
            if (number > max){
                max = number;
            }
            
            if (number > min){
                min = number;
            }
            
            System.out.print("Do you want to continue? (y/n)");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        System.out.print("largest Number: " + max);
        System.out.print("smallest number: " + min);
    }
}