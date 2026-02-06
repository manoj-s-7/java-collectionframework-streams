package java8Features;


public class Lambda {
    static void main(String[] args) {
/*        anonymous function no name , no return type , no access modifier
        without lambda */

        Thread t1 = new Thread(new Task());
        t1.start();
//        with lambda
        Thread t2 = new Thread(()-> System.out.println("Hello lambda"));
        t2.start();
        Mathoperation sumop = (a,b)->a+b;
        Mathoperation subractop = (a,b)->a-b;
        Mathoperation multiplication = (a,b)->a*b;
        System.out.println(multiplication.operations(4,7));
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
