/*
 * [Graficacion por Computadora]
 * Project for University
 */
package mario.geometric.linear;

/**
 *
 * @author Mario Camacho
 */
public abstract class Tupla {
    protected static final String POINT_FORMAT = "(x,y,z):(%s,%s,%s) %s";
    protected static final String TUPLA_FORMAT = "(x,y,z,w):(%s,%s,%s,%s)";
    protected static final String POINT_VALUE = "POINT";
    protected static final String VECTOR_VALUE = "VECTOR";

    private double values[];

    public Tupla(double x, double y, double z, double w) {
        values = new double[4];
        values[0] = x;
        values[1] = y;
        values[2] = z;
        values[3] = w;
    }

    public void setX(double x) {
        values[0] = x;
    }

    public void setY(double y) {
        values[1] = y;
    }

    public void setZ(double z) {
        values[2] = z;
    }

    public void setW(double w) {
        values[3] = w;
    }

    public double getX() {
        return values[0];
    }

    public double getY() {
        return values[1];
    }

    public double getZ() {
        return values[2];
    }

    public double getW() {
        return values[3];
    }

    public double[] getValues() {
        return values;
    }

    public void multiplicar(double k) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * k;
        }
    }

    public void dividir(double k) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] / k;
        }
    }

    public void setValues(Tupla tupla) {
        for (int i = 0; i < values.length; i++) {
            values[i] = tupla.getValues()[i];
        }
    }

    @Override
    public String toString() {
        if (values[3] == 1) {
            return String.format(POINT_FORMAT, values[0], values[1], values[2], POINT_VALUE);
        } else {
            if (values[3] == 0) {
                return String.format(POINT_FORMAT, values[0], values[1], values[2], VECTOR_VALUE);
            } else {
                return String.format(TUPLA_FORMAT, values[0], values[1], values[2]);
            }
        }
    }
}
