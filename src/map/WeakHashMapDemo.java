package map;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
class Image{
    private String Image;

    public Image(String image) {
        Image = image;
    }

    @Override
    public String toString() {
        return "Image{" +
                "Image='" + Image + '\'' +
                '}';
    }
}
public class WeakHashMapDemo {
    static void simulation(){
        try {
            System.out.println("Simulation is running");
            Thread.sleep(5000);
        }catch (Exception ignored){}
    }
    static void main(String[] args) {
        WeakHashMap<String,Image> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(new String("img1"),new Image("Image 1"));
        weakHashMap.put(new String("img2"),new Image("Image 2"));
        System.out.println(weakHashMap);
        System.gc();
        simulation();
        System.out.println("Some images is been deleted "+weakHashMap);
    }
}
