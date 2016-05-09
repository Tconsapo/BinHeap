package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static String getStr() throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(in);
        return buf.readLine();
    }
    
    public static int getInt(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}