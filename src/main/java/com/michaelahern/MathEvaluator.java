package com.michaelahern;
import java.util.*;

public class MathEvaluator {

    private static final Map<Character, Integer> prescedence = new HashMap<>();
    static {
        prescedence.put('#', 6);
        prescedence.put('~', 6);
        prescedence.put('(', 5);
        prescedence.put('^', 4);
        prescedence.put('/', 3);
        prescedence.put('%', 3);
        prescedence.put('*', 3);
        prescedence.put('-', 2);
        prescedence.put('+', 2);
        prescedence.put(')', 1);
    }

    public static List<String> createTokenList(String expressionString)
    {
        List<String> outputStrings = new ArrayList<>();

        //read the input-expression letter-by-letter and build tokens
        StringBuilder numericString = new StringBuilder();
        char currentChar, lookAhead;
        boolean unary = false;
        for (int index = 0; index < expressionString.length(); index++)
        {
            currentChar = expressionString.charAt(index);

            if(index + 1 == expressionString.length())
                lookAhead = ' ';
            else
                lookAhead = expressionString.charAt(index + 1);

            if(currentChar == '-' && (Character.isDigit(lookAhead) || lookAhead == '.') && numericString.length() == 0) {
                numericString.append(currentChar);
                unary = false;
            } else if ((currentChar == '-' && (lookAhead == ' ') || lookAhead == '(') || prescedence.containsKey(currentChar)) {
                if (numericString.length() > 0) {
                    outputStrings.add(numericString.toString());
                    numericString = new StringBuilder(); //reset numeric token string
                }
                if(unary) {
                    if(currentChar == '-' || currentChar == '+') {
                        currentChar = currentChar == '-'?'~':'#';
                    }
                }
                outputStrings.add(String.valueOf(currentChar));
                if(currentChar != ')')
                    unary = true;
                else
                    unary = false;

            } else if (Character.isDigit(currentChar) || currentChar == '.') {
                //if digit or dot
                numericString.append(currentChar);
                unary = false;
            }
        }

        //check if any token at the end
        if (numericString.length() > 0)
        {
            outputStrings.add(numericString.toString());
        }

        return outputStrings;
    }

    public double calculate(String expression) {

        // String[] exp = expression.split("[(]?[\\s]?[-]?([0-9]+[\\s]?)[)]??([\\s]?[(]?[\\s]?([-+/*][\\s]?([0-9]))?([.,][0-9]+)?[\\s]?[)]?)*");
        List<String> list = createTokenList(expression);
        Stack<Character> operatorStack = new Stack<Character>();
        Queue<String> outputStack = new LinkedList<>();

        for(String str : list) {
            if(isNumeric(str)) {
                outputStack.add(str);
            } else {
                char[] strChars = str.toCharArray();
                for(char c : strChars) {
                    if(c == ' ') continue;
                    if(operatorStack.isEmpty()) {
                        operatorStack.push(c);
                    } else {
                        if(c == '(') {
                            operatorStack.push(c);
                        } else if(c == ')') {
                            while(!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                                Character x = operatorStack.pop();
                                outputStack.add(String.valueOf(x));
                            }

                            if (!operatorStack.isEmpty() && operatorStack.peek() == '(')
                                operatorStack.pop(); // get rid of the opening bracket

                        } else {
                            while(!operatorStack.isEmpty() && operatorStack.peek() != '(' &&
                                   operatorStack.peek() != ')' && prescedence.get(c) <= prescedence.get(operatorStack.peek())) {
                                Character x = operatorStack.pop();
                                outputStack.add(String.valueOf(x));
                            }
                            operatorStack.push(c);
                        }
                    }
                }
            }
        }

        while (!operatorStack.isEmpty()){
            Character x = operatorStack.pop();
            outputStack.add(String.valueOf(x));
        }
        double answer = evaluate(outputStack);
        return answer;
    }

    public double evaluate(Queue<String> queue) {

        Stack<Double> stack = new Stack<Double>();
        while(!queue.isEmpty()) {
            String str = queue.remove();
            if(isNumeric(str)) {
                stack.push(Double.parseDouble(str));
            } else {
                if(str.charAt(0) == '~') {
                    double x = stack.pop();
                    stack.push(-x);
                } else if (str.charAt(0) == '#') {
                    ; // skip
                } else if(stack.size() > 1) {
                    double x = stack.pop(); double y = stack.pop();
                    double d = eval(str.charAt(0), x, y);
                    stack.push(d);
                }
            }
        }
        double r = stack.pop();
        return r;
    }


    public static double eval(char operator, double x, double y) {
        double result  = 0l;
        switch(operator) {
            case '*':
                result = x * y;
                break;
            case '/':
                result = y / x;
                break;
            case '-':
                result = y - x;
                break;
            case '+':
                result = x + y;
                break;
            case '^':
                result = Math.pow(x,y);
                break;

            default:
                result = 0l;

        }
        return result;

    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
}
