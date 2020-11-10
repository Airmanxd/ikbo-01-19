public class prac10 {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex first = factory.createComplex(10, 2);
        System.out.println(first);
        System.out.println(factory.createComplex(2, 5));
    }
}
