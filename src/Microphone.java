public class Microphone {

    private int microMaxVol;
    private int microCrtVol;

    public Microphone(int microMaxVol){
        this.microMaxVol = microMaxVol;
        this.microCrtVol = 25 / 100 * this.microMaxVol;
    }
    public Microphone (int microMaxVol, int microCrtVol){
        this.microMaxVol = microMaxVol;
        this.microCrtVol = microCrtVol;
    }

    public boolean increaseMicroVolume(){
        if (this.microCrtVol < this.microMaxVol){
            this.microCrtVol += 1;
            return true;
        }
        return false;
    }

    public boolean decreaseMicroVolume(){
        if (this.microCrtVol > 0 ){
            this.microCrtVol -= 1;
            return true;
        }
        return false;
    }

    public void setMicroToSilenceMode(){
        this.microCrtVol = 0;
        System.out.println("Volumul microfonului a fost setat pe 'Mute'.");
    }
}
