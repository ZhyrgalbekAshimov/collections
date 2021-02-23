import java.util.ArrayList;
import java.util.Collections;

public class Services {

    ArrayList<Integer> createRandomElements(ArrayList<Integer> numbers, int numOfElements) {

        for (int i = 0; i < numOfElements; i++) {

            int a = (int) (Math.random() * ((100 - 1) + 1)) + 1;
            numbers.add(a);

        }
        return numbers;
    }



    int findMax(ArrayList<Integer> numbers) {

        return Collections.max(numbers);
    }


    int findMin(ArrayList<Integer> numbers) {

        return Collections.min(numbers);
    }


    int findMaxValue(ArrayList<Integer> numbers) {

        Collections.sort(numbers);

        int[] nums = new int[numbers.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numbers.get(i);
        }

        int max = 0;
        int counter = 0;
        int maxValue = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 0) {
                counter++;
            } else {
                if (max < counter) {
                    maxValue = nums[i - 1];
                    max = counter;

                }
                counter = 0;
            }

        }


        return maxValue;
    }


    ArrayList<Integer> sortList(ArrayList<Integer> numbers) {

        Collections.sort(numbers);
        return numbers;
    }


    int frequencyOfNumber_5 (ArrayList<Integer> numbers) {

        return Collections.frequency(numbers, 5);

    }


    int frequencyOfNumber_7 (ArrayList<Integer> numbers) {

        return Collections.frequency(numbers, 7);

    }


    int shuffleList (ArrayList<Integer> numbers1, ArrayList<Integer> numbers2){

       int numberOfAttemptsOfShuffle = 0;


        do  {
            numberOfAttemptsOfShuffle++;

            Collections.shuffle(numbers2);
            int counter = 0;
            for (int j = 0; j < numbers1.size(); j++){

                counter++;

                    if ((counter==numbers1.size()) && (numbers1.get(j).equals(numbers2.get(j)))){

                        return numberOfAttemptsOfShuffle;

                    }

                    else if (!(numbers1.get(j).equals(numbers2.get(j)))){

                        counter = 0;

                    }

                }

        }
        while (true);

        }


    int shuffleListAndSort (ArrayList<Integer> numbers1){

        ArrayList<Integer> numbers2 = new ArrayList<>();

        createRandomElements(numbers2, 5);
        Collections.copy(numbers2, numbers1);
        Collections.sort(numbers2);
        int numberOfAttemptsOfShuffle = 0;

        do {
            numberOfAttemptsOfShuffle++;
            Collections.shuffle(numbers1);
            int counter = 0;

            for (int j = 0; j < numbers1.size(); j++){
                  counter++;

                if ((counter==numbers1.size()) && (numbers1.get(j).equals(numbers2.get(j)))){

                    return numberOfAttemptsOfShuffle;
                }
                else if (!(numbers1.get(j).equals(numbers2.get(j)))){

                    counter = 0;

                }
            }

        }
        while (true);

        }
    }