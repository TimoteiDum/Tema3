public class Patrat {
    private int latura;

    public Patrat() {
        this.latura = 10;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }

    public void tipareste() {
        int aria = latura * latura;
        System.out.println("Patrat  l=" + latura + "  Aria=" + aria);
    }
}
