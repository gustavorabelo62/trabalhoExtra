
public class Principal {

   
    public static void main(String[] args) {
       
        Contato c1 = new Contato("gustavo", "gustavorabelo62@yahoo.com.br", "99999999");
        Consultar s1 = new Consultar();
        
        s1.cadastrarContato(c1);

        System.out.println(c1);
        
    }
    
}
