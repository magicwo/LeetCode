package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {

    //此题是计算杨辉三角的题
//    Given an index k, return the kth row of the Pascal's triangle.
//
//    For example, given k = 3,
//    Return [1,3,3,1].

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0)
            return list;
        list.add(1);
        if (rowIndex == 0)
            return list;
        for (int i = 1; i <= rowIndex ; i++) {
            for (int j = list.size()-1; j > 0; j--) {
                list.set(j,list.get(j-1)+list.get(j));
            }
            list.add(1);
        }
        return list;

    }

}
