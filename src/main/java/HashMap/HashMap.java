package HashMap;

interface HashMap<T1,T2> {
     T2 put(T1 key, T2 value);
     boolean delete(T1 key);
     T2 get (T1 key);
     boolean containsKey(T1 key);
     int size();

}