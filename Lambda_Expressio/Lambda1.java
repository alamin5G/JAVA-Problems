package Lambda_Expressio;
/*
 * Labmda Expression can be used only in Functional Interface
 */
public class Lambda1 {

    public static void add(int a, int b){
        System.out.println(a + b);
    }

    

    

    public static void main(String[] args) {
        add(5, 1);
        
        // Create an Employee before labmda expression
        Employee employee = new SoftwareEngineer();
        System.out.println(employee.getName());

        // now using the lambda expression
        Employee employee2 = () -> {
            return "Software Engineer";
        };

        // or the 2nd type lambda expression
        Employee employee3 = () -> "Java Developer";
        System.out.println(employee3.getName());
        
        //so, if you look, we don't need the SoftwareEngineer class anymore.
        //means, there is no use of SoftwareEngineer class
        //now we can remove the SoftwareEngineer class as well without any error.

        

    }
}
 