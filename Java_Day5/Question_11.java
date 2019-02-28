import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_11 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(   list.stream()
                .map(e->e*2)
                .collect(Collectors.averagingInt(e->e))
        );
//        int sum = 0;
//        for (int i = 1; i < 10; i++) {
//                sum = sum + i*2;
//        }
//        System.out.println(sum/9);
    }

}
