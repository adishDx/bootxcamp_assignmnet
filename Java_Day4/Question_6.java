import java.util.*;

class SortByFrequency implements Comparator<Map.Entry<Integer,Integer>>
{
    public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
        if(a.getValue() > b.getValue()) return -1;
        if(a.getValue() < b.getValue()) return 1;
        return 0;
    }
}

public class Question_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size : ");
        int s = sc.nextInt();
        int a[] = new int[s];
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println("Enter The Elements : ");
        for (int i = 0; i < s ; i++) {
            a[i] = sc.nextInt();
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else
                map.put(a[i],1);
        }

        System.out.println("In Unsorted Order : ");

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Integer,Integer>> arr = new ArrayList<>(entrySet);

        System.out.println("\n"+arr);

        Collections.sort(arr , new SortByFrequency());

        System.out.println("\n"+arr);

    }

}
