import java.util.ArrayList;
import java.util.List;

public class PrintNRoots {
    //print all the roots number from 1 to n;
    
    public static List<Integer> rootsNumber(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<= n; i++) {
            double sqr = Math.sqrt(i);
            if(Math.ceil(sqr) == sqr){
                list.add(i);
            }
        }

        if(list.isEmpty()){
            list.add(0);
            return list;
        }

        return list;
    }


    public static void main(String[] args) {
        //print all the root number from 1 to n
        System.out.println("There are total root numbers from 1 to N:(150) ");
        System.out.println(Math.floor(Math.sqrt(150)));
        System.out.println("Print All the root numbers from 1 to 150: ");
        System.out.println(rootsNumber(150));
    }
}
