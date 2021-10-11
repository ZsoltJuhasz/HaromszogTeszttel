public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Triangle triangle = new Triangle();
        double result = triangle.calcArea(30, 35);
        System.out.println("Háromszög területe: " + result);
    }
}
