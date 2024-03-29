import java.util.*;
public class practice {
    public static void main(String[] args) {
        //스택으로 괄호검사
        Scanner sc = new Scanner(System.in);
        System.out.println("소괄호로 이루어진 문자를 입력하세요.(빈 문자열X)");
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else if (st.isEmpty()) {
                System.out.println("올바르지 않은 괄호");
                System.exit(0);
            } else {
                st.pop();
            }
        }
        if (st.isEmpty()) System.out.println("올바른 괄호");
        else System.out.println("올바르지 않은 괄호");
    }
}
