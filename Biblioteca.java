
import java.util.ArrayList;

public class Biblioteca {
	
	private static final String DATA_EMPRESTIMO_PADRAO = "Hoje";

    public ArrayList<Livro> livros = new ArrayList<>();
    public ArrayList<Emprestimo> emprestimos = new ArrayList<>();


		public void adicionarLivro(String titulo, String autor, int ano) {
		
		    Livro livro = new Livro(titulo, autor, ano);
		
		    livros.add(livro);
		
		}



    public void realizarEmprestimo(Usuario usuario, String titulo) {

    Livro livro = buscarLivroDisponivel(titulo);

    if (livro != null) {

        Emprestimo e = new Emprestimo();

        e.usuario = usuario;
        e.livro = livro;
        e.data = DATA_EMPRESTIMO_PADRAO;

        emprestimos.add(e);

        livro.setDisponivel(false);

        usuario.enviarEmail(
            "Empréstimo realizado: " + titulo
        );

        System.out.println("Empréstimo realizado com sucesso!");

    } else {

        System.out.println("Livro não disponível!");
    }
}

    

	private Livro buscarLivroDisponivel(String titulo) {
	
	    for (Livro l : livros) {
	
	        if (l.getTitulo().equals(titulo) && l.isDisponivel()) {
	            return l;
	        }
	    }
	
	    return null;
	}

    public void listarEmprestimos() {

        for (Emprestimo e : emprestimos) {

            System.out.println(
                e.usuario.nome + " pegou " + e.livro.getTitulo()
            );
        }
    }



	public void relatorioLivros() {
	
	    for (Livro l : livros) {
	
	        System.out.println(
	            l.getTitulo() + " - " + l.obterSituacao()
	        );
	
	    }
	}



}

