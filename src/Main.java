import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        System.out.println("Введите выражение в формате: число оператор число");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("throws Exception");
            return;
        }

        int operand1, operand2;

        try {
            operand1 = Integer.parseInt(parts[0]);
            operand2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
            return;
        }

        char operator = parts[1].charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("throws Exception: деление на ноль");
                    return;
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("throws Exception: недопустимый оператор");
                return;
        }

        System.out.println(result);
    }
}
