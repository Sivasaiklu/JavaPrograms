import java.util.Scanner;

public class countOnes {
    public static void main(String[] args) {
        
        //  program to find no.of ones in a given number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String binary = decimalToBinary(n);
        System.out.println("The binary form of "+n+" is: "+binary);

        int count = oneCountInBinary(binary);

        System.out.println("The total no.of one's in "+n+" are: "+count);
        sc.close();   
    }

    public static String decimalToBinary(int n){
        String res = " ";
        while(n>0){
            res = (n%2) + res;
            n=n/2;
        }
        return res;
    }

    public static int oneCountInBinary(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
