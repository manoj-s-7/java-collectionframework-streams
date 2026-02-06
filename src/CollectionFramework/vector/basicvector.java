package CollectionFramework.vector;

//advantage thread safe
import java.util.ArrayList;
import java.util.Vector;

public class basicvector {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>(10,3);
        for (int i=0;i<10;i++){
            vec.add(i);
        }
        System.out.println(vec);
        System.out.println(vec.capacity());
        vec.add(10);
        System.out.println(vec);
        System.out.println(vec.capacity());
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i=0;i<10;i++){
            nums.add(i);
        }
        Vector<Integer> num = new Vector<>(nums);
        num.clear();
        System.out.println(num);


//        Thread safe test
        Thread t1 = new Thread(()->{
            for (int i = 0;i<1000;i++){
                num.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0;i<1000;i++){
                num.add(i);
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){}

        System.out.println(num.size());

    }
}
