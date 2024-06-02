// Обобщенный класс AnotherPair имеет два значения разного типа.
// Класс имеет методы getFirst(), getSecond() для получения значений каждого из составляющих пары
// и имеет переопределение метода toString(), возвращающее строковое представление пары.

public class AnotherPair<T, U> {
    private T first;
    private U second;

    public AnotherPair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "AnotherPair {" + "first = " + first + ", second = " + second + '}';
    }


    public static void main(String[] args) {
        AnotherPair<Integer, String> pair1 = new AnotherPair<>(1, "Greekbrains");
        AnotherPair<String, Integer> pair2 = new AnotherPair<>("Greekbrains", 2);
        System.out.println(pair1);
        System.out.println(pair2);
    }
}
