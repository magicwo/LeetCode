package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test268 {
    public static void main(String[] args) {
        int[] ints={2,35,6,5,64,6,5};
        Integer[] integers=new Integer[ints.length];
        List ss=IntStream.range(1, 100).boxed().collect(Collectors.toList());
        for (int i=0;i<ints.length;i++){
            integers[i]=Integer.valueOf(ints[i]);


        }
        List list= Arrays.asList(integers);
//        IntStream.of(ints).forEach(value -> System.out.println(value));

        Double avarage = (Double) list.stream().collect(Collectors.averagingInt(item->(Integer) item));
        System.out.println(avarage);
        System.out.println(list.stream().count());


    }
}
