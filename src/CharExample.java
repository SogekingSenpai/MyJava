/**
 * Created by Trinetra on 11/25/2017.
 */
public class CharExample {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        char a = 1;
        char b = 2;
        char c = 3;
        char symb = '\u0024';
        System.out.println("Dollar Sign : " + symb);

        String name = "name";
        String uppers = name.toUpperCase();
        System.out.println(uppers);

        String lowers = name.toLowerCase();
        System.out.println(lowers);

        if(lowers.isEmpty()){
            System.out.println("This is Empty");
        }else{
            System.out.println("This is not empty");
        }
    }
}
