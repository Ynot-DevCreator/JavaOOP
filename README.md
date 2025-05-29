# JFono 🎤 - Monitoramento de Exercícios Vocais

-----

## 💡 Situação Problema

O projeto **JFono** nasceu da necessidade premente de professores e profissionais da voz de **monitorar e acompanhar a execução de exercícios vocais**. A prática incorreta ou a ausência de monitoramento pode levar a problemas sérios de saúde vocal, como **rouquidão, nódulos e outras doenças das cordas vocais**.

Atualmente, muitos desses processos são manuais e carecem de um acompanhamento estruturado, dificultando a prevenção e a reabilitação vocal eficaz. O JFono busca oferecer uma solução digital robusta para **otimizar o fluxo de trabalho**, **melhorar a comunicação** e **centralizar as informações** relevantes para clínicas, profissionais de fonoaudiologia e pacientes em tratamento vocal. Nosso objetivo é apoiar a saúde vocal de forma proativa e eficiente.

-----

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

  * **Linguagem de Programação:** Java
  * **Controle de Versão:** Git
  * **Plataforma de Hospedagem de Código:** GitHub
  * **Ferramentas de Desenvolvimento:** Ambiente de Desenvolvimento Integrado (IDE) como Visual Studio Code ou Eclipse.

-----

## 📦 Classes do Projeto

O JFono é estruturado em torno de algumas classes fundamentais que representam as entidades e os conceitos chave do sistema.

### 📁 `App.java`

A classe principal que contém o método `main` para execução do programa. Aqui são criados e manipulados os objetos das demais classes para demonstrar suas funcionalidades básicas.

### 🏥 `Clinica.java`

Representa uma clínica de fonoaudiologia.

  * **Atributos:** `id` (int), `nome` (String), `cnpj` (String).
  * **Responsabilidades:** Armazenar informações básicas da clínica.

### 🎤 `Exercicio.java`

Representa um exercício vocal que será monitorado.

  * **Atributos:** `id` (int), `nome` (String), `descricao` (String), `som` (String), `tempoMin` (int), `exemplo` (String).
  * **Responsabilidades:** Descrever os exercícios vocais, incluindo detalhes como a instrução, o som associado, o tempo mínimo de execução e um exemplo. Possui sobrecarga de construtores para diferentes níveis de detalhe.

### 👤 `Paciente.java`

Representa um paciente que realiza os exercícios vocais.

  * **Atributos:** `id` (int), `nome` (String), `email` (String).
  * **Responsabilidades:** Armazenar informações básicas do paciente.

### 👩‍⚕️ `Profissional.java`

Representa um profissional de fonoaudiologia que acompanha os pacientes.

  * **Atributos:** `id` (int), `nome` (String), `telefone` (String).
  * **Responsabilidades:** Armazenar informações básicas do profissional.

-----

## 🧠 Competências Desenvolvidas

Durante a semana de desenvolvimento deste projeto, foram aprimoradas diversas competências essenciais em Programação Orientada a Objetos (POO) em Java:

  * **Criação de Classes:** Entendimento e aplicação da estrutura de classes para modelar entidades do mundo real (`Exercicio`, `Clinica`, `Paciente`, `Profissional`).
  * **Atributos:** Definição de características (`nome`, `cnpj`, `descricao`, etc.) para representar o estado dos objetos.
  * **Métodos:** Implementação de comportamentos e ações que os objetos podem realizar.
  * **Objetos e Instanciação:** Criação de instâncias de classes e manipulação de seus estados.
  * **Construtores:** Utilização de construtores para inicializar objetos no momento da criação, incluindo a prática de **sobrecarga de construtores** para permitir diferentes formas de inicialização (ex: `Exercicio` com nome, com nome e descrição, etc.).
  * **`static`:** Compreensão e aplicação de membros estáticos (embora não explicitamente usados neste *snippet*, a competência foi abordada).
  * **Métodos Getters e Setters:** Implementação de métodos de acesso e modificação para atributos (encapsulamento), garantindo o controle sobre o estado dos objetos.
  * **Chamada de Construtor:** Prática da sintaxe e do uso de construtores para criar objetos.
  * **Sintaxe para Construção de Métodos:** Aprofundamento na sintaxe correta para definir métodos em Java.
  * **Instanciação de Objetos:** Reforço na prática de criar objetos a partir de classes.

-----

## 💻 Código-Fonte

Aqui está a estrutura do código-fonte do projeto JFono, organizado por classes para facilitar a compreensão.

### `App.java`

