import java.util.Scanner;

public class togglingBits {
    public static void main(String[] args) {
        
        //  program to toggle a bit a position = “pos” in a number “n”
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Enter a Position to toggle: ");
        int pos = sc.nextInt();

        int res = (1<<pos) ^ n;

        System.out.println("after toggle the position "+pos+" the result is: "+res);

    sc.close();
    }
    
}
