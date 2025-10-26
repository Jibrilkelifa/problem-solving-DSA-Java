import java.util.ArrayList;

public class TestArgs {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (String arg : args) {
            System.out.println("Arg: " + arg);
        }

        ArrayList<String> names = new ArrayList<>();

        names.add("Jibril");
        names.add("kunal");

        for ( int i=0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for ( String nam: names){
            System.out.println(nam);
        }
        String name = "JAVA";

        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());
    }

}

