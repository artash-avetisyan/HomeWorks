package braceChecker;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char popChar;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == 0) {
                        System.err.println("Error: at " + i + " index: Closed " + c + " but didn't open.");
                    } else if (popChar != '(') {
                        System.err.println("Error: opened" + popChar + "but closed ) at " + i);
                    }

                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == 0) {
                        System.err.println("Error: at " + i + " index: Closed " + c + " but didn't open.");
                    } else if (popChar != '[') {
                        System.err.println("Error: opened" + popChar + "but closed ] at" + i);
                    }
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == 0) {
                        System.err.println("Error: at " + i + " index: Closed " + c + " but didn't open.");
                    } else if (popChar != '{') {
                        System.err.println("Error: opened" + popChar + "but closed } at" + i);
                    }
                    break;
            }

        }
        if (stack.pop() > 0) {
            System.err.println("Opened but dont closed");
        }
    }
}