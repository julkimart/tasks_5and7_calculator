import packageCalculator.ExceptionDivisor;
import packageCalculator.Operations;

import java.io.PrintStream;
import java.util.Scanner;

import static packageCalculator.Determination.getTask;
import static packageCalculator.Operations.*;


public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter an expression with spaces: "); //введите пример с пробелами
        String expression = scanner.nextLine(); //считываю все выражение в строку


        Operations task = getTask(expression); //вызываю метод из класса Determination


        switch (task.getOperation()) {
            case '+': {
                PrintStream resultOfAddition = getAddition(task.getNumberOne(), task.getNumberTwo());
            }
            break;

            case '-': {
                PrintStream resultOfSubtraction = getSubtraction(task.getNumberOne(), task.getNumberTwo());
            }
            break;

            case '/' : {
                try {
                        PrintStream resultOfDivision = getDivision(task.getNumberOne(), task.getNumberTwo());
                }
                catch (ExceptionDivisor e) {
                    System.err.println(e.getMessage()); //делить на ноль нельзя
                }
            }
            break;

            case '*' : {
                PrintStream resultOfMultiplication = getMultiplication(task.getNumberOne(), task.getNumberTwo());
            }
            break;

            default:
                System.out.println("Invalid choice"); //выбор отличается от возможных операций
        }


    }
}