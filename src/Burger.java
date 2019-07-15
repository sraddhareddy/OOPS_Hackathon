import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Burger{
    public static void main(String[] args) {
        Hamburger hb=new Hamburger("nrml","chicken",12.4f,"basic");
        float output=hb.checking();
        System.out.println(output);
    }
}