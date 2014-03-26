package evalrevpolnota;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        Stack<String> s = new Stack<String>();
        int i = 0;
        int res = 0;
        while(i < tokens.length){
            if(! (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))){
                s.push(tokens[i]);
            }
            else{
                if(!s.empty()){
                    res = Integer.parseInt(s.pop());                    
                    if(tokens[i].equals("+")){
                        res = Integer.parseInt(s.pop()) + res;
                    }
                    else if(tokens[i].equals("-")){
                        res = Integer.parseInt(s.pop())  - res;
                    }
                    else if(tokens[i].equals("*")){
                    	res = Integer.parseInt(s.pop())  * res;
                    }
                    else if(tokens[i].equals("/")){
                    	res = Integer.parseInt(s.pop()) / res;
                    }
                    s.push(Integer.toString(res));                  
                }
            }
            i++;
        }
        
        return res;
    }
}