package Heap;

import java.util.Arrays;
import java.util.Random;

public class Main {
    
    public static void init(Heap h){
        Random r = new Random();
        for (int i = 0; i < 15; i++)
            h.insert((int) (r.nextDouble()*100));
    }
    
    public static void main(String[] args){
        Integer[] x = {1,2,3,4,5,6,12,13,14,15,15,4534,346};
        Heap h = new Heap();
        h.addAll(x);
        System.out.println(h.toString());
        int n = h.size();
        System.out.println(Arrays.toString(h.getSorted()));
        System.out.println(h.toString());
        for (int i = 0; i < n; i++) System.out.print(h.remove() + " ");
    }
    
}
