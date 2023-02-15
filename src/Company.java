public class Company {
    private int n;

    synchronized public void produce_item(int n)
    {
        this.n = n;
        System.out.println("Produced : "+ this.n);
    }

    synchronized public void consume_item()
    {
        System.out.println("Consumed : "+ this.n);
    }
}
