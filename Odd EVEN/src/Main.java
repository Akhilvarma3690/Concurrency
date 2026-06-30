//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shared shared=new Shared(10);

        Odd odd=new Odd(shared);
        Even even=new Even(shared);
        Thread t1=new Thread(odd);
        Thread t2=new Thread(even);
        t1.start();
        t2.start();
    }
}