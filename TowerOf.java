import java.util.*;
public class TowerOf {
    public static void toh(int n,int t1,int t2,int t3){
        if(n == 0){return;}
        toh(n-1, t1, t3, t2);
        System.out.println("Move disk " + n + " from tower " + t1 + " to tower " + t2);
        toh(n - 1, t3, t2, t1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int  n = scanner.nextInt();
        System.out.println("Enter the number for the first tower: ");
        int t1 = scanner.nextInt();
        System.out.println("Enter the number for the second tower: ");
        int t2 = scanner.nextInt();
        System.out.println("Enter the number for the third tower: ");
        int t3 = scanner.nextInt();
        toh(n, t1, t2, t3);
        scanner.close();
    }   
}