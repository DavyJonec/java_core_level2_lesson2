package ru.geekbrains.java_core_level2_lesson2;

public class Homework2 {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{
                {"27", "8", "34", "1"},
                {"12", "22", "712", "253"},
                {"368", "4", "-500", "27"},
                {"639", "131", "-90", "21"}};

        String[][] array2 = new String[][]{
                {"23", "13", "32", "13"},
                {"-348", "2", "3", "42", "784"},
                {"1267", "2", "4", "354"},
                {"4569", "1201", "-47", "-1200"}};

        String[][] array3 = new String[][]{
                {"123", "-239", "2", "254"},
                {"235", "3245", "pug", "2354"},
                {"-630", "-902", "42", "565"},
                {"5123", "3020", "-47", "-1230"}};


        try {
            SummaArrays.sum(array1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {

        }

        try {
            SummaArrays.sum(array2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            SummaArrays.sum(array3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

