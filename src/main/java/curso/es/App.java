package curso.es;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hola Javier!" );
        System.out.println(App.sum(3, 3));
    }
    
    public static double sum(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }
    
    public static double doubled(double number) {
        return number * 2;
    }
}
