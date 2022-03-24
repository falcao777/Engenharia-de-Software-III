
public class Fila {

  private String Papel;

    public String getPapel() {
        
        return Papel;
    }

    public void setPapel(String Papel) {
        
        this.Papel = Papel;
    }

    public void imprimirPapel(){
        System.out.println(getPapel());
    }
   public void RemoverPapel( String Papel){
        if(Papel == getPapel()){
           setPapel(null);
        }
    }
   public void Excluir(){
       setPapel(null);
    }

  private static Fila instancia;

  private Fila(){

}
     public static Fila getInstance(){
       if(instancia==null){
          instancia = new Fila();
        }
      return instancia;
};
    
}
