
public class PrimitiveTypes {
    // These are primitive numeric Data types
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;

        float f = 1;
        double d = 1d;

        System.out.println("This is b : " + b);
        System.out.println("This is short : " + s);
        System.out.println("This is int : " + i);
        System.out.println("This is long : " + l);
        System.out.println("This is float : " + f);
        System.out.println("This is a double : " + d);

        // Testing a byte value
        byte byteOne = 126;
        System.out.println("Byte : "+ byteOne);
        if(byteOne < Byte.MAX_VALUE){
            byteOne++;
        }
        System.out.println("Byte : "+ byteOne);
    }
}
