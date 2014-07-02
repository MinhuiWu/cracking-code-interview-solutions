import java.util.*;

public class Test {
/*
    public static boolean evaluate(ArrayList<Character> seq) {
        if (seq.size() == 0) return true;
        if (Character.isDigit(seq.get(0)) && Character.getNumericValue(seq.get(0)) > 0 && (seq.get(1) == '+')) {
            return evaluate(seq.subList(2, seq.size() - 1));
        } else if (Character.isDigit(seq.get(0)) && Character.getNumericValue(seq.get(0)) < 0) {
            return evaluate(seq.remove(0));
        } else {
            return false;
        }
    }
*/
    public static boolean isSorted(int[] array) {
        if (array == null || array.length == 0) return true;
        return isSortedHelper(array, 0);
    }

    private static boolean isSortedHelper(int[] array, int index) {
        if (index == array.length - 1) return true;
        return array[index] <= array[index + 1] ? isSortedHelper(array, index + 2) : false;
    }

    public static boolean isFollowRules(String str) {
        if (str == null || str.length() == 0) return false;
        if (str)
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 10, 8, 9};
        System.out.println(isSorted(arr));
    }
}
