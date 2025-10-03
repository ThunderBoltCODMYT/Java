import java.util.Scanner;
public class p6{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80) {
            System.out.println("A+");
        } else if (marks > 70) {
            System.out.println("A");
        } else if (marks > 60) {
            System.out.println("B");
        } else {
            System.out.println("F");
        }
    }
}