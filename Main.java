
public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("Java Básico", "João", 2020);
        biblioteca.adicionarLivro("POO", "Maria", 2021);
        biblioteca.adicionarLivro("Banco de Dados", "Carlos", 2019);

        Usuario usuario = new Usuario();
        usuario.nome = "Pedro";
        usuario.idade = 20;
        usuario.email = "pedro@email.com";

        biblioteca.realizarEmprestimo(usuario, "Java Básico");

        System.out.println("\nLista de Empréstimos:");
        biblioteca.listarEmprestimos();

        System.out.println("\nRelatório de Livros:");
        biblioteca.relatorioLivros();
    }
}
