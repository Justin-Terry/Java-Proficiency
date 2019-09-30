import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack;
        boolean balanced = true;
		while (sc.hasNext()) {
            stack = new Stack();
			String s=sc.next();
            balanced = true;
            //Complete the code
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                } else if(!stack.empty()){
                    if(!checkClosure(stack.pop(), s.charAt(i))){
                        balanced = false;
                    }
                } else{
                    balanced = false;
                }
            }
            if(!stack.empty()){
                balanced = false;
            }
            System.out.println(balanced);
		}		
	}

    public static boolean checkClosure(char a, char b){
        if(a == '{' && b == '}'){
            return true;
        }
        if(a == '[' && b == ']'){
            return true;
        }
        if(a == '(' && b == ')'){
            return true;
        }
        return false;
    }
}



