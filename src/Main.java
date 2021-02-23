import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Services services = new Services();



        //      1. Создать список из 100 рандомных элементов от 1 до 100

        ArrayList<Integer> numbers = new ArrayList<>();
        services.createRandomElements(numbers, 100);

        //      2. Найти максимальное число
        System.out.println("********************************************");

        System.out.print("2) MAX number: ");
        System.out.println(services.findMax(numbers));


        //      3. Найти минимальное  число
        System.out.println("********************************************");

        System.out.print("3) MIN number: ");
        System.out.println(services.findMin(numbers));


        //      4. Найти число, которое чаще всего повторяется
        System.out.println("********************************************");

        System.out.print("4) The most frequency value: ");
        System.out.println(services.findMaxValue(numbers));


        //      5. Отсортировать список

        services.sortList(numbers);


        //      6. Найти в этом списке числа 5, 7 и сколько раз они повторяются
        System.out.println("********************************************");

        System.out.print("6) The number 5 is repeated: ");
        System.out.println(services.frequencyOfNumber_5(numbers) + " times");
        System.out.print("6) The number 7 is repeated: ");
        System.out.println(services.frequencyOfNumber_7(numbers) + " times.");


        //      7. Создать 2 списка из 10 элементов от 1 до 100.
        //         Проверить с какой попытки у вас получится создать списки с уникальными значениями
        System.out.println("********************************************");

        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();

        services.createRandomElements(numbers1, 10);
        services.createRandomElements(numbers2, 10);

        int numberOfAttempts;

        for (numberOfAttempts = 1; !Collections.disjoint(numbers1, numbers2); numberOfAttempts++) {
            numbers1.clear();
            numbers2.clear();
            services.createRandomElements(numbers1, 10);
            services.createRandomElements(numbers2, 10);

        }

        System.out.print("7) Number of attempts to create unique values: ");
        System.out.println(numberOfAttempts);


        //      8. Создать список из 5 элементов с рандомными числами от 1 до 100. Создать копию этого списка.
        //         а. Перемешивать, пока порядок не станет прежним
        System.out.println("********************************************");

        ArrayList<Integer> randomNumbers1 = new ArrayList<>();
        ArrayList<Integer> randomNumbers2 = new ArrayList<>();

        services.createRandomElements(randomNumbers1, 5);
        services.createRandomElements(randomNumbers2, 5);

        Collections.copy(randomNumbers2, randomNumbers1);

        System.out.print("8) Number of attempts to shuffle then sort: ");
        System.out.println(services.shuffleList(randomNumbers1, randomNumbers2));


        //      9. Создать список из 5 элементов с рандомными числами от 1 до 100.
        //      Перемешивать, пока не будет отсортирован по возрастанию. Вывести количество попыток
        System.out.println("********************************************");

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        services.createRandomElements(randomNumbers, 5);

        System.out.print("9) Number of attempts to sort: ");
        System.out.println(services.shuffleListAndSort(randomNumbers));


    }


}

