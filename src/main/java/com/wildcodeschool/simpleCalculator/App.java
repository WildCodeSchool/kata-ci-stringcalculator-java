package com.wildcodeschool.simpleCalculator;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int add(String numbers) {
        if (numbers == null || numbers.length() == 0) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int nl = numbers.indexOf("\n");
            delimiter = numbers.substring(2, nl);
            numbers = numbers.substring(nl + 1);
        }
        numbers = numbers.replaceAll("\n", delimiter);

        return Arrays.stream(numbers.split(delimiter))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
