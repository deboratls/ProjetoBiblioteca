package app;

import br.edu.ifms.biblioteca.DAO.LivrosDAO;
import br.edu.ifms.biblioteca.model.Livros;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicio extends Application{

	public static void main(String[] args) {
		launch(args);
		// TODO Auto-generated method stub

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			FXMLLoader telaacervo = new FXMLLoader(getClass().getResource("/view/Aluno.fxml"));
			Parent acervo = telaacervo.load();
			//BorderPane root = new BorderPane();
			Scene scene = new Scene(acervo,700,400);
			scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * Aluno aluno = new Aluno(); aluno.setRA(123);
		 * aluno.setDtEntrada(LocalDate.now()); aluno.setDtSaida(LocalDate.now());
		 * 
		 * AlunoDAO daoAluno = new AlunoDAO(); daoAluno.inserir(aluno);
		 * 
		 * AlunoDAO daoAlunodel = new AlunoDAO(); daoAluno.deletar(aluno);
		 * 
		 * AlunoDAO daoAlunoup = new AlunoDAO(); daoAluno.update(aluno);
		 */
		//-------------------------------------------	
		
		/*
		 * Acervo acervo = new Acervo(); //acervo.setId(1); acervo.setCodigo(987);
		 * acervo.setEditora("Saraiva"); acervo.setTitulo("nao sei");
		 * acervo.setQuantidade(4);
		 * 
		 * 
		 * AcervoDAO daoAcervo = new AcervoDAO(); daoAcervo.inserir(acervo);
		 * 
		 * AcervoDAO daoAcervodel = new AcervoDAO(); daoAcervo.deletar(acervo);
		 * 
		 * AcervoDAO daoAcervoup = new AcervoDAO(); daoAcervo.update(acervo);
		 */
		//-------------------------------------------	
		
				
		
		/*
		 * Emprestimo emp = new Emprestimo(); //emp.setId(1);
		 * emp.setDtRetirada(LocalDate.of(2020,03,21)); emp.setPrazo(4);
		 * emp.setIdPessoa(2);
		 * 
		 * EmprestimoDAO daoEmprestimo = new EmprestimoDAO();
		 * daoEmprestimo.inserir(emp);
		 * 
		 * EmprestimoDAO daoEmprestimodel = new EmprestimoDAO();
		 * daoEmprestimo.deletar(emp);
		 * 
		 * EmprestimoDAO daoEmprestimoUp = new EmprestimoDAO();
		 * daoEmprestimo.update(emp);
		 */
		 
		 
		  //-------------------------------------------
		  
		
		
		/*
		 * Funcionario func = new Funcionario(); func.setMatricula("tr3454");
		 * func.setSalario(10.000); func.setCargo("Gerente");
		 * 
		 * FuncionarioDAO daoFuncionario = new FuncionarioDAO();
		 * daoFuncionario.inserir(func);
		 * 
		 * 
		 * FuncionarioDAO daoFuncionariodel = new FuncionarioDAO();
		 * daoFuncionario.deletar(func);
		 * 
		 * FuncionarioDAO daoFuncionarioup = new FuncionarioDAO();
		 * daoFuncionario.update(func);
		 */
		 
		 		 
		   
		  //-------------------------------------------
		  
		
		
		
//		  Livros lv = new Livros(); 
//		  lv.setAutores("kmei"); 
//		  lv.setAnoPublicacao(932);
//		  lv.setISBN(4567);
//		  lv.setVolume(2); lv.setISBN(8787);
//		  
//		  LivrosDAO daoLivros = new LivrosDAO(); daoLivros.inserir(lv);
//		  
//		  LivrosDAO daoLivrosdel = new LivrosDAO(); daoLivros.deletar(lv);
//		  
//		  LivrosDAO daoLivrosup = new LivrosDAO(); daoLivros.update(lv);
		 
		  //-------------------------------------------
		  
		/*
		 * Multa ml = new Multa();
		 * 
		 * //ml.setIdEmprestimo(2376); ml.setDtDevolucao(LocalDate.of(2019, 03, 21));
		 * ml.setValor(4.000);
		 * 
		 * MultaDAO daoMulta = new MultaDAO(); daoMulta.inserir(ml);
		 * 
		 * MultaDAO daoMultadel = new MultaDAO(); daoMulta.deletar(ml);
		 * 
		 * MultaDAO daoMultaup = new MultaDAO(); daoMulta.update(ml);
		 */
		  //-------------------------------------------
		  
		/*
		 * Periodicos pd = new Periodicos();
		 * 
		 * pd.setAutores("dfrtgyh"); pd.setISSN(938942);
		 * 
		 * PeriodicosDAO daoPeriodicos = new PeriodicosDAO();
		 * //daoPeriodicos.inserir(pd);
		 * 
		 * PeriodicosDAO daoPeriodicosdel = new PeriodicosDAO();
		 * //daoPeriodicos.deletar(pd);
		 * 
		 * PeriodicosDAO daoPeriodicosup = new PeriodicosDAO();
		 * //daoPeriodicos.update(pd);
		 */		  
		  
		 
		
		
		
	}

}
