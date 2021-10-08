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
    public int current_size = this.array.length;
    public int size;
    int defaultSize = 10;
    public MyArrayList() {
        int array[] = new int[defaultSize];
    }
    public MyArrayList(int capacity) {
        int array[] = new int[capacity];
    }
    @Override
    public int[] add(int item) {
        int[] arrayTemp = new int[current_size + 1];
        for (int i = 0; i <= current_size; i++){
            arrayTemp[i] = this.array[i];
        }
        arrayTemp[current_size] = item;
        this.array = arrayTemp;
        return array;
    }
    @Override
    public int[] remove(int idx) throws NoSuchElementException {
        int[] arrayTemp = new int[current_size - 1];
        for (int i = 0; i <= current_size; i++){
            if (i == idx){
                continue;
            }
            else{
                arrayTemp[i] = this.array[i];
            }
        }
        this.array = arrayTemp;
        return array;
    }
    @Override
    public int size() {
        return this.array.length;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{
        return this.array[idx];
    }
}
