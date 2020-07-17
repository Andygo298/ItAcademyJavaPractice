package Week1Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeLists {

    void mergeStream(List<Integer> firstList, List<Integer> secondList) {
        firstList = Stream.concat(firstList.stream(), secondList.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        firstList.forEach(x -> System.out.printf("%s ", x));
        System.out.println();
        secondList.forEach(x -> System.out.printf("%s ", x));
    }

    void merge(List<Integer> firstList, List<Integer> secondList) {

        for (Integer elemOfSecondList : secondList) {
            for (int j = 0; j < firstList.size(); j++) {
                if (firstList.get(j) >= elemOfSecondList) {
                    firstList.add(j, elemOfSecondList);
                    break;
                }
                if (j == firstList.size() - 1) {
                    firstList.add(elemOfSecondList);
                    break;
                }
            }
        }
        System.out.println("FIRST:");
        firstList.forEach(x -> System.out.printf("%s ", x));
        System.out.println("\nSECOND:");
        secondList.forEach(x -> System.out.printf("%s ", x));
    }
}

