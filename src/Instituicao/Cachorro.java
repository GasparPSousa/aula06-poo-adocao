package Instituicao;

public class Cachorro {

    private String nome;
    private String raca;
    private int anoDeNascimento;
    private double peso;
    private boolean chip;
    private boolean estaFerido;

    public Cachorro(String nome,  String raca, int anoDeNascimento, double peso, boolean chip, boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.anoDeNascimento = anoDeNascimento;
        this.peso = peso;
        this.chip = chip;
        this.estaFerido = estaFerido;
    }

    public Cachorro(String nome, String raca, double peso, boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public int validarIdade(int anoAtual) {
        return anoAtual - anoDeNascimento;
    }

    public String verificarChip() {
        return chip ? "Sim": "Não";
    }

    public String apto() {
       return !estaFerido && (peso > 5) ? "Sim" : "Não";
    }

//Calendar.getInstance(Calendar.YEAR)

}




