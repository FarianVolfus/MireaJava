
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // попытка с buferRederom не увенчалась успехом
        // ЗАПОМНИТЬ -> БафРедер используем только для файлов
        String name;

        System.out.println("Введите ФИО создания");
        name = scanner.nextLine();
        System.out.println("Введите ИНН работника");
        while (true){
            try {
                String INN = scanner.nextLine();
                if (!INN.matches("\\d{12}"))
                    throw new NumbersOf_INN("Должно быть 12 цифр", scanner.ioException());
                else
                    System.out.println("ok");
            } catch (NumbersOf_INN e){
                System.out.println(e);
            }
        }
    }
}
// если его не существует - вызывай ФСБ
class NumbersOf_INN extends Exception{
    public NumbersOf_INN(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
//Завершенно правки не нужны