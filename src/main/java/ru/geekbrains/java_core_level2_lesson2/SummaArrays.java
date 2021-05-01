package ru.geekbrains.java_core_level2_lesson2;

public class SummaArrays {
    public static int sum(String[][] arr) {
        if (arr.length != 4) throw new MyArraySizeException("Мальчик, водочки нам принеси, мы в массив 4 на 4 летим");
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x].length != 4) throw new MyArraySizeException("Мальчик, водочки нам принеси, мы в массив 4 на 4 летим");
            for (int y = 0; y < arr[x].length; y++) {
                try {
                    sum += Integer.parseInt(arr[x][y]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Это не водочка [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Сумма чисел массива: " + sum);
        return sum;
    }
}
