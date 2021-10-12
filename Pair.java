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

    /**
     * A getter
     * @return the value of second parameter
     */
    public S getSecond(){
        return second;
    }


    /**
     * Indicates whether some other object is "equal to" this Pair. The other object is considered equal if:
     * it is also a Pair and;
     * both instances have no value present or;
     * the present first values are "equal to" each other via equals(), the same with second values.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        Pair pair = (Pair) o;
        if (getFirst() == null) {
            if (pair.getFirst() != null)
                return false;
        } else if (!getFirst().equals(pair.getFirst()))
            return false;
        if (getSecond() == null) {
            if (pair.getSecond() != null)
                return false;
        } else if (!getSecond().equals(pair.getSecond()))
            return false;
        return true;
    }

    /**
     * @return Returns the hash code value of the present values, if any, or 0 (zero) if no value is present.
     */
    @Override
    public int hashCode() {
        if (getFirst() == null && getSecond() == null) return 0;
        return Objects.hash(getFirst(), getSecond());
    }

    /**
     * Method creates a Pair class pair out of two parameters
     * @param first
     * @param second
     * @return a Pair object
     */
    public static Pair of(Object first, Object second){
        return new Pair(first, second);
    }

    /**
     * Method makes a Pair class object String class object
     * @return a String object
     */
    public String toString(){
        return this.first + "," + this.second;
    }
}
