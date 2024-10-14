/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author User
 */
public class gato  extends animales{
    private String bigotes;
    private String garras;

    public String getBigotes() {
        return bigotes;
    }

    public void setBigotes(String bigotes) {
        this.bigotes = bigotes;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }
    
    public void hacerSonidoG(){
            System.out.println("El gato maulla");
}
    }
