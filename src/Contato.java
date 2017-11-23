


public class Contato {
   
    
    private String Nome;
    private String Email;
    private String Telefone;

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    
   
 public Contato(String Nome, String Email, String Telefone) {
        this.Nome = Nome;
        this.Email = Email;
        this.Telefone = Telefone;
    }

    
}
