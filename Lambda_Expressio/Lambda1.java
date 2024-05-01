package Lambda_Expressio;

public class Lambda1 {

    public static void add(int a, int b){
        System.out.println(a + b);
    }

    

    

    public static void main(String[] args) {
        add(5, 1);
        
        (int a, int b)-> System.out.println(a + b);
    }
}
 