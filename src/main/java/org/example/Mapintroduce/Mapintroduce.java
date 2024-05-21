package org.example.Mapintroduce;

import java.util.HashMap;
import java.util.Map;

public class Mapintroduce {
    public static void main(String[] args) {
//        Node数组16，所有节点达到0.75的时候扩容 每次自增一倍
//        static final float DEFAULT_LOAD_FACTOR = 0.75f;
//        Node存对象 存为单向链表
//        Node存对象到8个时，变成红黑树
//        红黑树节点个数到6时，转置为单向链表
        Map<String, String> map = new HashMap<>();
//		  key值唯一，key相同时，覆盖value
        map.put("010","北京");
        map.put("011","上海");
        map.put("011","广州");

        map.forEach((k, v) -> {
            System.out.println(k + "@" + v);
        });
    }
}
