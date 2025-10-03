public class p7{
    public static void main(String args[]){
        boolean sunny = false;
        boolean hot = false;
        boolean raining = true;
        if (sunny){
            if (hot){
                System.out.print("Use cap and half-sleeves");
            } else {
                System.out.print("Use half-sleeves");
            }
        } else {
            if (raining){
                System.out.print("Carry a rain coat with you");
            } else {
                System.out.print("");
            }
        }
    }
}