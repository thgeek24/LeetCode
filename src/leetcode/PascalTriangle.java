package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taohong on 05/09/2018
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> preList = new ArrayList<>();
        preList.add(1);

        if (numRows == 0) {
            return list;
        }

        if (numRows == 1) {
            list.add(preList);
            return list;
        }

        list.add(preList);
        for (int i = 0; i < numRows - 1; i++) {
            preList = new ArrayList<>(list.get(list.size() - 1));
            List<Integer> inList = createNewList(preList);
            list.add(inList);
        }
        return list;
    }

    public List<Integer> createNewList(List<Integer> preList) {
        List<Integer> newList = new ArrayList<>();
        int preSize = preList.size();
        for (int i = 0; i < preSize; i++) {
            if (i == 0) {
                newList.add(1);
            } else {
                newList.add(preList.get(i - 1) + preList.get(i));
            }
        }
        newList.add(1);
        return newList;
    }
}
