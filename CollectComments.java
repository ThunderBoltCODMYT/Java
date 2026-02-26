import java.util.ArrayList;
import java.util.Scanner;

class Review{
    private String comment;
    
    public Review(String comment){
        this.comment = comment;
    }
    
    public String getComment(){
        return comment;
    }
}

public class CollectComments{
    public ArrayList<String> collectComments(ArrayList<Review> allReviews){
        ArrayList<String> comments = new ArrayList<>();
        for(int i = 0; i < allReviews.size(); i++){
            String comment = allReviews.get(i).getComment();
            if(comment.contains("!")){
                String formattedComment = String.format("%d-%s", i, comment);
                if(!comment.endsWith("!") && !comment.endsWith(".")){
                    formattedComment += ".";
                }
                
                comments.add(formattedComment);
            }
        }
        
        return comments;
    }
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            CollectComments obj = new CollectComments();
            System.out.println("Enter the number of reviews: ");
            int n = scanner.nextInt();
            scanner.nextLine(); //mandatory
            ArrayList<Review> allReviews = new ArrayList<>();
            for(int i = 0; i < n; i++){
                System.out.println("Enter review " + (i + 1) + ": ");
                String comment = scanner.nextLine();
                allReviews.add(new Review(comment));
            }
            
            ArrayList<String> comments = obj.collectComments(allReviews);
            System.out.println("Formatted Elements: ");
            for(String comment : comments){
                System.out.println(comment);
            }
            scanner.close();
        }
    }
}