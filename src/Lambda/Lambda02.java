package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,12,35,2,51,2,54,153,3,4,3));

        yazdir(list);

    }

    public static void yazdir(List<Integer> list) {
        list.stream().forEach(Utils::printSameLine);
    }
}
