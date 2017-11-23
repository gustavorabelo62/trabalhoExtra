
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
  	
 	public Contato buscarEmail(String Email ){
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
   
        public Contato buscarNome(String Nome ){
 		for (Contato contato : listaContatos ){
 			if(Contato.getNome().equals(Nome)){
 				System.out.println("Contato encotrado...");
 				System.out.println(Contato);
 				return Contato;
 			}
 		}
 		System.out.println("Cliente não encotrado...");
 		return null;
 	}
        
        public Contato buscarTelefone(int Telefone ){//o equal so funciona com String?
 		for (Contato contato : listaContatos ){
 			if(Contato.getTelefone().equals( Telefone )){
 				System.out.println("Contato encotrado...");
 				System.out.println(Contato);
 				return Contato;
 			}
 		}
 		System.out.println("Cliente não encotrado...");
 		return null;
 	}
        //tentei muda o toString mas não mudou nada 
        /*public String toString(){
  	*	return "\nNome: " + Contato.getNome() +Contato.getEmail()+Contato.getTelefone() +
 	*			"\nNome: " + Contato.getNome() +
        *                       "\nNome: " +Contato.getEmail()+
        *                       "\nNome: " +Contato.getTelefone()
        *              ;
 	*			
  	*}
        */
        
        
}
