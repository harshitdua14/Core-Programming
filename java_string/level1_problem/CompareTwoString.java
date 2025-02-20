import java.util.Scanner;
class CompareTwoString{
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        boolean comparingString = compare(s1,s2);
        boolean equalString = s1.equals(s2);

        System.out.println("Comparison using charAt(): " + comparingString);
        System.out.println("Comparison using equals(): " + equalString);
        
        // Checking if both methods give the same result
        if (comparingString == equalString) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
        sc.close();
    }
}