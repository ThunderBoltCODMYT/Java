import java.util.Scanner;
public class Strings2 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number of characters: ");
        int n = scanner.nextInt();
        System.out.println("Enter the string: ");
        scanner.nextLine();
        String inputStr = scanner.nextLine();
        System.out.println("Original string: " + inputStr);
        String revStr = new StringBuilder(inputStr).reverse().toString();
        System.out.println("Reversed string: " + revStr);   
        System.out.println("Concatenated string: " + inputStr + " " +  revStr);
    }
}