```java
import java.util.Scanner; // Importa a classe Scanner, embora não utilizada no snippet atual, é comum para entrada de dados.

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono"); // Mensagem de início do programa.

        // Criação do primeiro objeto Exercicio usando o construtor completo
        Exercicio ex = new Exercicio("Soprar bolinhas de algodão",
                                     "Usar canudo para soprar bolinhas por um caminho até um alvo",
                                     "/", // som (não aplicável para este exercício)
                                     2,   // tempo mínimo
                                     "/"); // exemplo (não aplicável para este exercício)

        // Criação do segundo objeto Exercicio usando um construtor com sobrecarga (nome, descrição, exemplo)
        Exercicio ex1 = new Exercicio("Vibrar lábios",
                                      "Fazer os lábios vibrarem, como um som de motor de carro, para relaxar a musculatura e aquecer a voz",
                                      "brrrrr - som de motor"); // exemplo

        // Exibição dos atributos do primeiro exercício usando métodos getters
        System.out.println("nome:" + ex.getNome());
        System.out.println("descrição:" + ex.getDescricao());
        System.out.println("som:" + ex.getSom());
        System.out.println("tempo mínimo:" + ex.getTempoMin());
        System.out.println("exemplo:" + ex.getExemplo());

        // Exibição dos atributos do segundo exercício
        System.out.println("nome:" + ex1.getNome());
        System.out.println("descrição:" + ex1.getDescricao());
        System.out.println("exemplo:" + ex1.getExemplo());

        // --- Exemplos adicionais solicitados no desafio ---

        // Criação de mais um objeto Exercicio usando o construtor com apenas o nome (sobrecarga)
        Exercicio ex2 = new Exercicio("Apito do Navio");
        System.out.println("Nome:" + ex2.getNome());

        // Criação de dois objetos Clinica
        Clinica c1 = new Clinica("FonoTech", "1234567895236");
        System.out.println(c1.getNome());
        System.out.println(c1.getCnpj());

        // Instanciação e acesso via getters para um segundo objeto Clinica
        Clinica c2 = new Clinica("VozAtiva", "9876543210123");
        System.out.println("Clínica: " + c2.getNome() + ", CNPJ: " + c2.getCnpj());

        // Criação de dois objetos Profissional
        Profissional p1 = new Profissional("Jacobson", "61987789876");
        System.out.println("nome: " + p1.getNome() + "\ntelefone:" + p1.getTelefone());

        // Instanciação e acesso via getters para um segundo objeto Profissional
        Profissional p2 = new Profissional("Maria Silva", "11998877665");
        System.out.println("Nome: " + p2.getNome() + ", Telefone: " + p2.getTelefone());

        // Criação de dois objetos Paciente (necessita de getters e setters completos na classe Paciente)
        Paciente pac1 = new Paciente(); // Usa o construtor padrão
        pac1.setNome("Ana Paula");
        pac1.setEmail("ana.paula@email.com");
        System.out.println("Paciente: " + pac1.getNome() + ", Email: " + pac1.getEmail());

        Paciente pac2 = new Paciente();
        pac2.setNome("Carlos Souza");
        pac2.setEmail("carlos.souza@email.com");
        System.out.println("Paciente: " + pac2.getNome() + ", Email: " + pac2.getEmail());
    }
}
```

### `Clinica.java`

```java
public class Clinica {
    private int id; // Atributo para identificação única da clínica
    private String nome; // Nome da clínica
    private String cnpj; // CNPJ da clínica

    // Construtor padrão (sem argumentos)
    public Clinica() {
        // Pode ser usado para inicializar atributos com valores padrão ou deixar em branco
    }

    // Construtor com argumentos para nome e CNPJ (sobrecarga)
    public Clinica(String nome, String cnpj) {
        this.nome = nome;   // 'this' refere-se ao atributo da instância
        this.cnpj = cnpj;
    }

    // Método getter para 'id'
    public int getId() {
        return id;
    }

    // Método setter para 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Método getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Método setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para 'cnpj'
    public String getCnpj() {
        return cnpj;
    }

    // Método setter para 'cnpj'
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
```

### `Exercicio.java`

```java
public class Exercicio {
    private int id; // Atributo para identificação única do exercício
    private String nome; // Nome do exercício
    private String descricao; // Descrição detalhada de como realizar o exercício
    private String som; // Som associado ao exercício, se houver (ex: "brrrrr")
    private int tempoMin; // Tempo mínimo de duração recomendado para o exercício
    private String exemplo; // Um exemplo prático ou observação adicional sobre o exercício

    // Construtor padrão
    public Exercicio() {
    }

    // Construtor completo com todos os atributos (sobrecarga)
    public Exercicio(String nome,
                     String descricao,
                     String som,
                     int tempoMin,
                     String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
        this.exemplo = exemplo;
    }

    // Construtor com nome, descrição e exemplo (sobrecarga)
    public Exercicio(String nome,
                     String descricao,
                     String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
    }

    // Construtor com apenas o nome (sobrecarga)
    public Exercicio(String nome) {
        this.nome = nome;
    }

    // Métodos getters para acessar os valores dos atributos (não há setters neste exemplo,
    // o que significa que, uma vez criado, os atributos não podem ser alterados diretamente)
    public String getNome() {
        return this.nome;
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

    // Métodos setters para alterar os valores dos atributos (adicionados para completeza,
    // seguindo a prática comum de encapsulamento)
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public void setTempoMin(int tempoMin) {
        this.tempoMin = tempoMin;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;
    }
}
```

### `Paciente.java`

```java
public class Paciente {
    private int id; // Atributo para identificação única do paciente
    private String nome; // Nome do paciente
    private String email; // Endereço de e-mail do paciente

    // Construtor padrão (sem argumentos)
    public Paciente() {
    }

    // Construtor com argumentos para nome e email (adicionado para demonstração de sobrecarga)
    public Paciente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Método setter para 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Método getter para 'id'
    public int getId() {
        return id;
    }

    // Método setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Método setter para 'email'
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para 'email'
    public String getEmail() {
        return email;
    }
}
```

### `Profissional.java`

```java
public class Profissional {
    private int id; // Atributo para identificação única do profissional
    private String nome; // Nome do profissional
    private String telefone; // Telefone de contato do profissional

    // Construtor padrão
    public Profissional() {
    }

    // Construtor com argumentos para nome e telefone (sobrecarga)
    public Profissional(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Método getter para 'id'
    public int getId() {
        return id;
    }

    // Método setter para 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Método getter para 'nome'
    public String getNome() {
        return nome;
    }

    // Método setter para 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para 'telefone'
    public String getTelefone() {
        return telefone;
    }

    // Método setter para 'telefone'
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
```