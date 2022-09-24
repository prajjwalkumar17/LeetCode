import java.io.*;

public class Test {
    //constants
//     static int a=2;

    int c = 10;

    public static void main(String[] args) throws IOException {
        int p = 5;
        int y = 10;
        int z = 15;
        int x = 20;
        int e = res(p, y, z, x);
        System.out.println(e);


    }

    public static int res(int a, int b, int c, int d) {
        int e = (a + b) / (c * d);
        return e;
    }
}




