package org.example;

import OOPExercise.EX1.CollegeStudent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn chức năng");
        System.out.println("1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.");
        System.out.println("2. Viết một chương trình để tạo một HashSet từ một ArrayList.");
        System.out.println("3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.");
        System.out.println("4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.");
        System.out.println("5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.");
        System.out.println("6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.");
        System.out.println("7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.");
        System.out.println("8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.");
        System.out.println("9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.");
        System.out.println("10. Xóa các phần tử trùng lặp từ một ArrayList.");
        System.out.println("11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.");
        System.out.println("12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.");
        System.out.println("13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.");
        System.out.println("14. Kiểm tra xem một ArrayList có rỗng hay không.");
        System.out.println("15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.");
        System.out.println("16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.");
        System.out.println("17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.");
        System.out.println("18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.");
        System.out.println("19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.");
        System.out.println("20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.");
        int option = scanner.nextInt();
        switch (option) {
            case 1: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                List.of();
                ArrayList<Integer> a = new ArrayList<>();
                System.out.println(sumArray(arr));
                break;
            }
            case 2: {
//                ArrayList<Integer> l = new ArrayList<>(List.of(1, 1, 1, 2, 3, 4, 5, 1, 2, 3, 5, 6, 7));
//                removeDuplicate(l);
//                System.out.println(l);
                break;
            }
            case 3: {
                LinkedList<String> list = new LinkedList<>(List.of("a", "c", "b", "e"));
                reverseListString(list);
                break;
            }
            case 4: {

            }
            case 5: {

            }
            case 6: {

            }
            case 7: {

            }
            case 8: {

            }
            case 9: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8 , 10 ,11));
                addArrayListToHashset(arr , arr2);
                break;
            }
            case 10: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 1, 1, 5, 5, 7, 7, 8));
                removeDuplicate(arr);
                break;
            }
            case 11: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 9, 7, 8));
                copyArrayList(arr);
                break;
            }
            case 12: {
                countAppearance("you. you. iam ai ai ai");
                break;
            }
            case 13: {
                LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 20, 20, 20, 20, 30, 3, 4, 5, 6, 7));
                countAppearance(list, 20);
                break;
            }
            case 14: {
                ArrayList<Integer> list = new ArrayList<>();
                System.out.println(isArrayListEmpty(list));
                break;
            }
            case 15: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                insertArrayList(arr, 4, 20);
                break;
            }
            case 16: {
                ArrayList<String> arr = new ArrayList<String>(List.of("john,tom,bob,dog"));
                queue(arr);
                break;
            }
            case 17: {
                ArrayList<Integer> list1 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                ArrayList<Integer> list2 = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                isSameElementWithAnotherList(list1, list2);
                break;
            }
            case 18: {

                break;
            }
            case 19: {

                break;
            }
            case 20: {
                ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
                System.out.println(getLastAndFirstElement(arr));
                break;
            }
            default: {

                System.out.println("Vui lòng chọn chức có trên menu");
                break;
            }
        }
    }

    public static void isSameElementWithAnotherList(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        int size = firstList.size();
        boolean sameSize = firstList.size() == secondList.size();
        if (!sameSize) {
            System.out.println("Two List have diff element");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (firstList.get(i) != secondList.get(i)) {
                System.out.println("Two List have diff element");
                return;
            }
        }
        System.out.println("same");
    }

    public static Map<String, Integer> getLastAndFirstElement(ArrayList<Integer> arrayList) {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", arrayList.get(0));
        map.put("last", arrayList.get(arrayList.size() - 1));
        return map;
    }

    public static int sumArray(ArrayList<Integer> list) {
        int result = 0;
        for (Integer v : list) {
            result += v;
        }
        return result;
    }

    public static void createHashsetFromArrayList(ArrayList<Integer> arrayList) {
//        arrayList = new ArrayList<>();
    }

    public static LinkedList<String> reverseListString(LinkedList<String> list) {
        LinkedList<String> reverseList = new LinkedList<>();
        for (String v : list) {
            reverseList.addFirst(v);
        }
        return reverseList;
    }

    public static int findMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (max < integer)
                max = integer;
        }
        return max;
    }

    public static void studentHashMap() {
        Map<String, Integer> listStudent = new HashMap<>();
        listStudent.put("jonny", 10);
        listStudent.put("David", 6);
        listStudent.put("Tom", 7);
        listStudent.put("eee", 8);
        for (Map.Entry<String, Integer> set : listStudent.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }
    }

    public static boolean isContain(ArrayList<String> arrayList, String value) {
        return arrayList.contains(value);
    }

    public static ArrayList<String> sortByAlphabet(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1; j < arrayList.size() - 1 - i; j++) {
                if (arrayList.get(j).compareTo(arrayList.get(j + 1)) > 0) {
                    String temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        return null;
    }

    public static void addArrayListToHashset(ArrayList<Integer> arrayList , ArrayList<Integer> array2) {
        Set<Integer> set = new HashSet<>(arrayList);
        set.addAll(array2);
        for (Integer s : set) {
            System.out.println(s);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }
    }

    public static void copyArrayList(ArrayList<Integer> arrayList) {
        ArrayList<Integer> arr = (ArrayList<Integer>) arrayList.clone();
        System.out.println(arr);
    }

    public static void countAppearance(LinkedList<Integer> list, Integer target) {
        int count = 0;
        for (Integer l : list) {
            if (l == target)
                count++;
        }
        System.out.println(count);
    }

    public static boolean isArrayListEmpty(ArrayList<Integer> arrayList) {
        return arrayList.isEmpty();
    }

    public static void insertArrayList(ArrayList<Integer> arrayList, int position, Integer value) {
        arrayList.add(position, value);
    }

    public static void queue(ArrayList<String> arr) {
        PriorityQueue<String> q = new PriorityQueue<String>(arr);
        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        System.out.println(q);
    }

    public static void countAppearance(String text) {
        TreeMap<String, Integer> wordFrequencies = new TreeMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
//            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                if (wordFrequencies.containsKey(word))
                    wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                else {
                    wordFrequencies.put(word, 1);
                }
            }
        }

        for (String word : wordFrequencies.keySet()) {
            int frequency = wordFrequencies.get(word);
            System.out.println(word + " xuất hiện " + frequency + " lần");
        }

    }
}