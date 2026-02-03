package Tests;

import java.lang.ref.WeakReference;

class Phone{
    private String Brand;
    private String Model;

    public Phone(String model, String brand) {
        Model = model;
        Brand = brand;
    }

    @Override
    public String toString() {
        return "Tests.Phone{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}

class GC {
    static void main(String[] args) {
        Phone phone = new Phone("Oneplus","Nord 2");
        phone = null;
        System.out.println(phone);
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple","17 pro"));
        System.out.println(weakReference.get());
        System.gc();
        try {
            Thread.sleep(5000);
        }catch (Exception ignored){}
        System.out.println(weakReference.get());

    }
}
