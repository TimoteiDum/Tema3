public class Carte {
    private int numarPagini;

    public Carte(int numarPagini) {
        this.numarPagini = numarPagini;
    }

   
    public boolean esteIdenticaCu(Carte altaCarte) {
        return this.numarPagini == altaCarte.numarPagini;
    }
}
