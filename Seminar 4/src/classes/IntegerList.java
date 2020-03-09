package classes;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public static List<Integer> convertToIntegerList(String input) {
        List<Integer> list = new ArrayList<>();

        String[] numbers = input.split(" ");
        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }

        return list;
    }
}
