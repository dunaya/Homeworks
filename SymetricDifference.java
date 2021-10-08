import java.util.HashSet;
import java.util.Set;

public class SymetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setFirst = new HashSet<T>(set1);
        Set<T> setSecond = new HashSet<T>(set2);
        Set<T> setFirstSave = setFirst;
        Set<T> setSecondSave = setSecond;
        setFirstSave.removeAll(setSecond);
        setSecondSave.removeAll(setFirst);
        setFirstSave.addAll(setSecondSave);
        return setFirstSave;
    }
}
