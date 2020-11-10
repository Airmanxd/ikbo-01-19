public class Complex {
    int real, imaginary;
    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(){};
    public double getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public double getimaginary() {
        return imaginary;
    }

    public void setimaginary(int imaginary) {
        this.imaginary = imaginary;
    }
    public String toString()
    {
        return real + " + i" + imaginary;
    }
}
