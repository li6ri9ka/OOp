public class ComplexNumber {
    private double valid;
    private double imaginary;

    public ComplexNumber(double valid, double imaginary) {
        this.valid = valid;
        this.imaginary = imaginary;
    }

    public ComplexNumber additions(ComplexNumber other) {
        return new ComplexNumber(this.valid + other.valid, this.imaginary+ other.imaginary);
    }


    public ComplexNumber subtractions(ComplexNumber other) {
        return new ComplexNumber(this.valid - other.valid, this.imaginary - other.imaginary);
    }


    public ComplexNumber multiplication(ComplexNumber other) {
         double realPath = this.valid * other.valid - this.imaginary * other.imaginary;
         double imaginaryPath = this.valid * other.imaginary + this.imaginary * other.valid;
        return new ComplexNumber(realPath, imaginaryPath);
    }


    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.valid * other.valid + other.imaginary * other.imaginary;
        double realPath = (this.valid * other.valid + this.imaginary * other.imaginary)/denominator;
        double imaginaryPath = (this.imaginary * other.valid - this.valid * other.imaginary)/denominator;
        return new ComplexNumber(realPath, imaginaryPath);
    }

    @Override
    public String toString() {
        return valid + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3,2);
        ComplexNumber c2 = new ComplexNumber(1,-4);

        System.out.println(c1.additions(c2));
        System.out.println(c1.subtractions(c2));
        System.out.println(c1.multiplication(c2));
        System.out.println(c1.divide(c2));
    }

}
