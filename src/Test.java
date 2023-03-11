import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String url = "http://localhost.com";
        String protocol = url.split("//")[0];
        char secure = protocol.contains("https") ? 'Y' : 'N';
        System.out.println(secure);
        System.out.println(url.split("//")[1]);
    }
}




