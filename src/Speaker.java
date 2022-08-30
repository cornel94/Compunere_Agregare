public class Speaker {

    private int speakerMaxVol;
    private int speakerCrtVol;

    public Speaker(int speakerMaxVol){
        this.speakerMaxVol = speakerMaxVol;
        this.speakerCrtVol = 25 / 100 * this.speakerMaxVol;
    }

    public Speaker (int speakerMaxVol, int speakerCrtVol){
        this.speakerMaxVol = speakerMaxVol;
        this.speakerCrtVol = speakerCrtVol;
    }

    public boolean increaseSpeakerVolume(){
        if (this.speakerCrtVol < this.speakerMaxVol){
            this.speakerCrtVol += 1;
            System.out.println("class Speaker: Volume UP button pressed.");
            return true;
        }
        return false;
    }

    public boolean decreaseSpeakerVolume(){
        if (this.speakerCrtVol > 0 ){
            this.speakerCrtVol -= 1;
            System.out.println("class Speaker: Volume DOWN button pressed.");
            return true;
        }
        return false;
    }

    public void setSpeakerToSilenceMode(){
        this.speakerCrtVol = 0;
        System.out.println("Volumul speakerului a fost setat pe 'Mute'.");
    }
}
