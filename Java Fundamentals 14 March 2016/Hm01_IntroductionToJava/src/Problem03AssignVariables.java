
public class Problem03AssignVariables {

    public static void main(String[] args){
        byte num1 = 127;//2^8 from -2^7 to 2^7-1
        short num2 = 32_767;//2^16 from -2^15 to 2^15-1
        int num3 = 2_000_000_000;//2^32 from -2^31 to 2^31-1
        long num4 = 919_827_112_351L;//2^64 from -2^63 to 2^63-1

        float num5 = 0.5F;//precision of 7 digits
        double num6 = 0.1234567891011D;//precision of 15-16 digits

        char character = 'c';
        String str = "Palo Alto, CA";

        boolean isItTrue = false;

        short check = (short)32_768;
        System.out.println(check);

        int check1 = (int)2147483648L;
        System.out.println(check1);
    }
}
