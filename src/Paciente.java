public class Paciente {
    private int id;
    private String nome;
    private String email;
    
    public Paciente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Paciente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Métodos de Acesso
    //Log - procedimento - retorno vazio (void)
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Log - Função - Retorno - int, String, double...
    public String getNome() { 
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() { 
        return email;
    }

    /* Diferenças entre o método set e o construtor
     * 
     * O método set não faz tudo que o construtor faz
     * Mas o construtor faz tudo que o set faz
     * 
     * método set - atribue o valor
     * construtor - cria o objeto e atribue valor
     * 
     * método get - recupera o valor
     * 
     * toString() método da classe Object
     * sobrescrever (polimorfismo)
     */
}
