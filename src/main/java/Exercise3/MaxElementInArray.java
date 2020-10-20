package Exercise3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxElementInArray {
    public void initArray(){
        System.out.println("Введите размер массива: ");
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        String[] Array = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите значение " + i + " массива");
            Array[i] = in.nextLine();
        }

        Arrays.sort(Array, Collections.reverseOrder());

        System.out.println(Array[0] + "- Максимальный элемент массива" );


    }
}
