import java.util.*;

public class a1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the " + n + "elements of the list: ");
        for(int i = 0; i < n; i++){
            al.add(scanner.nextInt());
        }
        ArrayList<Integer> ans = reverse(al);
        System.out.println("Reversed List: " + ans);
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--){
            ans.add(list.get(i));
        }

        return ans;
    }
}