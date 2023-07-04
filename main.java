
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class main {

//     Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

    static ArrayList<Integer> arraylist = new ArrayList<>();
    static Random random = new Random();
    public static void main(String[] args) {
        task1();
    }

    static void task1(){
        for (int i = 0; i < 11; i++) {
            arraylist.add(random.nextInt(11));
        }

        System.out.println("Первоначальная коллекция: = " + arraylist);

        arraylist.removeIf(e -> (e % 2) == 0);

        System.out.println("Без четных чисел: = " + arraylist);

        arraylist.sort(Comparator.naturalOrder());

        System.out.println("Минимально число = " + arraylist.get(0));

        System.out.println("Максимальное число = " + arraylist.get(arraylist.size()-1));

        double avg = 0;

        for (Integer el : arraylist) {
            avg += el;
        }

        avg = avg / (arraylist.size());
        System.out.println("Среднее значение = " + avg);
    }
}