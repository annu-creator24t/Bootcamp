import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; 
                numberStack.push(num);
            }
            
            else if (ch != ']') {
                mainStack.push(ch + "");
            }
            else {
                String str = "";
                while (!mainStack.peek().equals("[")) {
                    str = mainStack.pop() + str;
                }
                mainStack.pop(); 

                int repetitionNumber = numberStack.pop();
                StringBuilder sb = new StringBuilder();
                while (repetitionNumber-- > 0) {
                    sb.append(str);
                }

                mainStack.push(sb.toString());
            }
        }
        StringBuilder result = new StringBuilder();
        while (!mainStack.isEmpty()) {
            result.insert(0, mainStack.pop());
        }

        return result.toString();
    }
}