// быстрая сортировка - услажнененая мной оч сильно
class QuickSort implements ClassU{
    public static void quickSort(Student[] array, int left, int right) {
        if (left < right) {
            int pvIndex = partition(array, left, right);
            quickSort(array, left, pvIndex - 1);
            quickSort(array, pvIndex + 1, right);
        }
    }

    private static int partition(Student[] array, int left, int right) {
        Student pivot = array[right];
        int partIndex = left;

        for (int i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 1) {
                swap(array, i, partIndex);
                partIndex++;
            }
        }

        swap(array, partIndex, right);

        return partIndex;
    }
    // через swap будет проще - костыль - попытаться иисправить
    private static void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// Завершенно - правки не нужны