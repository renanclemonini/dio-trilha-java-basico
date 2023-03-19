/**
 * <h1>SmartTV</h1>
 * A Smarttv realiza metodos para alterar seus parametros iniciais
 * <p>
 * <strong>Nota: </strong> Foi realizado na aula sobre metodos e essa documentação foi feita durante a aula sobre Java Documentation.
 * 
 * @author Renan Clemonini
 * @version 1.0
 * @since 18/03/2022
 */

public class SmartTv {
    /**
     * Este método altera os atributos da televisão
     * @param ligada este atributo retorna se a tv esta ligada ou não
     * @param canal este atributo retorna em qual canal a tv esta
     * @param volume este atributo retorna qual volume que a tv esta
     */
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if (ligada == true) {
            volume++;
        } else {
            System.out.println("Impossível aumentar volume pois tv encontrasse desligada.");
        }
    }
    public void diminuirVolume(){
        if (ligada == true) {
            volume--;
        } else {
            System.out.println("Impossível aumentar volume pois tv encontrasse desligada.");
        }
    }

    public void aumentarCanal(){
        if (ligada == true) {
            canal++;
        } else {
            System.out.println("Não foi possível aumentar canal pois tv esta desligada.");
        }
    }
    public void diminuirCanal(){
        if (ligada == true) {
            canal--;
        } else {
            System.out.println("Não foi possível diminuir canal pois tv esta desligada.");
        }
    }
    public void mudarCanal(int novoCanal){
        if (ligada == true) {
            canal = novoCanal;
        } else {
            System.out.println("Não foi possível mudar de canal pois tv esta desligada.");
        }
    }
}
