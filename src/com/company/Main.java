package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
//        1. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        int[] arrayFibonachchi = new int[20];
        arrayFibonachchi[0] = 1;
        arrayFibonachchi[1] = 1;
        for (int i = 2; i < arrayFibonachchi.length; i++) {
            arrayFibonachchi[i] = arrayFibonachchi[i - 1] + arrayFibonachchi[i - 2];
        }
        System.out.println(Arrays.toString(arrayFibonachchi));


        System.out.println("Task 2");
//        2. Написать код, который заполнит массив произвольного размера числами по
//        возрастанию, начиная с центра массива, например, `[5,4,3,2,1,0,1,2,3,4,5]`.


        System.out.println("Task 3");
//        3. Найти в массиве число, которое повторяется наибольшее количество раз.
        int valueArrayTemplate = 0;
        int[] arrayTemplate = new int[20];
        Random random = new Random();
//        for (int i = 0; i < arrayTemplate.length; i++) {
//            arrayTemplate[i] = random.nextInt(1, 5);
//        }
//        System.out.println(Arrays.toString(arrayTemplate));
//        for (int i = 0; i < arrayTemplate.length; i++) {
//            int counterArrayTemplate = 0;
//            for (int j = 0; j < arrayTemplate.length; j++) {
//                if (arrayTemplate[i] == arrayTemplate[j]) {
//                    counterArrayTemplate++;
//                }
//            }
//            System.out.println(counterArrayTemplate);
//        }


        System.out.println("Task 4");
//        4. Написать код для зеркального переворота элементов в массиве
//        `([1, 2, 3, 4] -> [4, 3, 2, 1])`.
        int[] arrayMirror = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayMirror));
        int tempValueMirror = 0;
        int counterMirror = 1;
        for (int i = 0; i < arrayMirror.length / 2; i++) {
            tempValueMirror = arrayMirror[arrayMirror.length - counterMirror];
            arrayMirror[arrayMirror.length - counterMirror] = arrayMirror[i];
            arrayMirror[i] = tempValueMirror;
            counterMirror++;
        }
        System.out.println(Arrays.toString(arrayMirror));


        System.out.println("Task 5");
