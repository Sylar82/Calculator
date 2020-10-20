package Exercise4;


import java.util.Arrays;

public class RandomArray {
    private static int[] initRandomArray() {
        System.out.println("Source array: ");
        int[] randomArray;
        randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(randomArray));
        return randomArray;
    }

    public void findMinAndMaxValue() {
        int[] arr = initRandomArray();
        int maxNegativeValue = -10;
        int minPositiveValue = 10;
        int positiveIndex = 0, negativeIndex = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] < 0 && arr[i] >= maxNegativeValue) {
                //if (arr[i] > maxNegativeValue) {
                   negativeIndex = i;
                   maxNegativeValue = arr[i];


            //       }
                }
                else if (arr[i] > 0 && arr[i] <= minPositiveValue) {
                    //    if () {
                            positiveIndex = i;
                            minPositiveValue = arr[i];

                  //    }
            }
        }
                System.out.println("Minimal positive: " + arr[positiveIndex]);
                System.out.println("Maximum negative: " + arr[negativeIndex]);
                temp = arr[positiveIndex];
                arr[positiveIndex] = arr[negativeIndex];
                arr[negativeIndex] = temp;
        System.out.println("Final Array: \n" + Arrays.toString(arr));

    }
}

