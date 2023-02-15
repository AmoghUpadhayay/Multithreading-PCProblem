public class Main {
    public static void main(String[] args) {

        Company c = new Company();
        Runnable produce_thread = () -> {
            int i = 1;
            while(true){
                c.produce_item(i);
                i++;
                try{
                    Thread.sleep(1000);
                } catch(Exception e){

                }
            }
        };

        Runnable consume_thread = () -> {
            while(true){
                c.consume_item();
                try{
                    Thread.sleep(1000);
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