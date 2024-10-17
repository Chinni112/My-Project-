package com.gs.simulation1;

public class RevDigits {

    public static String revDigitsDivisibleByThree(String input) {

        StringBuilder sb = new StringBuilder(input);
        StringBuilder divisibleByThree = new StringBuilder(); // for holding digits

        for (char c : input.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit % 3 == 0) {
                divisibleByThree.append(c);
            }
        }

        divisibleByThree.reverse(); // reverse

        int index = 0;

        for (int posi = 0; posi < sb.length(); posi++) {    // iterate and collect the digits div by 3
            int digit = Character.getNumericValue(sb.charAt(posi));
            if (digit % 3 == 0) {
                sb.setCharAt(posi, divisibleByThree.charAt(index));
                index++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input1 = "1234563218976";    //36396//69363
        //1264593218673 op
        System.out.println("Output 1: " + revDigitsDivisibleByThree(input1));

    }
}
