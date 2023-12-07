package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanConverter("iiv"));
        System.out.println(romanConverter("vix"));
    }

    private static int romanConverter(String l) {
        int counter = 0;
        char[] chars = l.toCharArray();
        for (char c : chars) {
            counter += romanToInt(String.valueOf(c));
        }
        return counter;
    }

    private static int romanToInt(String i) {
        if (i.equalsIgnoreCase("i")) return 1;
        else if (i.equalsIgnoreCase("v")) return 5;
        else if (i.equalsIgnoreCase("x")) return 10;
        else if (i.equalsIgnoreCase("l")) return 50;
        else if (i.equalsIgnoreCase("c")) return 100;
        else if (i.equalsIgnoreCase("d")) return 500;
        else if (i.equalsIgnoreCase("m")) return 1000;
        else {
            System.out.println("Enter the valid roman Digit");
            return 0;
        }
    }
}