class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        idade++;
    }

    public void imprimirIdade() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

 class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        pessoa.imprimirIdade();

        pessoa.fazAniversario();
        pessoa.fazAniversario();
        pessoa.fazAniversario();

        pessoa.imprimirIdade();
    }
}
