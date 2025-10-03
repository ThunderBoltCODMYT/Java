import java.util.Scanner;
public class acp4{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int movieRating = scanner.nextInt();
        if (movieRating == 1){
            System.out.println("Absolute Dog Water");
        } else if (movieRating == 2){
            System.out.println("a scam");
        } else if (movieRating == 3){
            System.out.println("Average");
        } else if (movieRating == 4){
            System.out.println("Good.");
        } else if (movieRating == 5){
            System.out.println("Excellent!");
        } else{
            System.out.println("Invalid Rating sir please consider getting some braincells");
        }
    }
}