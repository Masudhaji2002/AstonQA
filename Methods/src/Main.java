public class Main {
    public static void main(String[] args) {
        TaskMethods methods = new TaskMethods();
        int[] array = new int[100];
        int[] array1 = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                methods.printColor(0);
        methods.printThreeWords();
        methods.checkSumSign(10, -6);
        methods.compareNumbers(10, 5);
        methods.isSumBetween10And20(5, 7);
        methods.printPositivity(5);
        methods.isNegative(-4);
        methods.repeatString("Hello world!", 10);
        methods.isLeapYear(15);
        methods.invertArray(array1);
        methods.fillArray(array);
        methods.modifyArray(array2);
    }
}