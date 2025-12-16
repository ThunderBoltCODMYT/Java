import java.util.Scanner;
import java.util.ArrayList;

public class a2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of arrays you want to input: ");
        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Enter the size of array " + (i + 1) + " : ");
            int n1 = scanner.nextInt();
            ArrayList<Integer> l2 = new ArrayList<>();
            System.out.println("Enter the " + n1 + " Elements of the array " + (i + 1) + " : ");
            for(int j = 0; j < n1; j++){
                l2.add(scanner.nextInt());
            }
            list.add(i, l2);
        }
        System.out.println("Enter the number of queries to process: ");
        int num = scanner.nextInt();

        for(int k = 0; k < num; k++){
            System.out.println("Enter row and column for query " + (k + 1) + " :");
            int m = scanner.nextInt();
            int o = scanner.nextInt();

            try{
                System.out.println("Element at (" + m + ", " + o + ") : " + list.get(m - 1).get(o - 1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }

    }
}