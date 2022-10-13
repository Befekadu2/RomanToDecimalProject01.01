import javax.swing.*;

/**
 * Javadoc
 */

public class RomanToDecimal {
    /**
     *
     * @param roman just working
     * @return
     */
    public static int romanToDecimal(String roman) {
        int sum = 0;
        //conver to all one case
        roman = roman.toUpperCase();
        // "XI" .length() => 2
        //"MCMLXII" .length() +>7
        // 0123456
        // len(Roman) // used in Python
        //string.length()
        //array.length
        //list.size()
        for (int i = 0; i < roman.length(); i++) {
            if (roman.charAt(i) == 'I')
                sum += 1;
            else if (roman.charAt(i) == 'V')
                sum += 5;
            else if (roman.charAt(i) == 'X')
                sum += 10;
            else if (roman.charAt(i) == 'L')
                sum += 50;
            else if (roman.charAt(i) == 'C')
                sum += 100;
            else if (roman.charAt(i) == 'D')
                sum += 500;
            else if (roman.charAt(i) == 'M')
                sum += 1000;

            else
                return -1;
        }
        //INVARIANTS
        if (roman.indexOf("IV") != -1)
            sum -= 2;
        if (roman.indexOf("IX") != -1)
            sum -= 2;
        if (roman.indexOf("XL") != -1)
            sum -= 20;
        if (roman.indexOf("XC") != -1)
            sum -= 20;
        if (roman.indexOf("CD") != -1)
            sum -= 200;
        if (roman.indexOf("MC") != -1)
            sum -= 200;
        return sum;

    }


    public static void main(String[] args) {
        for (String roman : args) {            // (for) is for each loop
            int decimal = romanToDecimal(roman);
            if (decimal != -1)
                System.out.println("input: " + roman + " => output:" + romanToDecimal(roman));

            else
                System.out.println("Input:" + roman + "==> output: invalid");
        }
        /*System.out.println(romanToDecimal("XI"));  // should print 11
        System.out.println(romanToDecimal("IX"));  // should also print 11 because it only adds
        System.out.println(romanToDecimal("VIIXII")); // should print 19
        System.out.println(romanToDecimal("Xi")); //should print 11
        System.out.println(romanToDecimal("your mon")); //should print -1*/

    }
}