package CollectionFramework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDEMO {
    static void main(String[] args) {
        HashMap<Integer,String> studensts = new HashMap<>();
        studensts.put(19,"Manoj");
        studensts.put(21,"Akash");
        studensts.put(20,"Bob");
        studensts.put(18,"Alice");
        System.out.println(studensts);
        for (Integer k:studensts.keySet()){
            System.out.println("Roll no.: "+k+" | "+"Name: "+studensts.get(k));
        }
        Set<Map.Entry<Integer, String>> entries = studensts.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> i :entries){
            System.out.println(i.setValue(i.getValue().toUpperCase()));
        }
        System.out.println(studensts);

        HashMap<String,Integer> fruits = new HashMap<>();
        fruits.put("Apple",50);
        fruits.put("Banana",30);
        fruits.put("Orange",80);
        fruits.put("Grape",20);
    }
}



