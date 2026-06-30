public class Shared {
    private int count=1;
    private final int max;

    public Shared(int max){
        this.max=max;
    }
    public int getCount(){
        return count;
    }


    public synchronized void print(){
        System.out.println(Thread.currentThread().getName() + " : " + count);
        count++;
    }
    public int getMax(){
        return max;
    }


}
