class Mythread extends Thread{
    int start = 0;
    int end = 0;
    public Mythread(int start, int end){
        this.start = start;
        this.end = end;
    }
    public void run(){
        for(int i = start; i <= end; i ++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        Thread t = Thread.currentThread();

        t.setPriority(5);
        Mythread t2 = new Mythread(1, 100);
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        Mythread t3 = new Mythread(200, 300);

        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        for(int i = 400; i <= 500; i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }
}