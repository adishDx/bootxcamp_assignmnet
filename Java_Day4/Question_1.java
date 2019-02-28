import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question_1 {

    public static void main(String[] args) {
        ArrayList<Float> al = new ArrayList<>();
        float sum = 0;
        al.add(1.25f);
        al.add(2.245f);
        al.add(54.23f);
        al.add(547.545f);
        al.add(4545.11f);

        Iterator it = al.iterator();
        while (it.hasNext())
            sum = sum + (float)(it.next());

        System.out.println("Sum is : "+sum);
    }

}
