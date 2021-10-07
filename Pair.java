import java.util.Objects;

/**
 * Pair is a public class which allows parameters to be different types and null
 * @param <T>
 * @param <S>
 */
public class Pair<T, S> {
    private T first;
    private S second;

    /**
     * This is a class Pair constructor: two parameters type T and type S
     * @param first
     * @param second
     */
    private Pair(T first, S second){
        this.first = first;
        this.second = second;
    }

    /**
     * A getter
     * @return the value of first parameter
     */
    public T getFirst(){
        return first;
    }

    /** A getter
     * @return the value of second parameter
     */
    public S getSecond(){
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null && this == null) return true;
        if (getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) && Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }

    /**
     * Method creates a Pair class pair out of two parameters
     * @param first
     * @param second
     * @return
     */
    public static Pair of(Object first, Object second){
        return new Pair(first, second);
    }

    /**
     * Method makes a Pair class object String class object
     * @return
     */
    public String toString(){
        return this.first + "," + this.second;
    }
}
