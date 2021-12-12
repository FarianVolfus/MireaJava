//Недо проверка, доработать
class NoStudentExp extends RuntimeException implements ClassU {
    public NoStudentExp(String errorMessage) {
        super(errorMessage);
    }
}
// вроде доработанно, 80% кода убрал -> Оставь бог тут в помощь