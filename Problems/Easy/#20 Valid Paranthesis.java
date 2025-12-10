import java.util.Stack;
class Soltuion{
    public boolean isValid(String s){
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for ( int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch == '(' || ch == '{' || ch== '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                //we check for false contions only not the not equal to for top variable
                if(ch==')'&& top!='(') return false;
                if(ch=='}'&& top!='{') return false;
                if(ch==']'&& top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Soltuion obj = new Soltuion();
        boolean result = obj.isValid("()]");
        System.out.println(result);
    }
}