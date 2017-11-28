package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    /**
     * 画杨辉三角的题，属于简单型。
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if (numRows == 0)
            return lists;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        if (numRows == 1) {
            return lists;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> listTemp=new ArrayList<>();
            listTemp.add(1);
            for (int j = 1; j <i-2; j++) {
                listTemp.add(lists.get(i-2).get(j-1)+lists.get(i-2).get(j));
            }
            listTemp.add(1);
            lists.add(listTemp);

        }

        return lists;

    }

}
//    List<List<Integer>> lists = new ArrayList<>();
//        if (numRows == 0)
//                return lists;
//                List<Integer> list = new ArrayList<>();
//        list.add(1);
//        List<Integer> listtemp1 = new ArrayList<>();
//        listtemp1.addAll(list);
//        lists.add(listtemp1);
//        if (numRows == 1) {
//        return lists;
//        }
//        for (int i = 2; i <= numRows; i++) {
//
//        for (int j = i - 2; j > 0; j--) {
//        list.set(j, list.get(j - 1) + list.get(j));
//        }
//        list.add(1);
//        List<Integer> listtemp=new ArrayList<>();
//        listtemp.addAll(list);
//        lists.add(listtemp);
//
//        }
//
//
//        return lists;
//
//        }

