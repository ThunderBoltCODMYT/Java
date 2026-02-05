import java.util.Scanner;

public class StringFrequencyI {

    public static boolean isSubstring(String str1, String str2){
        int index = str1.indexOf(str2);
        if(index == -1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the main string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the sub-string: ");
        String str2 = scanner.nextLine();

        if(isSubstring(str1, str2)){
            System.out.println("str2 is a substring of str1.");
        }else{
            System.out.println("str2 is not a substring of str1.");
        }
    }
}