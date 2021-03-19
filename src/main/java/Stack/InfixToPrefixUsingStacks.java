
package Stack;

import java.util.*;

public class InfixToPrefixUsingStacks {

    public static void main(String[] args) {
        //String s = "(A-B/C)*(A/K-L)" ;
        String s = "8+(7-9)*2" ;
        System.out.println("Infix to Prefix: " + infixToPrefix(s));
    }
    
    static String infixToPrefix(String infix){
       //Operators stack
       Stack<Character> operators = new Stack<Character>();
       //operands stack
       Stack<String> operands = new Stack<String>();
       
       for (int i = 0; i < infix.length(); i++) {
            //if current char is opening bracket '('
            //push into operator stack
            if (infix.charAt(i) == '(') {
                operators.push(infix.charAt(i));
            }
            //if current char is closing bracket ')'
            //pop both stacks and push result in operands stack
            //until matching opening bracket is not found
            else if (infix.charAt(i) == ')') {
                while(!operators.empty() && operators.peek() != '('){
                   //operand 1
                    String operand1 = operands.peek();
                    operands.pop();
                    
                    //operand 2
                    String operand2 = operands.peek();
                    operands.pop();
                    
                    //operator
                    char operator = operators.peek();
                    operators.pop();
                    
                    String temp = operator + operand2 + operand1;
                    operands.push(temp);                   
                }//end while
                
                //pop opening bracket from stack
                operators.pop();
            }// end else if
            
            //if current char is an operand 
            //then push it to operands stack
            else if (!isOperator(infix.charAt(i))) {
                operands.push(infix.charAt(i)+"");
            } // end else if
            
            //if current char is an operator, then
            //push it to operators stack after popping
            // high priority operators stack then pushing into 
            //operands stack
            else {
                while (!operators.empty() && 
                        getPriority(infix.charAt(i)) <= getPriority(operators.peek())){
                    String operand1 = operands.peek();
                    operands.pop();
 
                    String operand2 = operands.peek();
                    operands.pop();

                    char operator = operators.peek();
                    operators.pop();

                    String temp = operator + operand2 + operand1;
                    operands.push(temp);    
                }//end while
                
                operators.push(infix.charAt(i));
            }// end else
       }// end for

       while (!operators.empty()){
            String operand1 = operands.peek();
            operands.pop();

            String operand2 = operands.peek();
            operands.pop();

            char operator = operators.peek();
            operators.pop();

            String temp = operator + operand2 + operand1;
            operands.push(temp);    
       }//end while
       
       //final prefix isin operand stack
       return operands.peek();
    }// end infixToPrefix 
    
    static boolean isOperator(char c) {
        //Check if character is an operator or not
        //if (*, /, +, -)  return true, (0 to 9) return false  
        return (!(c >= '0' && c <= '9') &&
                !(c >= 'a' && c <= 'z') &&
                !(c >= 'A' && c <= 'Z'));
    }
    
    static int getPriority(char C) {
        if (C == '-' || C == '+') return 1;
        else if (C == '*' || C =='/') return 2;
        else if (C == '^') return 3;
        return 0;
    }
   
}
