// Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

import java.util.Random;
import java.util.ArrayList;
public class program{
    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        int c = random.nextInt(100);
        int d = random.nextInt(100);
        int z = random.nextInt(100);
        ArrayList<Integer> list_1 = new ArrayList<Integer>();
        list_1.add(a);
        list_1.add(b);
        list_1.add(c);
        list_1.add(d);
        list_1.add(z);
        System.out.println(list_1);
        for (int i = 0; i < list_1.size(); i++) {
            if (list_1.get(i) % 2 == 0) {
                list_1.remove(i);
            }
        }
        System.out.println(list_1);
    }
}

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметическое из этого списка.