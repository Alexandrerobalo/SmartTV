public class SmartTv {
    boolean ligada=false;
    int canal=7;
    int volume=24;

     public void aumentarVolume(){
         //volume = volume +1;
         volume++;
     }

    public void diminuirVolume() {
        //volume = volume -1;
        volume--;
    }



    public void ligar() {
            ligada = true;
        }
            public void desligar(){
                ligada=false;


            }
        }