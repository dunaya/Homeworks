import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> parseNumbers(String args) throws IncorrectDataException {
        String[] splittedData = args.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        if (splittedData.length != 20) {
            throw new IncorrectDataException("You've entered invalid data: " + args);
        } else {
            for (int i = 0; i <= 19; i++) {
                try {
                    list.add(Integer.parseInt(splittedData[i]));
                } catch (NumberFormatException ex) {
                    throw new IncorrectDataException(" You've entered invalid data:" + args);
                }
            }
        }
        return list;
    }
    public static void main(String[] args) throws IncorrectDataException {
        ArrayList<Integer> numbersThree = new ArrayList<>();
        ArrayList<Integer> numbersTwo = new ArrayList<>();
        ArrayList<Integer> numbersOther = new ArrayList<>();
        String line = (new Scanner(System.in)).nextLine();
        ArrayList<Integer> listMain = parseNumbers(line);
        for (int i = 0; i <= 19; i++) {
            if (listMain.get(i) % 3 == 0){
                numbersThree.add(listMain.get(i));
            }
            if (listMain.get(i) % 2 == 0){
                numbersTwo.add(listMain.get(i));
                continue;
            }
            numbersOther.add(listMain.get(i));
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
