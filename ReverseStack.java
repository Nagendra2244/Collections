/*Write a java program to reverse the order of elements in a Stack.*/
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(55);
        stack.push(26);
        stack.push(57);
        stack.push(80);
        stack.push(50);

        System.out.println("Stack before reversing: " + stack);

        Stack<Integer> reversedStack=new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        System.out.println("Stack after reversing:"+reversedStack);
    }
}
