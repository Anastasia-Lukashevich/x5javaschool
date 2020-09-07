package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задание 1
        System.out.println("Задание 1. Введите целое чиcло: ");
        System.out.println("Последнее введенное число: " + getLastNum(scanner.nextInt()));
        // Задание 2
        System.out.println("Задание 2. Введите трехзначное чиcло: ");
        System.out.println("Сумма трех цифр: " + getNumSum(scanner.nextInt()));
        // Задание 3
        System.out.println("Задание 3. Введите положительное или отрицательное число: ");
        System.out.println("Итоговое значение: " + countPositiveNum(scanner.nextInt()));
        // Задание 4
        System.out.println("Задание 4. Введите положительное или отрицательное число: ");
        System.out.println("Итоговое значение: " + changeNumber(scanner.nextInt()));
        // Задание 5
        System.out.println("Задание 5. Введите три целых числа: ");
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Наименьшее из введенных чисел: " + countMinNum(nums));
        // Задание 6
        System.out.println("Задание 6. Введите целое число: ");
        System.out.println(describeNum(scanner.nextInt()));
        // Задание 7
        System.out.println("Задание 7. Введите код города:");
        int code = scanner.nextInt();
        System.out.println("Введите количество минут:");
        int min = scanner.nextInt();
        System.out.println(minutePrice(code, min));
        // Задание 8
        System.out.println("Задание 8. Работа с массивом");
        calcArray();
        // Задание 9
        System.out.println("Задание 9. Элементы массива в обратном порядке");
        reverseArray();
        // Задание 10
        System.out.println("Задание 10. Нули перемещены в конец массива");
        zeroMoveToEnd();
    }

    public static int getLastNum(int num) {
        return num % 10;
    }

    public static int getNumSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public static int countPositiveNum(int num) {
        return num > 0 ? num + 1 : num;
    }

    public static int changeNumber(int num) {
        if (num > 0) {
            return num + 1;
        }
        if (num == 0) {
            return 10;
        }
        return num - 2;
    }

    public static int countMinNum(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static String describeNum(int num) {
//        String message = "";
//        if (num > 0) {
//            message += "Положительное";
//        }
//        if (num == 0) {
//            return "Нулевое число";
//        }
//        if (num < 0) {
//            message += "Отрицательное";
//        }
//        if (num % 2 == 0) {
//            return message + " четное число";
//        }
//        return message + " нечетное число";

        if (num >= 0) {
            if (num == 0) {
                return "Нулевое число";
            } else {
                if (num % 2 == 0) {
                    return "Положительное четное число";
                } else {
                    return "Положительное нечетное число";
                }
            }
        } else {
            if (num % 2 == 0) {
                return "Отрицательное четное число";
            } else {
                return "Отрицательное нечетное число";
            }
        }

    }

    public static String minutePrice(int countryCode, int min) {
        double moscowPrice = 4.15;
        double rostovPrice = 1.98;
        double krasnodarPrice = 2.69;
        double kirovPrice = 5.00;

        return switch (countryCode) {
            case 905 -> "Москва. Стоимость разговора: " + moscowPrice * min;
            case 194 -> "Ростов. Стоимость разговора: " + rostovPrice * min;
            case 491 -> "Краснодар. Стоимость разговора: " + krasnodarPrice * min;
            case 800 -> "Киров. Стоимость разговора: " + kirovPrice * min;
            default -> "Введен неизвестный код города!";
        };
    }

    public static void calcArray() {
        int[] nums = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = nums[0];
        int sumPlus = 0;
        int sumMinus = 0;
        int sumMultiple = 0;
        int countPlus = 0;
        int countMinus = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num > 0) {
                sumPlus += num;
                countPlus++;
            }
            if (num < 0) {
                sumMinus += num;
                countMinus++;
                if (num % 2 == 0) {
                    sumMultiple += num;
                }
            }
        }
        double avgMinus = (double) sumMinus / countMinus;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных элементов: " + sumPlus);
        System.out.println("Сумма четных отрицательных элементов: " + sumMultiple);
        System.out.println("Количество положительных элементов: " + countPlus);
        System.out.println("Среднее арифметичское отрицательных элементов: " + avgMinus);
    }

    public static void reverseArray() {
        int[] nums = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int a;
        for (int i = 0; i < nums.length / 2; i++) {
            a = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void zeroMoveToEnd() {
        int[] nums = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int swap;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0) {
                    swap = nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
