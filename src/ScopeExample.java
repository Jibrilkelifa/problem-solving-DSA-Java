public class ScopeExample {
    int instanceVar = 10;       // Instance variable
    static int staticVar = 50;  // Static variable

    void method() {
        int localVar = 5;       // Local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
//        ScopeExample obj = new ScopeExample();
//        obj.method();
//
//        ScopeExample nice = new ScopeExample();

//        System.out.println(nice.instanceVar);

        // Static variable can be accessed without object
        System.out.println("Static variable: " + ScopeExample.staticVar);
    }
}
