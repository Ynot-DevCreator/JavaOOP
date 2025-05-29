public class Profissional {
    private int id;
    private String nome;
    private String telefone;

    public Profissional(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }
}
