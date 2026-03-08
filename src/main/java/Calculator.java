public class Calculator {
  private double num1, num2, result; // поля класса
  private String operation;

  public void SetNum1(double num1){
      this.num1 = num1;
  }
  public void SetNum2(double num2){
        this.num2 = num2;
  }

  public void SetOp(String operation){
      this.operation = operation;
  }

  protected void Action() {
      switch (operation){ // делаем switch/case
          case "+" -> { // если случай "+" ака плюс ->
              result = num1 + num2; // Задаем переменной result значение num1 + num2
              System.out.println("Ваш результат: " + result); // Выводим переменную result
          }
          case "-" -> { // если случай "-" ака минус ->
              result = num1 - num2;
              System.out.println("Ваш результат: " + result);
          }
          case "*" -> { // если случай "*" ака умножить ->
              result = num1 * num2;
              System.out.println("Ваш результат: " + result);
          }
          case "/" -> { // если случай "/" ака поделить ->
              // НО! тут может произойти исключение, по скольку можно в переменную num2 вписать ноль, а на ноль делить нельзя, так что сделаем try/catch
              try {
                  if (num2 == 0){
                      System.out.println("\nНа ноль делить нельзя!");
                  }
                  else {
                      result = num1 / num2;
                      System.out.println("Ваш результат: " + result);
                  }
              }
              catch (Exception e) {
                  e.printStackTrace();
              }
          }
          // и default блок если пользователь ввел недопустимый знак
          default -> System.out.println("Вы ввели недопустимый знак, введите другой: (+, -, * /)");
      }
  }
}
