class TypeConversionAndCasting {
    public static void main(String a[]) {
        byte b = 127;
        int in = 256;

        // error: incompatible types: possible lossy conversion from int to byte
        // b = in;
        
        in = b; // Conversion:
        b = (byte) in; // Casting

        System.out.println(in);
        System.out.println(b);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println(result);
    }
}
