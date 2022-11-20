import java.util.*;

public class Main {
    public static void main(String[] args) {

//++++++++++ДЗ №1.1 про телефонную книгу++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.randomFilling(20);
        System.out.println(phoneBook);


//++++++++++ДЗ №1.3 про мапу со строками и номерами+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        Numbers num = new Numbers();
        num.add("str1", 2);
        num.add("str2", 4);
        num.add("str3", 7);
        num.add("str4", 2);
        num.add("str1", 89);
        System.out.println(num);


//++++++++++ДЗ №2.1 про список в мапе+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        Random random = new Random();
        Map<String, List<Integer>> map1 = new HashMap<>();
        map1.put("str1", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        map1.put("str2", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        map1.put("str3", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        map1.put("str4", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));
        map1.put("str5", new ArrayList<>(List.of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000))));

        for (Map.Entry<String, List<Integer>> entry : map1.entrySet()) {
            System.out.println(entry);
        }

        Map<String, Integer> map2 = new HashMap<>();
        for (String s : map1.keySet()) {
            map2.put(s, calcSumOfArray((ArrayList<Integer>) map1.get(s)));
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry);
        }


//+++++++++++ДЗ №2.2 про сортированный мап++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        Map<Integer, String> map3 = new LinkedHashMap<>();
        map3.put(random.nextInt(100), "str1");
        map3.put(random.nextInt(100), "str2");
        map3.put(random.nextInt(100), "str3");
        map3.put(random.nextInt(100), "str4");
        map3.put(random.nextInt(100), "str5");
        map3.put(random.nextInt(100), "str6");
        map3.put(random.nextInt(100), "str7");
        map3.put(random.nextInt(100), "str8");
        map3.put(random.nextInt(100), "str9");
        map3.put(random.nextInt(100), "str10");

        for (Map.Entry<Integer, String> entry : map3.entrySet()) {
            System.out.println(entry);
        }

    }

    public static int calcSumOfArray(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer integer : arr) {
            sum += integer;
        }
        return sum;
    }
}