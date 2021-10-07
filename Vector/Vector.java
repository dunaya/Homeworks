import static java.lang.Double.doubleToLongBits;

public class Vector
{
    double x;
    double y;
    double z;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;

    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) obj;
        return this.length() == vector.length() && this.cos(vector) == 1.0;
    }
    @Override
    public int hashCode(){
        int result = 0;
        long x = doubleToLongBits(this.x);
        result += 31 * (int)(x ^ (x >>> 32));
        long y = doubleToLongBits(this.y);
        result += 31 * (int)(y ^ (y >>> 32));
        long z = doubleToLongBits(this.z);
        result += 31 * (int)(z ^ (z >>> 32));
        return result;
    }
    // Длина вектора. Корень из суммы квадратов
    double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return (scalarProduct(vector))/(length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        Vector total = new Vector(x + vector.x, y + vector.y, z + vector.y);
        return total;
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(x - vector.x, y - vector.y, z - vector.y);
    }
}
