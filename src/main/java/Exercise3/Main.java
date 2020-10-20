package Exercise3;

import Exercise4.RandomArray;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
//        int ChoiceNumber;
//        System.out.println("Какую программу запустить? \n 1 - Калькулятор\n 2 - Самое большое слово в массиве\n");
//        Scanner in = new Scanner(System.in);
//        ChoiceNumber = in.nextInt();
//        switch (ChoiceNumber){
//            case 1: new ConsoleInput().input();
//            break;
//            case 2: new MaxElementInArray().initArray();
//            break;
//            default:
//                System.out.println("Не знаю такой команды");
//                break;

//        }
        RandomArray array = new RandomArray();
        array.findMinAndMaxValue();

    }
}
