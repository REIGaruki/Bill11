import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[]{"_first_", "_second_", "_third_", "_second_", "_first_", "_fourth_", "_third_"};
        System.out.println(taskSet(stringArray));
    }

    public static String taskSet(String[] stringArray) {
        Set<String> stringSet = new LinkedHashSet<String>();
        for (String string : stringArray) {
            stringSet.add(string);
        }
        StringBuilder result = new StringBuilder();
        for (String string : stringSet) {
            result.append(string);
        }
        return result.toString();
    }
}