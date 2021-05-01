package ru.geekbrains.java_core_level2_lesson2;

public class SomeExceptions {
    public static void main(String[] args) {
        try {
            throwEx();
        } catch (MyCustomException e) {
            throw new RuntimeException("мана мана");
        }
    }

    static void throwEx() throws MyCustomException {
        throw new MyCustomException("Приветик. Ты ошибся");
    }

    private static void testEx() {
        System.out.println("Проверка до трай");
        try {
            System.out.println("до");
            Class.forName("ru.geekbrains.java_core_level2_lesson2");
            System.out.println("после");
        } catch (ClassNotFoundException | ArrayIndexOutOfBoundsException | NullPointerException e ) {
            System.out.println("провал");
        } catch (RuntimeException e) {
            System.out.println("Время выполнения");
        } finally {
            System.out.println("Наконец то");
        }

        throw new RuntimeException("ту туру ту");
    }

    private static int div1(int a, int b) {
        return div(a, b);
    }

    private static int div(int a, int b) {
        return a / b;
    }

    static class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
    }
}

