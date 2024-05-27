
import java.util.Map;
import java.util.TreeMap;

public class CountFrequenciesOfElement {

    public void frequencyCount(int[] arr, int N, int P)
    {
        // code here
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 1; i <= N; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < N; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }

        int c = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (c <= N){
                //System.out.print(entry.getValue() + " ");
                arr[c-1] = entry.getValue();
            }
            c++;
        }

    }

    public static void main(String[] args) {
       CountFrequenciesOfElement c = new CountFrequenciesOfElement();
       int[] arr = {2, 3, 2, 3, 5};
        c.frequencyCount(arr, arr.length, 5);
    }
}
