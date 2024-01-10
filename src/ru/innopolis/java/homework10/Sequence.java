package ru.innopolis.java.homework10;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        List<Integer> filteredList = new ArrayList<>();
        for (int number : array) {
            if (condition.isOk(number)) {
                filteredList.add(number);
            }
        }
        int[] filteredArray = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredArray[i] = filteredList.get(i);
        }
        return filteredArray;
    }
}