package ru.geekbrains_DZ_1;

public class Main {

    public static void main(String[] args) {

        // #2
        TipPer();
        // #3
        float result = PerExp(10.2f, 4.4f, 5.3f, 8.05f);
        System.out.println("Задание №3 = " + result);
        // #4
        boolean summ = Diapozon4isel(5, 6);
        System.out.println("Задание №4 = " + summ);
        // #5
        PrtTruFal();
        // #6
        boolean res = MetodNum(-1);
        System.out.println("Задание №6 = " + res);
        // #7
        StrName();
        // #8
        Years();

    }

    // #2 Создать переменные всех пройденных типов данных
    // и инициализировать их значения.
    public static void TipPer() {
        byte be = 1;
        short st = 12;
        int it = 1234;
        long lg = 12345678L;

        float ft = 12.25f;
        double de = 1234.5;

        char cr = 'Q';
        boolean bn = true; //("false, true");
        System.out.println("Задание №2 = " + lg + "," + " " + de + "," + " " + bn);
    }
    //////////////////////////////////////////////////////////////////////////////

    // #3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float PerExp(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    //////////////////////////////////////////////////////////////////////////////

    // #4 Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean Diapozon4isel(int a, int b) {

        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        }
        return false;
    }
    //////////////////////////////////////////////////////////////////////////////

    // #5 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void PrtTruFal() {
        int i = -1;

        if (i >= 0)
            System.out.println("Задание №5 Число Положительное ))");

        else if (i < 0)
            System.out.println("Задание №5 Число Отрицательное ((");
    }
    //////////////////////////////////////////////////////////////////////////////

    // #6 Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean MetodNum(int i) {
    int res = i;
    if (res >= 0) {
        return false;
    }
        return true;
    }
    //////////////////////////////////////////////////////////////////////////////

    // #7 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void StrName() {
        String sg1 = "Сергей";
        String sg2 = "Артём";
        String sg3 = "Кирилл";
        System.out.println("Задание №7 Привет, " + sg1 + " " + sg2 + " " + sg3 + "!");
    }
    //////////////////////////////////////////////////////////////////////////////

    // #8 Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void Years() {
        int DayYear = 2020;
        if ((DayYear % 100 !=0) && (DayYear % 4 == 0) || (DayYear % 400 == 0)) { // немного подсмотрел решение((
            System.out.println("Задание №8 Год является високосным!");
        }
        else {
            //System.out.println("Задание №8 Год является не високосным!");
        }
    }
}
