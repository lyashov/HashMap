package HashMap;


class Pair<T1,T2> {
    public static final int SIZE_OF_HASH = 1000;

    private final T1 key;
    private final T2 value;
    private int hashCode;

    public Pair(T1 key, T2 value) {
        this.key = key;
        this.value = value;
        this.hashCode = trimHashCode(key.hashCode());
    }

    public static int trimHashCode(int hashCode){
        return Math.abs(hashCode) % (SIZE_OF_HASH - 1);
    }

    public static int getHashSize(){
        return SIZE_OF_HASH;
    }

    public T1 getKey() {
        return key;
    }

    public T2 getValue() {
        return value;
    }
}
