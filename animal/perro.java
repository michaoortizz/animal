
package animal;


public class perro extends animales{
    private String hocico;
    private String tipoPelaje;
    private String TipoDientes;

    public String getHocico() {
        return hocico;
    }

    public void setHocico(String hocico) {
        this.hocico = hocico;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public String getTipoDientes() {
        return TipoDientes;
    }

    public void setTipoDientes(String TipoDientes) {
        this.TipoDientes = TipoDientes;
    }
    

  
    
    
        public void hacerSonidoPe(){
            System.out.println("El perro ladra");
}
        
       
        
        public void TipoDientes(){
            if(TipoDientes == "Largos"){
            System.out.println("Deebes cortar los dientes al perro");
        }
        }
    public int CalcularEdad(int edad){
        return edad* 7;
    }
}


