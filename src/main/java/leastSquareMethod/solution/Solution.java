package leastSquareMethod.solution;

import leastSquareMethod.reader.Reader;
import leastSquareMethod.writer.Writer;
import java.util.Arrays;
import static leastSquareMethod.utils.Constants.X_PATH;
import static leastSquareMethod.utils.Constants.Y_PATH;

public class Solution {

    private final double[] x = generateX();


    private final double[] y = generateY();

    double x_ = x_(this.x);


    double x2_ = x2_(this.x);


    double y_ = y_(this.y);


    double xy_ = xy_(this.x, this.y);


    private final double b = bFind();


    private final double a = aFind();

    private double[] generateX() {
        return new Reader().readFile(X_PATH);
    }

    private double[] generateY() {
        return new Reader().readFile(Y_PATH);
    }

    private double x_(double[] x) {
        return Arrays.stream(x).sum();
    }


    private double x2_(double[] x) {
        return Arrays.stream(x).map(i -> i * i).sum();
    }


    private double y_(double[] y) {
        return Arrays.stream(y).map(Math::log).sum();
    }

    private double xy_(double[] x, double[] y) {
        double temp = 0;
        for (var i = 0; i < x.length; i++) {
            temp += x[i] * Math.log(y[i]);
        }
        return temp;
    }

    public double bFind() {
        return (xy_ - (x_ * y_)) / (x2_ - (x_ * x_));
    }

    public double aFind() {
        return x_ * this.b - y_;
    }

    public void writeResult() {
        Writer writer = new Writer();
        writer.writeFile(x, y, a,b);
    }
}
