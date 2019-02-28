import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question_12 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Optional<Integer> val = list.stream()
                .filter(e->(e%2==0)&&(e>3))
                .findFirst();
//        System.out.println(   list.stream()
//                .filter(e->(e%2==0)&&(e>3))
//                .findFirst()
//        );

        if(val.isPresent())
            System.out.println(val.get());
        else
            System.out.println("No Value Found !!");



    }

}
