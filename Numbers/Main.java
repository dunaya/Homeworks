import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IncorrectDataException {
        List<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersThree = new ArrayList<>();
        ArrayList<Integer> numbersTwo = new ArrayList<>();
        ArrayList<Integer> numbersOther = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String numbersString = in.nextLine();
        String[] splittedData = numbersString.split(" ");
        if (splittedData.length != 20) {
            throw new IncorrectDataException("You've entered incorrect data: " + numbersString);
        } else {
            for (int i = 0; i <= 19; i++) {
                try {
                    numbers.add(Integer.parseInt(splittedData[i]));
                    if (numbers.get(i) % 3 == 0) {
                        numbersThree.add(numbers.get(i));
                    }
                    if (numbers.get(i) % 2 == 0) {
                        numbersTwo.add(numbers.get(i));
                    }
                    if (numbers.get(i) % 3 != 0 && numbers.get(i) % 2 != 0){
                        numbersOther.add(numbers.get(i));
                    }

                } catch (NumberFormatException ex) {
                    throw new IncorrectDataException(" You've entered incorrect data:" + numbersString);
                }
            }
        }
        printList(numbersThree);
        printList(numbersTwo);
        printList(numbersOther);
    }
    public static void printList(ArrayList<Integer> list){
        for (Integer x: list){
            System.out.println(x);
        }
    }

}
