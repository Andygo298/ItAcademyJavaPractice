package weekSecond.task4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class MySortArrays {

    public List<Integer> sortOnlyOddNumbers(List<Integer> list) {
        Deque<Integer> sortedDequeOddNumbers = list.stream()
                .filter(currNumber -> currNumber % 2 != 0)
                .sorted()
                .collect(Collectors.toCollection(ArrayDeque::new));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.set(i, sortedDequeOddNumbers.pollFirst());
            }
        }
        return list;
    }
}
