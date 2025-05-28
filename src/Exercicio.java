public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin;
    private String exemplo;
    
    public Exercicio(String nome, String descricao, String som, int tempoMin, String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
        this.exemplo = exemplo;
    }

    public Exercicio(String nome, String descricao, String som, int tempoMin) {
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
    }

    public Exercicio(String nome, String descricao, String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSom() {
        return som;
    }

    public int getTempoMin() {
        return tempoMin;
    }

    public String getExemplo() {
        return exemplo;
    }
}   