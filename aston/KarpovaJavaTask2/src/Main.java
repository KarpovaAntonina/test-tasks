import static java.lang.System.exit;

/*
2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
*/
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("wait two params");
            exit(1);
        }

        String a = (args[0]);
        String b = (args[1]);

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
