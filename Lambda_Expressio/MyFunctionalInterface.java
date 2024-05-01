package Lambda_Expressio;

/**
 * My Functional Interface have only one abstract method
 * But if there is static and default method are available then there will be no issues for that.
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    public void sayHell();

    default void sayBye(){
        System.out.println("We are leaving!!");
    }

} 