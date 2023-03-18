public class SmartTv {
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
