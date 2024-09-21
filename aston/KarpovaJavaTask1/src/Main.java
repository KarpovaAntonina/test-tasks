import static java.lang.System.exit;

/*
   1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
   - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
   - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
    */
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("wait two params");
            exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a == b) {
            System.out.println("a==b");
        } else if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>b");
        }

        System.out.print("a + b = ");
        System.out.println(a + b);

        System.out.print("a - b = ");
        System.out.println(a - b);

        System.out.print("a * b = ");
        System.out.println(a * b);

        if (b != 0) {
            System.out.print("a / b = ");
            System.out.println(1.0 * a / b);
        } else {
            System.out.println("b = 0. Делить нельзя");
        }
    }
}

