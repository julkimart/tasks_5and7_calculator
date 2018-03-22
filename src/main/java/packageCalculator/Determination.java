package packageCalculator;

public class Determination {
    private String consoleTask;

    public Determination(String string) {
        this.consoleTask = string;
    }


    public static Operations getTask(String consoleTask) {
        String[] strArr; //объявляю массив
        strArr = consoleTask.split("\\s"); //заполняю массив из строки поэлементно через пробел
        double numberOne = 0;
        double numberTwo = 0;
        char operation = ' ';
        try {
            numberOne = Double.parseDouble(strArr[0]); //распарсила нулевой элемент массива в число
// System.out.println(numberOne + " number one");
            operation = strArr[1].charAt(0); //определяет тип операции
// System.out.println(operation + " type of operation");
            numberTwo = Double.parseDouble(strArr[2]); //распарсила второй элемент массива в число
// System.out.println(numberTwo + " number two");

        } catch (NumberFormatException e) { // проверяю, что пользователь ввел все правиьльно
            System.err.println("Неверный формат !");
        }
        Operations task = new Operations(numberOne, numberTwo, operation);
        return task;

    }
}