import java.util.*;
class FriendComparision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter the height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter the height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter the height of Anthony: ");
        double heightAnthony = sc.nextDouble();
        //finding the youngest one
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : 
                                (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        
        // Finding the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : 
                               (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        
        // Displaying results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        
    }
}
