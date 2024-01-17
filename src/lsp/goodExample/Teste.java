package lsp.goodExample;

// Perceba que continua funcionando mesmo quando passamos como argumento o objeto b
public class Teste {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        ClassB b = new ClassB();

        System.out.println(imprimeNome(a));
        System.out.println(imprimeNome(b));

    }

    public static String imprimeNome(ClassA objeto) {

        return objeto.getNome();

    }

}
