import java.util.*;

public class strings {
     public static void main(String[] args) {

/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “sivasai@gmail.com”       ===> username = “sivasai" 
email = “helloWorld123@gmail.com” ===> username = “helloWorld123”

*/    
       Scanner sc = new Scanner (System.in);
       String email = sc.next();
       String uname = "";
       
       for(int i=0;i<email.length();i++){
           if(email.charAt(i) == '@')
            break;
           else
            uname += email.charAt(i);
       }
       System.out.println("Username is: "+uname);
    sc.close();   
    }
    
}
