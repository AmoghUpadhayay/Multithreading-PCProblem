public class Company {
    private int n;
    private Boolean lock;

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    synchronized public void produce_item(int n) throws Exception
    {
        if(lock)
        {
            wait();
        }
        this.n = n;
        System.out.println("Produced : "+ this.n);
        lock = true;
        notify();
    }

    synchronized public void consume_item() throws Exception
    {
        if(!lock)
        {
            wait();
        }
        System.out.println("Consumed : "+ this.n);
        lock = false;
        notify();
    }
}
