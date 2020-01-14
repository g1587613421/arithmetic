package 领扣算法.有效括号;

import java.util.Stack;

public class Main {

    Stack<Character> data=new Stack<>();
    public boolean isValid(String s) {
        try {
        for (Character character : s.toCharArray()) {
            if (character=='{'||character=='['||character=='('){
                data.push(character);
                continue;
            }
            switch (character){
                case '}':
                    if (data.pop()=='{')
                        break;
                    else return false;
                case ']':
                    if (data.pop()=='[')
                        break;
                    else return false;
                case ')':
                    if (data.pop()=='(')
                        break;
                    else return false;
            }
        }

        }catch (Exception e){
            return false;
        }
        
        return data.isEmpty();
    }
    
    
public static void main(String arg[]){//main--来自高金磊
System.out.println(new Main().isValid("{{}}"));
    
}}
