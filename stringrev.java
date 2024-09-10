public class stringrev {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Sivasaiklu");

        for(int i = 0; i < sb.length()/2; i++){
            
            int front = i;
            int back = sb.length() - 1 - i;

            char fChar = sb.charAt(front);
            char bChar = sb.charAt(back);

            sb.setCharAt(front, bChar);
            sb.setCharAt(back, fChar);
        }
        
        System.out.println(sb);
    }
    
}
