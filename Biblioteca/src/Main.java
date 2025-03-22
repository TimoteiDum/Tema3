public class Main {
    public static void main(String[] args) {

        Carte carte1 = new Carte(300);
        Carte carte2 = new Carte(300);
        Carte carte3 = new Carte(250);


        if (carte1.esteIdenticaCu(carte2)) {
            System.out.println("Cartea 1 si Cartea 2 sunt identice.");
        } else {
            System.out.println("Cartea 1 si Cartea 2 NU sunt identice.");
        }

        if (carte1.esteIdenticaCu(carte3)) {
            System.out.println("Cartea 1 si Cartea 3 sunt identice.");
        } else {
            System.out.println("Cartea 1 si Cartea 3 NU sunt identice.");
        }
    }
}
