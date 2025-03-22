
public class Suma {

    
    public static int suma(int a, int b) {
        return a + b;
    }

    
    public static int suma(int a, int b, int c) {
        return suma(a, b) + c; }

    
    public static int suma(int a, int b, int c, int d) {
        return suma(a, b, c) + d; 
    }

    public static void main(String[] args) {
        
        int a = 3, b = 5, c = 7, d = 9;

        
        int suma2 = suma(a, b);
        int suma3 = suma(a, b, c);
        int suma4 = suma(a, b, c, d);

        
        System.out.println("Suma a doua numere: " + suma2); // Afișează suma a și b
        System.out.println("Suma a trei numere: " + suma3); // Afișează suma a, b și c
        System.out.println("Suma a patru numere: " + suma4); // Afișează suma a, b, c și d
    }
}
