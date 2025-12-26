package ex32;

import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }


    public int getDegree() {
        return coeffs.length - 1;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;

            if (sb.length() > 0) {
                sb.append(coeffs[i] > 0 ? " + " : " - ");
            } else if (coeffs[i] < 0) {
                sb.append("-");
            }

            double absCoeff = Math.abs(coeffs[i]);

            if (!(absCoeff == 1 && i != 0)) {
                sb.append(absCoeff);
            }

            if (i >= 1) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }


    public double evaluate(double x) {
        double result = 0;
        double power = 1;

        for (double coeff : coeffs) {
            result += coeff * power;
            power *= x;
        }

        return result;
    }


    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.coeffs.length, right.coeffs.length);
        double[] newCoeffs = new double[maxDegree];

        for (int i = 0; i < maxDegree; i++) {
            double a = (i < this.coeffs.length) ? this.coeffs[i] : 0;
            double b = (i < right.coeffs.length) ? right.coeffs[i] : 0;
            newCoeffs[i] = a + b;
        }

        return new MyPolynomial(newCoeffs);
    }


    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs =
                new double[this.getDegree() + right.getDegree() + 1];

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}
