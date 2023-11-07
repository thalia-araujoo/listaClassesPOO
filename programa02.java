class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta() {
        this.aberta = false;
        this.cor = "Branca";
        this.dimensaoX = 80.0;
        this.dimensaoY = 200.0;
        this.dimensaoZ = 4.0;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public void alteraDimensoes(double x, double y, double z) {
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    public String toString() {
        return "Porta " + (aberta ? "aberta" : "fechada") + " de cor " + cor + " com dimensões (X x Y x Z): " + dimensaoX + " x " + dimensaoY + " x " + dimensaoZ;
    }
}

 class ExemploPorta {
    public static void main(String[] args) {
        Porta porta = new Porta();

        System.out.println("Porta Inicial:\n" + porta);

        porta.abre();
        System.out.println("\nPorta Aberta:\n" + porta);

        porta.fecha();
        System.out.println("\nPorta Fechada:\n" + porta);

        porta.pinta("Vermelha");
        System.out.println("\nPorta Pintada de Vermelho:\n" + porta);

        porta.alteraDimensoes(90.0, 210.0, 5.0);
        System.out.println("\nPorta com Dimensões Alteradas:\n" + porta);

        boolean estaAberta = porta.estaAberta();
        System.out.println("\nA Porta está aberta? " + estaAberta);
    }
}
