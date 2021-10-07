import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координату x первого вектора:");
        double x1 = in.nextDouble();
        System.out.println("Введите координату y первого вектора:");
        double y1 = in.nextDouble();
        System.out.println("Введите координату z первого вектора:");
        double z1 = in.nextDouble();
        System.out.println("Введите координату x второго вектора:");
        double x2 = in.nextDouble();
        System.out.println("Введите координату y второго вектора:");
        double y2= in.nextDouble();
        System.out.println("Введите координату z второго вектора:");
        double z2 = in.nextDouble();
        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);
        in.close();
        Vector vectorCP = vector1.crossProduct(vector2);
        Vector vectorAdd = vector1.add(vector2);
        Vector vectorSubstract = vector1.subtract(vector2);
        System.out.println("The length of vector1 = " + vector1.length());
        System.out.println("The length of vector2 = " + vector2.length());
        System.out.println("The scalar product of vector1 and vector2 = " + vector1.scalarProduct(vector2));
        System.out.println("The cross product of vector1 and vector2 = (" + vectorCP.getX() + ", " + vectorCP.getY() + ", " + vectorCP.getZ() +")");
        System.out.println("The cos of the angle between vector1 and vector2 = " + vector1.cos(vector2));
        System.out.println("The sum of vector1 and vector2 = (" + vectorAdd.getX() + ", " + vectorAdd.getY() + ", " + vectorAdd.getZ() + ")");
        System.out.println("The substract between vector1 and vector2 = (" + vectorSubstract.getX() + ", " + vectorSubstract.getY() + ", " + vectorSubstract.getZ() + ")");

    }
}
