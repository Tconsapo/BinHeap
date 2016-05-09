package Main;

import Heap.Heap;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;

public class Main {
    
    public static void init(Heap h){
        Random r = new Random();
        for (int i = 0; i < 15; i++)
            h.insert((int) (r.nextDouble()*100));
    }
    
    public static void main(String[] args) throws IOException{
        Heap h = new Heap();
        System.out.println("Доступны команды: "
                    + "insert, addAll, remove, peek, getSorted, clear, isEmpty, size, toString, create, exit, help");
        while (true){
            String choice = Input.getStr();
            switch(choice){
                case "insert":
                    System.out.print("Введите значение: ");
                    h.insert(Input.getInt());
                    break;
                case "addAll":
                    System.out.print("Введите значения: ");
                    String val = Input.getStr();
                    String[] str = val.split(" ");
                    Integer[] x = new Integer[str.length];
                    for (int i = 0; i < str.length; i++)
                        x[i] = Integer.valueOf(str[i]);
                    h.addAll(x);
                    System.out.println("OK");
                    break;
                case "remove":
                    System.out.println(h.remove());
                    break;
                case "peek":
                    System.out.println(h.peek());
                    break;
                case "getSorted":
                    System.out.println(Arrays.toString(h.getSorted()));
                    break;
                case "clear":
                    h.clear();
                    System.out.println("OK");
                    break;
                case "isEmpty":
                    System.out.println(h.isEmpty());
                    break;
                case "size":
                    System.out.println(h.size());
                    break;
                case "toString":
                    System.out.println(h.toString());
                    break;
                case "create":
                    h.clear();
                    init(h);
                    System.out.println("OK");
                    break;
                case "exit":
                    System.exit(0);
                case "help":
                    System.out.println("Доступны команды: "
                    + "insert, addAll, remove, peek, getSorted, clear, isEmpty, size, toString, create, help");
                    break;
                default:
                    System.out.println(choice + " - Эта команда недоступна!");
            }
        }
    } 
}
