public class Even implements Runnable{
    Shared shared;
    public Even(Shared shared){
        this.shared = shared;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (shared) {
                while (shared.getCount() % 2 != 0 && shared.getCount() <= shared.getMax()) {
                        try{
                            shared.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                if(shared.getCount() > shared.getMax()){
                    shared.notifyAll();
                    break;
                }
                shared.print();
                shared.notifyAll();
            }
        }
    }

}
