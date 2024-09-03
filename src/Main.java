
        public class Main {
            public static void main (String[]args){
                        printThreeWords();  //Q1
                        checkSumSign();     //Q2
                        printColor();       //Q3
                        compareNumbers();   //Q4

                        //Q5
                        int num1 = 5;
                        int num2 = 7;
                        System.out.println(checkSumInRange(num1, num2));

                        //Q6
                        checkPositiveOrNegative(-5);

                        //Q7
                        int number = 10;
                        boolean isNegative = isNegativeNumber(number);
                        System.out.println(isNegative);

                        //Q8
                        printStringNTimes("Hello, world!", 3);

                        //Q9
                        int year1 = 2020;
                        int year2 = 1900;
                        System.out.println(isLeapYear(year1));
                        System.out.println(isLeapYear(year2));

                        //Q10
                        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

                        System.out.println("Исходный массив:");
                        printArray(arr);

                        // Заменяем 0 на 1 и 1 на 0
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == 0) {
                                arr[i] = 1;
                            } else if (arr[i] == 1) {
                                arr[i] = 0;
                            }
                        }

                        System.out.println("Массив после замены:");
                        printArray(arr);

                        //Q11
                        int[] ann = new int[100];
                        for (int i = 0; i < 100; i++) {
                            ann[i] = i + 1;
                        }
                        System.out.println("Заполненный массив:");
                        printArray11(ann);

                        //Q12
                        int[] aii = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                        System.out.println("Исходный массив:");
                        printArray12(aii);

                        for (int i = 0; i < arr.length; i++) {
                            if (aii[i] < 6) {
                                aii[i] *= 2;
                            }
                        }

                        System.out.println("Массив после обработки:");
                        printArray12(aii);

                        // Q13
                        int n = 5;
                        int[][] matrix = new int[n][n];

                        for (int i = 0; i < n; i++) {
                            matrix[i][i] = 1;
                        }

                        // Выводим массив на экран
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }

                        //Q14
                int len = 5; // Длина массива
                int initialValue = 10; // Начальное значение ячеек

                // Вызов метода и сохранение результата в переменную
                int[] resultArray = ArrayInitializer.initializeArray(len, initialValue);

                // Вывод результирующего массива на экран
                for (int num : resultArray) {
                    System.out.println(num);
                } 
            }

            public static void printThreeWords() {
                System.out.println("Orange");
                System.out.println("Banana");
                System.out.println("Apple");
            }

            public static void checkSumSign() {
                int a = -10, b = 3;
                if (a + b >= 0) {
                    System.out.println("Сумма положительная");
                } else {
                    System.out.println("Сумма отрицательная");
                }
            }

            public static void printColor() {
                int value = 115;
                if (value <= 0) {
                    System.out.println("Красный");
                } else if (value > 0 && value <= 100) {
                    System.out.println("Желтый");
                } else {
                    System.out.println("Зеленый");
                }
            }

            public static void compareNumbers() {
                int a = 10, b = 100;
                if (a >= b) {
                    System.out.println("a>=b");
                } else {
                    System.out.println("a<b");
                }
            }

            public static boolean checkSumInRange(int a, int b) {
                int sum = a + b;
                return sum >= 10 && sum <= 20;
            }

            public static void checkPositiveOrNegative(int number) {
                if (number >= 0) {
                    System.out.println("Положительное число");
                } else {
                    System.out.println("Отрицательное число");
                }
            }

            public static boolean isNegativeNumber(int number) {
                return number < 0;
            }

            public static void printStringNTimes(String str, int n) {
                for (int i = 0; i < n; i++) {
                    System.out.println(str);
                }
            }

            public static boolean isLeapYear(int year) {
                if (year % 400 == 0) {
                    return true;
                } else if (year % 100 == 0) {
                    return false;
                } else if (year % 4 == 0) {
                    return true;
                } else {
                    return false;
                }
            }

            public static void printArray(int[] arr) {
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            public static void printArray11(int[] ann) {
                for (int i : ann) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

            public static void printArray12(int[] aii) {
                for (int i : aii) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }