package Collection;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<String> language = new Stack<String>();
        language.push("Hello");
        language.push("World");
        language.push("Java");
        language.push("Python");
        System.out.println(language);

        System.out.println(language.peek());
        System.out.println(language.pop());
        System.out.println(language.peek());
        System.out.println(language.pop());
    }
}
