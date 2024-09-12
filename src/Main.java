// 1) Создать массив Java с набором слов (10-20 слов, должны вотречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово. (реализовать с использованием коллекций)
// 2) Написать в Java простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный оправочник с помощью метода add() можно добавлять записи, а с помощью метода gt() искать номер телефона по фамилии. Следует
//• учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// #2

class PhoneDirectory {
    private Map<String, Set<String>> directory; // Map to store surnames and phone numbers

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (directory.containsKey(surname)) {
            // Add new phone number to existing surname
            Set<String> phoneNumbers = directory.get(surname);
            phoneNumbers.add(phoneNumber);
        } else {
            // Add new entry for surname with phone number
            Set<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            directory.put(surname, phoneNumbers);
        }
    }

    public Set<String> get(String surname) {
        return directory.get(surname);
    }

    public static class Main {
            public static void main (String[]args){

                // #1

                String[] wordsArray = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "pear", "orange", "apple", "kiwi"};

                Map<String, Integer> wordCountMap = new HashMap<>();

                for (String word : wordsArray) {
                    if (wordCountMap.containsKey(word)) {
                        // Increment count if word already exists in the map
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        // Add word to the map with count as 1 if it's a new word
                        wordCountMap.put(word, 1);
                    }
                }

                Set<String> uniqueWords = wordCountMap.keySet();

                System.out.println("List of unique words:");
                for (String uniqueWord : uniqueWords) {
                    System.out.println(uniqueWord);
                }

                System.out.println("\nWord count:");
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }

                // #2

                PhoneDirectory phoneDirectory = new PhoneDirectory();

                // Adding entries to the phone directory
                phoneDirectory.add("Smith", "1234567890");
                phoneDirectory.add("Johnson", "9876543210");
                phoneDirectory.add("Smith", "5555555555");

                // Getting phone numbers for a surname
                System.out.println("Phone numbers for Smith:");
                Set<String> smithPhones = phoneDirectory.get("Smith");
                for (String phone : smithPhones) {
                    System.out.println(phone);
                }
            }
    }
}


