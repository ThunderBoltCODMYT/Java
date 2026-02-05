import java.util.Scanner;

public class CompareStrings {

    public static int compareStrings(String str1, String str2){
        for(int i = 0; i < str1.length() && i  < str2.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);

        if(result == 0){
            System.out.println("The strings are equal");
        }else if(result < 0){
            System.out.println("The first string is lexicographically smaller");
        }else{
            System.out.println("The first string is lexicographically larger");
        }
    }
}