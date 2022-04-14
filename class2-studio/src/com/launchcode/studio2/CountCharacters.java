package com.launchcode.studio2;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

    public static void main(String[] args) {
        Scanner input;
        String userString = new String();
        HashMap<String, Integer> charCount = new HashMap<>();
        String aChr;
        input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        userString = input.nextLine();

        userString = userString.toUpperCase();

        for (int i = 0; i< userString.length(); i++) {

            aChr = String.valueOf(userString.charAt(i));

            if (!aChr.matches("^.*[^a-zA-Z0-9].*$")) {

                if (charCount.containsKey(aChr)) {
                    charCount.replace(aChr,
                            Integer.parseInt(String.valueOf(charCount.get(aChr))) + 1);
                } else {
                    charCount.put(aChr, 1);
                }
            }
        }

        for (Map.Entry<String, Integer> cnt : charCount.entrySet()) {
            System.out.println(cnt.getKey() + " : (" + cnt.getValue() + ")");
        }
    }
}
