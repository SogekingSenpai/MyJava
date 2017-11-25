/**
 * Created by Trinetra on 11/25/2017.
 */
public class Boolean {

    public static void main(String[] args) {

        String bools = "true";
        boolean oneThing = java.lang.Boolean.parseBoolean(bools);
        System.out.println(oneThing);

        if(oneThing){
            System.out.println("You're Right in this manner because this is "+ oneThing);
        }
    }
}
