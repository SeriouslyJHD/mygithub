/*问题描述
　　输入一个只包含加减乖除和括号的合法表达式，求表达式的值。其中除表示整除。
输入格式
　　输入一行，包含一个表达式。
输出格式
　　输出这个表达式的值。
样例输入
1-2+3*(4-5)
样例输出
-4
数据规模和约定
　　表达式长度不超过100，表达式运算合法且运算过程都在int内进行。*/

import java.util.Scanner;
import java.util.Stack;

/**
 * 算法训练 表达式计算
 *
 * 创建两个栈，一个用来存放括号，另一个用来存放运算数字结果
 * 如果遇到数字则压入存结果的栈;
 * 如果是左括号,则直接压入运算符的栈;
 * 如果是运算符,则比较一下如果栈顶内运算符的优先级高于或者等于当前运算符的优先级,
 * 则弹出两个数字和一个运算符进行运算,结果再存到结果的栈里,直到栈顶的运算符低于当前读入的运算符或者遇到 ( ,则把当前的运算符压栈。
 * 如果是')',则运算'('和')'之间的公式。
 * 在算式最后加上')'其实相当于是结束的标志
 *
 */
public class Expression {
    // 存放运算符
    static Stack<Character> chr = new Stack<Character>();
    // 存放结果
    static Stack<Integer> result = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        chr.add('(');
        char str[] = (sc.next() + ")").toCharArray();
        sc.close();
        int number = 0;
        for (int i = 0; i < str.length; i++) {
            // 如果是数字直接入结果栈
            if ('0' <= str[i] && str[i] <= '9') {
                number = str[i] - '0';
                for (i = i + 1; i < str.length; i++) {
                    if ('0' <= str[i] && str[i] <= '9') {
                        number = number * 10 + (str[i] - '0');
                    } else {
                        i--;
                        break;
                    }
                }
                result.add(number);
                continue;
            }
            // 如果是'('直接入符号栈
            if (str[i] == '(') {
                chr.add(str[i]);
                continue;
            }
            // 如果是运算符
            if (str[i] == '+' || str[i] == '-' || str[i] == '*'
                    || str[i] == '/') {
                while (pd(chr.peek(), str[i])) {
                    f();
                }
                chr.add(str[i]);
                continue;
            }
            // 如果是')'
            if (str[i] == ')') {
                while (chr.peek() != '(') {
                    f();
                }
                chr.pop();
            }
        }

        System.out.println(result.get(0));
    }

    /**
     * 符号优先级判断
     * @param a 符号栈顶符号
     * @param b 当前运算符
     * @return 栈顶运算符优先级不低于当前运算符返回true,否则返回false;
     */
    private static boolean pd(char a, char b) {
        if (a == '*' || a == '/') {
            return true;
        }
        if (b == '*' || b == '/' || a == '(') {
            return false;
        }
        return true;
    }

    /**
     * 对算式进行运算
     */
    private static void f() {
        char fh = chr.pop();
        int num2 = result.pop();
        int num1 = result.pop();
        switch (fh) {
            case '+':
                result.add(num1 + num2);
                break;
            case '-':
                result.add(num1 - num2);
                break;
            case '*':
                result.add(num1 * num2);
                break;
            case '/':
                result.add(num1 / num2);
                break;
            default:
                break;
        }
    }
}


