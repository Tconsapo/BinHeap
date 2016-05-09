package Heap;

public class Heap<T extends Comparable<T>>{
    
    private static final int DEFAULT_CAPACITY = 16;
    private T[] array;
    private int size;
    
    public Heap(){
        this.array = (T[]) new Comparable[DEFAULT_CAPACITY];
        this.size = 0;
    } 
    
    public Heap(T x){
        this.array = (T[]) new Comparable[DEFAULT_CAPACITY];
        this.size = 0;
        this.insert(x);
    }
    
    public Heap(T[] x){
        this.array = (T[]) new Comparable[DEFAULT_CAPACITY];
        this.size = 0;
        for (T x1 : x) this.insert(x1);
    }
    
    public T[] getSorted(){
        T[] old = (T[]) new Comparable[this.array.length];
        System.arraycopy(this.array, 0, old, 0, this.array.length);
        int oldSize = this.size;
        T[] result = (T[]) new Comparable[this.size];
        for (int i = 0; i < result.length; i++) result[i] = this.remove();
        this.array = old;
        this.size = oldSize;
        return result;
    }
    
    public void addAll(T[] x){
        for(T x1 : x) this.insert(x1);
    }
    
    public void insert(T x){
        if (this.array.length == this.size-1) this.increase();
        this.array[this.size] = x;
        up(this.size++);
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return (this.size == 0);
    }
    
    public T peek(){
        if (this.size == 0) return null;
        return this.array[0];
    }
    
    public T remove(){
        if (this.size == 0) return null;
        T result = this.array[0];
        this.array[0] = this.array[--this.size];
        down(0);
        return result;
    }
    
    private void increase(){
      T[] old = this.array;
      this.array = (T[]) new Comparable[this.array.length*2];
      System.arraycopy(old, 0, this.array, 0, this.size);
    }
    
    public void clear(){
        this.array = (T[]) new Comparable[DEFAULT_CAPACITY];
        this.size = 0;
    }
    
    public void down(int x){
        int maxChild;
        T top = this.array[x];
        while (x < (this.size)/2){
            int lChild = 2*x + 1;
            int rChild = lChild + 1;
            if (this.array[lChild].compareTo(this.array[rChild]) < 0 && rChild < this.size){
                maxChild = rChild;
            }else{
                maxChild = lChild;
            }
            if (top.compareTo(this.array[maxChild]) >= 0){
                break;
            }
            this.array[x] = this.array[maxChild];
            x = maxChild;
        }
        this.array[x] = top;
    }
    
    private void up(int x){
        int parent = (x-1)/2;
        T bot = this.array[x];
        while ((x>0)&&(parent >= 0)&&(this.array[parent].compareTo(bot) < 0)){
            this.array[x] = this.array[parent];
            x = parent;
            parent = (parent-1)/2;
        }
        this.array[x] = bot;
    }
    
    @Override
    public String toString(){
        if (this.size == 0) return null;
        String result = "";
        for (int i = 0; i < size; i++) result+=this.array[i] + " ";
        return result;
    }
    
}
