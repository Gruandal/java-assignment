package Model;

import weka.core.matrix.DoubleVector;

public class VectorCalculator {
    public static double innerProduct(double x[], double y[]) {
        return (new DoubleVector(x)).innerProduct(new DoubleVector(y));
    }

    public static double norm2(double x[]) {
        return (new DoubleVector(x)).norm2();
    }

    public static double cosine(double[] x, double[] y) {
        return innerProduct(x, y) / (norm2(x) * norm2(y));
    }

    public static double deg(double[] x, double[] y) {
        return Math.acos(cosine(x, y)) * 180 / Math.PI;
    }
}
