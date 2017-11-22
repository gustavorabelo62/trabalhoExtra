
import java.util.ArrayList;


public class Contato {
   
    
    private String Nome;
    private String Email;
    private int Telefone;

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public int getTelefone() {
        return Telefone;
    }

    
   
 public Contato(String Nome, String Email, int Telefone) {
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
    }

    
}
