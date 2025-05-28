public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");
        
        Exercicio ex = new Exercicio("kiko", "Exercicio de aquecimento, imitando o kiko", "sons/kiko.mp3", 3);
        System.out.println("Nome: "+ex.getNome());
        System.out.println("Descrição: "+ex.getDescricao());
        System.out.println("Som: "+ex.getSom());
        System.out.println("Tempo Mínimo: "+ex.getTempoMin());
        
        Exercicio ex1 = new Exercicio("Boca de peixe", "Encoste os lábios firmemente e faça movimentos de abrir e fechar como um peixe.", "sons/peixe.mp3", 3);
        System.out.println("Nome: "+ex1.getNome());
        System.out.println("Descrição: "+ex1.getDescricao());
        System.out.println("Som: "+ex1.getSom());
        System.out.println("Tempo Mínimo: "+ex1.getTempoMin());
        
        Exercicio ex2 = new Exercicio("Sons do Sibilante", "Pronuncie repetidamente os sons “s” e “z” de forma clara e pausada.", "sons/sibilante.mp3", 2);
        System.out.println("Nome: "+ex2.getNome());
        System.out.println("Descrição: "+ex2.getDescricao());
        System.out.println("Som: "+ex2.getSom());
        System.out.println("Tempo Mínimo: "+ex2.getTempoMin());
        
        Exercicio ex3 = new Exercicio("Empurra Língua", "Empurre a língua contra o céu da boca e mantenha por alguns segundos antes de relaxar.", "sons/lingua.mp3", 3);
        System.out.println("Nome: "+ex3.getNome());
        System.out.println("Descrição: "+ex3.getDescricao());
        System.out.println("Som: "+ex3.getSom());
        System.out.println("Tempo Mínimo: "+ex3.getTempoMin());
        
        Paciente p1 = new Paciente();
        p1.email = "emailaleatorio123@gmail.com";
        p1.nome = "José";

        Paciente p2 = new Paciente();
        p2.email = "emailaleatorio312@gmail.com";
        p2.nome = "João";

        Paciente p3 = new Paciente();
        p3.email = "emailaleatorio321@gmail.com";
        p3.nome = "Maria";
    
        Clinica cl1 = new Clinica("FonoVida", "12.345.678/0001-90");
        System.out.println("Nome: "+cl1.getNome());
        System.out.println("CNPJ: "+cl1.getCnpj());
        
        Clinica cl2 = new Clinica("Clínica Voz Ativa", "98.765.432/0001-12");
        System.out.println("Nome: "+cl2.getNome());
        System.out.println("CNPJ: "+cl2.getCnpj());
    }
}
