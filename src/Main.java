public class Main {
    public static void main(String[] args) {

        Company c = new Company();
        c.setLock(false);
        Runnable produce_thread = () -> {
            int i = 1;
            while(true){
                try{
                    c.produce_item(i);
                    i++;
                    Thread.sleep(2000);
                } catch(Exception e){

                }
            }
        };

        Runnable consume_thread = () -> {
            while(true){
                try{
                    c.consume_item();
                    Thread.sleep(000);
                } catch(Exception e){

                }
            }
        };
        Thread t1 = new Thread(produce_thread);
        Thread t2 = new Thread(consume_thread);
        t1.start();
        t2.start();
    }
}