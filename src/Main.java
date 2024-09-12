//1.
//Напишите метод на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException
//2.
//Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3.
//В методе main( вызвать полученный метод, обработать возможные
//исключения MyArraySizeException и MyArrayDataException
//вывести результат расчета.
        public class Main {
            public static void main (String[]args) {
                String[][] array = {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };

                try {
                    int sum = sumArrayElements(array);
                    System.out.println("Sum of array elements: " + sum);
                } catch (MyArraySizeException | MyArrayDataException e) {
                    System.out.println(e.getMessage());
                }
            }
    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Array size is not 4x4");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Invalid data at cell [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}

    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
        super(message);
        }
    }

    class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
        super(message);
        }
    }


