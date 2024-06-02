// Обобщенный метод compareArrays() принимает два (три) массива и возвращает true, если они одинаковые,
// и возвращает false в случае, если массивы разные.
// Примечание: Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.


public class ArrayComparator {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arrayInteger1 = {1, 2, 3};
        Integer[] arrayInteger2 = {1, 2, 3};

        String[] arrayString1 = {"a", "b", "c"};
        String[] arrayString2 = {"a", "b", "c"};

        Character[] arrayChar1 = {'☺', '⌨', '♠'};
        Character[] arrayChar2 = {'☺', '☹', '❄'};

        System.out.println("Массивы чисел равны : " + compareArrays(arrayInteger1, arrayInteger2));
        System.out.println("Массивы строк равны : " + compareArrays(arrayString1, arrayString2));
        System.out.println("Массивы символов равны : " + compareArrays(arrayChar1, arrayChar2));
    }
}
