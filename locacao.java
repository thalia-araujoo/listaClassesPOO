import java.util.ArrayList;
import java.util.List;

class Marca {
    private int codigo;
    private String descricao;

    public Marca(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

class Modelo {
    private int codigo;
    private String descricao;

    public Modelo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}

class Automovel {
    private String numeroPlaca;
    private String cor;
    private int ano;
    private String tipoCombustivel;
    private int numeroPortas;
    private double quilometragem;
    private String renavam;
    private String chassi;
    private double valorLocacao;
    private Marca marca;
    private Modelo modelo;

    public Automovel(String numeroPlaca, String cor, int ano, String tipoCombustivel, int numeroPortas, double quilometragem, String renavam, String chassi, double valorLocacao, Marca marca, Modelo modelo) {
        this.numeroPlaca = numeroPlaca;
        this.cor = cor;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
        this.numeroPortas = numeroPortas;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public String getRenavam() {
        return renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public Marca getMarca() {
        return marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Número da Placa: " + numeroPlaca + "\nCor: " + cor + "\nAno: " + ano + "\nTipo de Combustível: " + tipoCombustivel
                + "\nNúmero de Portas: " + numeroPortas + "\nQuilometragem: " + quilometragem + "\nRenavam: " + renavam
                + "\nChassi: " + chassi + "\nValor de Locação: " + valorLocacao + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}

class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + bairro + ", " + cidade;
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Cliente(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nEndereço: " + endereco;
    }
}

class Locacao {
    private Automovel automovel;
    private String dataHoraLocacao;
    private String dataHoraDevolucao;
    private double valorLocacao;
    private Cliente cliente;

    public Locacao(Automovel automovel, String dataHoraLocacao, String dataHoraDevolucao, double valorLocacao, Cliente cliente) {
        this.automovel = automovel;
        this.dataHoraLocacao = dataHoraLocacao;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.valorLocacao = valorLocacao;
        this.cliente = cliente;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public String getDataHoraLocacao() {
        return dataHoraLocacao;
    }

    public String getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Detalhes da Locação:\n" + automovel + "\nData e Hora da Locação: " + dataHoraLocacao
                + "\nData e Hora de Devolução: " + dataHoraDevolucao + "\nValor da Locação: " + valorLocacao
                + "\nCliente: " + cliente;
    }
}

 class SistemaLocacaoVeiculos {
    public static void main(String[] args) {
        Marca marca1 = new Marca(1, "Volkswagen");
        Modelo modelo1 = new Modelo(1, "Gol");

        Automovel carro1 = new Automovel("ABC123", "Prata", 2020, "Gasolina", 4, 30000, "12345", "67890", 100.0, marca1, modelo1);

        Endereco endereco1 = new Endereco("Rua A", 123, "Bairro X", "Cidade Y");

        Cliente cliente1 = new Cliente("João", "12345678901", "987654321", endereco1);

        Locacao locacao1 = new Locacao(carro1, "2023-11-07 10:00", "2023-11-10 12:00", 300.0, cliente1);

        // Exibir informações
        System.out.println("Informações do Automóvel:\n" + carro1);
        System.out.println("\nInformações do Cliente:\n" + cliente1);
        System.out.println("\nDetalhes da Locação:\n" + locacao1);
    }
}
