 
 class Porta {
    private boolean aberta;
    private String cor;

    public Porta() {
        this.aberta = false;
        this.cor = "Branca";
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
}

class Casa {
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta();
        this.porta2 = new Porta();
        this.porta3 = new Porta();
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int contador = 0;
        if (porta1.estaAberta()) {
            contador++;
        }
        if (porta2.estaAberta()) {
            contador++;
        }
        if (porta3.estaAberta()) {
            contador++;
        }
        return contador;
    }
}

 class ExemploCasa {
    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Amarela");

        System.out.println("Cor da Casa: " + minhaCasa.cor);
        System.out.println("Número de Portas Abertas: " + minhaCasa.quantasPortasEstaoAbertas());

        minhaCasa.porta1.abre();
        minhaCasa.porta3.abre();

        System.out.println("\nAbrindo Porta 1 e Porta 3...");
        System.out.println("Número de Portas Abertas: " + minhaCasa.quantasPortasEstaoAbertas());

        minhaCasa.porta2.fecha();

        System.out.println("\nFechando Porta 2...");
        System.out.println("Número de Portas Abertas: " + minhaCasa.quantasPortasEstaoAbertas());

        minhaCasa.pinta("Azul");

        System.out.println("\nPintando a Casa de Azul...");
        System.out.println("Cor da Casa: " + minhaCasa.cor);
    }
}
