import java.util.*;

public class ReturnDuplicates{
    public static int[] findDuplicates(int[] arr){
        Set<Integer> uniqueValues = new HashSet<Integer>();
        Set<Integer> duplicateValues = new HashSet<Integer>();
        
        for(int num : arr){
            if(!uniqueValues.add(num)){
                duplicateValues.add(num);
            }
        }
        
        int[] result = new int[duplicateValues.size()];
        int index = 0;
        for(int num : duplicateValues){
            result[index++] = num;
        }
        
        return result;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the number of elements: ");
            int n = scanner.nextInt();;
            
            int[] arr  = new int[n];
            
            System.out.println("Enter the elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = scanner.nextInt();
            }
            
            int[] result = findDuplicates(arr);
            
            if(result.length > 0){
                System.out.println("Duplicates: ");
                for(int num : result){
                    System.out.print(num + " ");
                }
            }else{
                System.out.println("No duplicates found!");
            }
        }
    }
}