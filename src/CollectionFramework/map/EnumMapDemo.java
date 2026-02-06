package CollectionFramework.map;

import java.util.EnumMap;

public class EnumMapDemo {
    static void main(String[] args) {
        enum Days{
            MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
        }
        EnumMap<Days,String> map = new EnumMap<>(Days.class);
        map.put(Days.MONDAY,"Java");
        map.put(Days.TUESDAY,"gym");
        map.put(Days.WEDNESDAY,"dsa");
        map.put(Days.THURSDAY,"springboot");
        System.out.println(map);
        System.out.println(Days.MONDAY.ordinal());//index

    }
}
