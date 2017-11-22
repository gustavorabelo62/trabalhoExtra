
import java.util.ArrayList;


public class Consultar {
    private Contato Contato;
    ArrayList<Contato> listaContatos = new ArrayList<>();
   
    
        
        public void setContato(Contato contato) {
 		this.Contato = contato;
        }
 	//cadastrar um contato
        
 	public void cadastrarContato(Contato c){
 		listaContatos.add(c);
  	}
  	
 	public Contato buscarContato(String cpf){
 		for (Contato contato : listaContatos ){
 			if(Contato.getEmail().equals(Email)){
 				System.out.println("Contato encotrado...");
 				System.out.println(Contato);
 				return Contato;
 			}
 		}
 		System.out.println("Cliente não encotrado...");
 		return null;
 	}
   
}
