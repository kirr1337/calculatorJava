import java.util.Scanner;

class Main{
    static void main(){
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("\nДобро пожаловать в калькулятор");

        while (isRunning) {
            System.out.println("Введите первое число: ");
            calculator.SetNum1(input.nextDouble()); // берем ввод у пользователя:

            System.out.println("\nХорошо, теперь введите знак действия(+, -, *, /)\nили нажмите \"q\" для выхода: ");
            String op = input.next(); //

            if (op.equalsIgnoreCase("q"))
            {
                break;
            }
            calculator.SetOp(op); // берем ввод у пользователя:

            System.out.println("\nИ наконец, введите второе число: ");
            calculator.SetNum2(input.nextDouble());// берем ввод у пользователя:

            calculator.Action(); // Сама логика программы находится в классе Calculator
        }
        System.out.println("Работа завершена. До свидания!");
        input.close();
    }
}
