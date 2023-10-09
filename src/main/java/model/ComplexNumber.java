package model;

public class ComplexNumber {
    float realNumber;
    float imaginaryNumber;

    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public float getRealNumber() {
        return realNumber;
    }

    public float getImaginaryNumber() {
        return imaginaryNumber;
    }

    @Override
    public String toString() {
        if (imaginaryNumber > 0) {
            if (realNumber == 0) {
                return imaginaryNumber + "i";
            }
            return (realNumber + " + " + imaginaryNumber + "i");
        } else if (imaginaryNumber < 0) {
            if (realNumber == 0) {
                return imaginaryNumber + "i";
            }
            return (realNumber + "" + imaginaryNumber + "i");
        } else {
            return Float.toString(realNumber);
        }
//        return "действительная часть " + realNumber +
//                ", мнимая часть " + imaginaryNumber;
    }
}
