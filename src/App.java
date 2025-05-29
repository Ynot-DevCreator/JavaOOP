public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono!");
        
        Exercicio ex = new Exercicio("kiko", "Exercicio de aquecimento, imitando o kiko", "sons/kiko.mp3", 3);
        System.out.println("\nExercício(s):");
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

        Exercicio ex4 = new Exercicio("Repetição de sílabas", "Repetir sílabas simples como “pa-pa”, “ta-ta”, “ka-ka” para melhorar a coordenação motora da fala.", "sons/repeticao.mp3", 3);
        System.out.println("Nome: "+ex4.getNome());
        System.out.println("Descrição: "+ex4.getDescricao());
        System.out.println("Som: "+ex4.getSom());
        System.out.println("Tempo Mínimo: "+ex4.getTempoMin());
        
        Exercicio ex5 = new Exercicio("Trava-Línguas", "Repetir lentamente um trava-línguas para melhorar a articulação das palavras.", "sons/travalingua.mp3", 5);
        System.out.println("Nome: "+ex5.getNome());
        System.out.println("Descrição: "+ex5.getDescricao());
        System.out.println("Som: "+ex5.getSom());
        System.out.println("Tempo Mínimo: "+ex5.getTempoMin());

        Paciente p1 = new Paciente("José", "emailaleatorio123@gmail.com");
        System.out.println("\nPaciente(s):");
        System.out.println("Nome: "+p1.getNome()+"\nEmail: "+p1.getEmail());
        Paciente p2 = new Paciente("João", "emailaleatorio312@gmail.com");
        System.out.println("Nome: "+p2.getNome()+"\nEmail: "+p2.getEmail());
        Paciente p3 = new Paciente("Maria", "emailaleatorio321@gmail.com");
        System.out.println("Nome: "+p3.getNome()+"\nEmail: "+p3.getEmail());
        Paciente p4 = new Paciente("Josefa", "emailaleatorio341@gmail.com");
        System.out.println("Nome: "+p4.getNome()+"\nEmail: "+p4.getEmail());
        Paciente p5 = new Paciente("Cremilda", "emailaleatorio451@gmail.com");
        System.out.println("Nome: "+p5.getNome()+"\nEmail: "+p5.getEmail());

        Profissional pr1 = new Profissional("Larissa", " (51) 99777-6655");
        System.out.println("\nProfissional(s):");
        System.out.println("Nome: "+pr1.getNome()+"\nTelefone: "+pr1.getTelefone());
        Profissional pr2 = new Profissional("Ronalda", " (31) 96507-0435");
        System.out.println("Nome: "+pr2.getNome()+"\nTelefone: "+pr2.getTelefone());

        Clinica cl1 = new Clinica("FonoVida", "12.345.678/0001-90");
        System.out.println("\nCliente(s):");
        System.out.println("Nome: "+cl1.getNome());
        System.out.println("CNPJ: "+cl1.getCnpj());
        
        Clinica cl2 = new Clinica("Clínica Voz Ativa", "98.765.432/0001-12");
        System.out.println("Nome: "+cl2.getNome());
        System.out.println("CNPJ: "+cl2.getCnpj());

        Clinica cl3 = new Clinica("Clínica FonoFácil", "45.678.901/0001-33");
        System.out.println("Nome: "+cl3.getNome());
        System.out.println("CNPJ: "+cl3.getCnpj());

        Clinica cl4 = new Clinica("Centro de Fonoaudiologia Express", "67.890.123/0001-77");
        System.out.println("Nome: "+cl4.getNome());
        System.out.println("CNPJ: "+cl4.getCnpj());
    }
}
