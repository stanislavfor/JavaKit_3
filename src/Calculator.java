// Класс Calculator (необобщенный) содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
// Параметры методов – два числа разного типа, над которыми должна быть произведена операция.
// Методы возвращают результат своей работы для вывода в консоли.

public class Calculator {

    static int a = 15;
    static double b = 10.5;


    public static  <T extends Number, U extends Number> double multiply(T a, U b) {
        return  a.doubleValue() * b.doubleValue();
    }
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) throw new ArithmeticException("на 0 нельзя делить");
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("умножение чисел " + a + " и " + b + " = " + Math.round(multiply(a,b) * 10) / 10.0);
        System.out.println("деление чисел " + a + " и " + b + " = " + Math.round(divide(a,b) * 10) / 10.0);
        System.out.println("сумма чисел " + a + " и " + b + " = " + Math.round(sum(a,b) * 10) / 10.0);
        System.out.println("вычитание чисел " + a + " и " + b + " = " + Math.round(subtract(a,b) * 10) / 10.0);
    }

}
