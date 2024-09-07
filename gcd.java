import java.util.*;

public class gcd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int res = findGCD(n1,n2);

        System.out.println("The GCD of"+n1+" and "+n2+" is : "+res);
    sc.close();    
    }

    public static int findGCD(int a, int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b - a;
            }
        }
        return a;
    }
    
}
