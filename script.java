// Classe base (superclasse)
class Animal {
    String nome;

    // Construtor
    Animal(String nome) {
        this.nome = nome;
    }

    // Método comum a todos os animais
    void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

// Classe Cachorro herda de Animal (herança)
class Cachorro extends Animal {
    Cachorro(String nome) {
        super(nome);
    }

    // Sobrescrevendo o método uasndo polimorfismo
    @Override
    void fazerSom() {
        System.out.println(nome + " late: Au!");
    }
}

// Classe Gato herda de Animal
class Gato extends Animal {
    Gato(String nome) {
        super(nome);
    }

    // Outro exemplo de polimorfismo
    @Override
    void fazerSom() {
        System.out.println(nome + " mia: Miau!");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Animal meuCachorro = new Cachorro("DOG_NAME");
        Animal meuGato = new Gato("GATO_NAME");

        // Chamando métodos (polimorfismo em ação)
        meuCachorro.fazerSom();
        meuGato.fazerSom();
    }
}
