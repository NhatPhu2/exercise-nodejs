package org.example;

import java.util.*;

public class ExerciseMap {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for(int i = 1 ; i <= 100 ; i ++){
//            list.add(i);
//        }
//        System.out.println(classifyPrime(list));
//        System.out.println(classifyPrime(list).get("prime"));
//        System.out.println(classifyPrime(list).get("not prime"));
//        Election elec = new Election();
//
//        elec.vote("Obama");
//        elec.vote("Abraham Lincon");
//        elec.vote("Abraham Lincon");
//        System.out.println(elec.winner());
//        System.out.println(dedupe("aabbcc"));
        Inventory inventory = new Inventory();
        Product candy = new Product("candy",20000);
        Product snack = new Product("snack",20000);
        Product mint = new Product("mint",20000);
        Product cola = new Product("cola",20000);
        Product candy2 = new Product("candy",200);
        inventory.put(candy);
        inventory.put(candy2);
        inventory.put(snack);
        inventory.put(mint);
        inventory.put(cola);
//        inventory.remove("candy");
        List<Product> candies = inventory.get("candy");
        System.out.println(inventory.totalPriceOf("candy"));
        System.out.println(inventory.countTotal("candy"));
        for(Product product : candies){
            System.out.println(product.getName());
            System.out.println(product.getPrice());
        }
    }

    public static List<String> dedupe(String str) {
        String[] strs = str.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strs) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        List<String> arr = new ArrayList<>();
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            if (set.getValue() == 1)
                arr.add(set.getKey());
        }
        return arr;
    }

    public static HashMap<String, List<Integer>> classifyPrime(List<Integer> nums) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<Integer> notPrimeValue = new ArrayList<>();
        List<Integer> primeValue = new ArrayList<>();
        for (Integer number : nums) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (number >= 2) {
                if (isPrime) {
                    primeValue.add(number);
                }
                if (!isPrime) {
                    notPrimeValue.add(number);
                }
            }
        }
        map.put("not prime", notPrimeValue);
        map.put("prime", primeValue);
        return map;
    }


}