//        5. Создать двумерный массив из 8 строк по 5 столбцов в каждой из
//        случайных целых чисел из отрезка `[10;99]`. Вывести массив на экран.
        int[][] array2Dimension = new int[8][5];
        for (int i = 0; i < array2Dimension.length; i++) {
            for (int j = 0; j < array2Dimension[i].length; j++) {
                array2Dimension[i][j] = random.nextInt(10, 99);
            }
        }
        for (int i = 0; i < array2Dimension.length; i++) {
            for (int j = 0; j < array2Dimension[i].length; j++) {
                System.out.print(" " + array2Dimension[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Task 6");
//        6. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых
//        чисел из отрезка `[0;9]`. Вывести массив на экран. Преобразовать массив таким
//        образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При
//        этом изменять состав массива нельзя, а можно только переставлять элементы в рамках
//        одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить
//        только одну перестановку, а можно отсортировать по убыванию каждую строку). Вывести
//        преобразованный массив на экран.
        int[][] arrayDimensionMax = new int[6][7];
        for (int i = 0; i < arrayDimensionMax.length; i++) {
            for (int j = 0; j < arrayDimensionMax[i].length; j++) {
                arrayDimensionMax[i][j] = random.nextInt(0, 9);
            }
        }
        for (int i = 0; i < arrayDimensionMax.length; i++) {
            for (int j = 0; j < arrayDimensionMax[i].length; j++) {
                System.out.print(" " + arrayDimensionMax[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < arrayDimensionMax.length; i++) {
            for (int j = 0; j < arrayDimensionMax[i].length; j++) {
                int tempDemensionMax = 0;
                if (arrayDimensionMax[i][0] < arrayDimensionMax[i][j]) {
                    tempDemensionMax = arrayDimensionMax[i][0];
                    arrayDimensionMax[i][0] = arrayDimensionMax[i][j];
                    arrayDimensionMax[i][j] = tempDemensionMax;
                }
            }
        }
        System.out.println("---");
        for (int i = 0; i < arrayDimensionMax.length; i++) {
            for (int j = 0; j < arrayDimensionMax[i].length; j++) {
                System.out.print(" " + arrayDimensionMax[i][j] + " ");
            }
            System.out.println(" ");
        }


        System.out.println("Task 7");
//        Дан массив с числами `5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4`.
//        Переместить все нули в начало массива.
        int[] arrayZeroLeft = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        System.out.println(Arrays.toString(arrayZeroLeft));
        for (int i = 0; i < arrayZeroLeft.length; i++) {
            if (arrayZeroLeft[i] != 0) ;
            {
                int tempZeroLeft = 0;
                for (int j = 0; j < arrayZeroLeft.length; j++) {
                    if (arrayZeroLeft[j] != 0) {
                        tempZeroLeft = arrayZeroLeft[j];
                        arrayZeroLeft[j] = arrayZeroLeft[i];
                        arrayZeroLeft[i] = tempZeroLeft;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arrayZeroLeft));


        System.out.println("Task 8");
//        Дан массив с числами `5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4`.
//        Переместить все нули в конец массива.
        int[] arrayZeroRight = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};
        System.out.println(Arrays.toString(arrayZeroRight));
        for (int i = 0; i < arrayZeroRight.length; i++) {
            if (arrayZeroRight[i] != 0) ;
            {
                int tempZeroRight = 0;
                for (int j = 0; j < arrayZeroRight.length; j++) {
                    if (arrayZeroRight[j] == 0) {
                        tempZeroRight = arrayZeroRight[j];
                        arrayZeroRight[j] = arrayZeroRight[i];
                        arrayZeroRight[i] = tempZeroRight;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arrayZeroRight));


        System.out.println("Task 9");
        // Программа должна создать массив из 12 случайных целых чисел из отрезка `[-10;10]` таким образом,
        // чтобы отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок
        // следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает
        // сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через
        // один и пр.). Вывести полученный массив на экран.

        int[] arrayRandom = new int[12];
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < arrayRandom.length; i++) {


            arrayRandom[i] = random.nextInt(-10, 10);

            if (arrayRandom[i] == 0) {
                while (arrayRandom[i] == 0){
                    arrayRandom[i] = random.nextInt(-10, 10);
                    if (c1 < arrayRandom.length / 2 && arrayRandom[i] < 0) {
                        c1++;
                    } else if (c2 < arrayRandom.length / 2 && arrayRandom[i] > 0) {
                        c2++;
                    } else if (c2 >= arrayRandom.length / 2) {
                        while (arrayRandom[i] >= 0) {
                            arrayRandom[i] = random.nextInt(-10, 10);
                            if (c1 < arrayRandom.length / 2 && arrayRandom[i] < 0) {
                                c1++;
                            }
                        }
                    } else if (c1 >= arrayRandom.length / 2) {
                        while (arrayRandom[i] <= 0) {
                            arrayRandom[i] = random.nextInt(-10, 10);
                            if (c2 < arrayRandom.length / 2 && arrayRandom[i] > 0) {
                                c2++;
                            }
                        }
                    }
                }
            } else if (c2 > arrayRandom.length / 2) {
                while (arrayRandom[i] >= 0) {
                    arrayRandom[i] = random.nextInt(-10, 10);
                    if (c1 < arrayRandom.length / 2 && arrayRandom[i] < 0) {
                        c1++;
                    }
                }
            } else if (c1 > arrayRandom.length / 2) {
                while (arrayRandom[i] <= 0) {
                    arrayRandom[i] = random.nextInt(-10, 10);
                    if (c2 < arrayRandom.length / 2 && arrayRandom[i] > 0) {
                        c2++;
                    }
                }
            } else if (c1 < arrayRandom.length / 2 && arrayRandom[i] < 0) {


                        c2++;


            } else if (c2 < arrayRandom.length / 2 && arrayRandom[i] > 0) {
                        c2++;
                    }

                    }
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println(c1);
        System.out.println(c2);
    }
}
