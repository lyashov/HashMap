package HashMap;

public class MyHashMap<T1, T2> implements HashMap<T1, T2> {
    private Pair<T1, T2>[] arr = new Pair[Pair.SIZE_OF_HASH];

    public T2 put(T1 key, T2 value) {
        Pair<T1, T2> pair = new Pair(key, value);
        arr[Pair.trimHashCode(key.hashCode())] = pair;
        return pair.getValue();
    }

    public boolean delete(T1 key) {
        int hashCodeKey = Pair.trimHashCode(key.hashCode());
        Pair<T1, T2> pair = arr[hashCodeKey];
        if (pair != null){
            arr[hashCodeKey] = null;
            return true;
        }
        throw new NullPointerException();
    }

    public T2 get(T1 key) {
        int hashCodeKey = Pair.trimHashCode(key.hashCode());
        Pair<T1, T2> pair = arr[hashCodeKey];
        return  pair != null ? pair.getValue() : null;
    }

    public boolean containsKey(T1 key) {
        int hashCodeKey = Pair.trimHashCode(key.hashCode());
        Pair<T1, T2> pair = arr[hashCodeKey];
        return  pair != null ? true : false;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null) size++;
        }
        return size;
    }
}
