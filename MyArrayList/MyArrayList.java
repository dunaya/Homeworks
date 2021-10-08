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
    public int current_size = 0;
    public int size = 10;
    public MyArrayList() {
        int array[] = new int[size];
    }
    public MyArrayList(int capacity) {
        int array[] = new int[capacity];
        current_size = capacity;
    }
    @Override
    public void add(int item) {
        int[] arrayTemp = new int[current_size + 1];
        for (int i = 0; i <= current_size; i++){
            arrayTemp[i] = this.array[i];
        }
        arrayTemp[current_size] = item;
        this.array = arrayTemp;
        current_size++;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException {
        if (idx >= current_size || idx < 0){
            throw new NoSuchElementException("There is no such index");
        }

            int x = array[idx];
            int[] arrayTemp = new int[current_size - 1];
            for (int i = 0; i < current_size; i++) {
                if (i == idx) {
                    continue;
                } else if(i > idx){
                    arrayTemp[i - 1] = this.array[i];
                }
                else{
                    arrayTemp[i] = this.array[i];
                }
            }
            this.array = arrayTemp;
        current_size--;
            return x;

    }
    @Override
    public int size() {
        return current_size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{
        if (idx >= size || idx < 0){
            throw new NoSuchElementException("There is no such index");
        }
        else {
            return this.array[idx];
        }
    }
}
