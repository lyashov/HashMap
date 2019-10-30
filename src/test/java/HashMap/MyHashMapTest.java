package HashMap;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {
    MyHashMap map = new MyHashMap();
    @Test
    public void put() {
        Integer key = 10;
        String value = "test1";
        Object result = map.put(key, value);
        assertEquals((String)result, value);
    }

    @Test
    public void delete() {
        String key = "keyTest";
        map.put(key, "valueTest");
        boolean result = map.delete(key);
        assertEquals(result, true);
    }

    @Test
    public void get() {
        String key = "keyTest";
        Integer value = 33;
        map.put(key, value);
        Object result = map.get(key);
        assertEquals((Integer)result, value);
    }

    @Test
    public void containsKey() {
        Boolean result = map.containsKey("not this key");
        assertNotEquals(true, result);
    }

    @Test
    public void size() {
        int size = map.size();
        assertNotEquals(-1, size);
    }
}