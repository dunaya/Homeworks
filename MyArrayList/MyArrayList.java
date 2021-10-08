import java.util.NoSuchElementException;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList {
    public int array[];
    public int current_size;
    public int size = 10;
    public MyArrayList() {
        int array[] = new int[size];
    }
    public MyArrayList(int capacity) {
        int array[] = new int[capacity];
    }
    @Override
    public void add(int item) {
        int[] arrayTemp = new int[current_size + 1];
        for (int i = 0; i <= current_size; i++){
            arrayTemp[i] = this.array[i];
        }
        arrayTemp[current_size] = item;
        this.array = arrayTemp;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException {
        if (idx >= current_size){
            throw new NoSuchElementException("There is no such index");
        }
        else {
            int x = array[idx];
            int[] arrayTemp = new int[current_size - 1];
            for (int i = 0; i <= current_size; i++) {
                if (i == idx) {
                    continue;
                } else {
                    arrayTemp[i] = this.array[i];
                }
            }
            this.array = arrayTemp;
            return x;
        }
    }
    @Override
    public int size() {
        return current_size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{
        if (idx >= size){
            throw new NoSuchElementException("There is no such index");
        }
        else {
            return this.array[idx];
        }
    }
}
