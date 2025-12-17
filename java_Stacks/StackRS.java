import java.util.Stack;
public class StackRS {
    public static String reverseString(String str){
        Stack<Character> s= new Stack<>();
        int i =0;
        while(i< str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("String: " +str);
        String result = reverseString(str);
        System.out.println("Reversed String: " + result);
    }
    
}
