
public class ClassDriver implements ClassU{
    public static void main(String[] args) {
        ClassU[] students = new Student[4];
        students[0] = new Student("Курамшин Никита Валерьевич", 2);
        students[1] = new Student("Ватрухин Артем Валерьевич", 4);
        students[2] = new Student("Богемкина Василиса Артемовна", 2);
        students[3] = new Student("Титанов Леви Акерманович", 3);

        QuickSort.quickSort((Student[]) students, 0, students.length - 1);

        Student.findName((Student[])students, "Ватрухин Артем Валерьевич");
        Student.findName((Student[])students, "Титанов Леви Акерманович");
        Student.findName((Student[])students, "Бес понятия что за чувак"); // провека отсутствия) - робит
    }
}
/* ЗАДАЧИ
1 - интерефейс - сделанно(бог в помощ)
2 - каркас студентов на разбор - сделанно
3 - проверка наличия тудентов - Разобраться как сделать - 70% работает вроде
4 - если не умеру, создать класс для тасков - сделанно
5 - почистить коментарии - в процессе работы
 */