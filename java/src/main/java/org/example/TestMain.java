package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestMain {
    public static void sortList(List<Integer> list){
        for(int i = 0  ; i < list.size() - 1; i ++){
            for (int j = i + 1; j < list.size() ; j ++){
                if(list.get(i) < list.get(j)){
                    int temp = list.get(i);
                    list.set(i , list.get(j));
                    list.set(j , temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        sortList(new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9)));
    }
}
