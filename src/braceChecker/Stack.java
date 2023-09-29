package braceChecker;

public class Stack {
    char[] charStack = new char[10];
    int tmp;

    public Stack() {
        tmp = -1;
    }

    void push(char c) {
        if (tmp == charStack.length - 1)//remember on next
        {
            extend();
        }
        charStack[++tmp] = c;
    }

    private void extend() {
        char[] newChar = new char[charStack.length * 2];
        for (int i = 0; i < tmp; i++) {
            charStack[i] = newChar[i];
        }
        charStack = newChar;
    }

    int pop() {
        if (tmp < 0) {
            return 0;
        } else return charStack[tmp--];
    }
}