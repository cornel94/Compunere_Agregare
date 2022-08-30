public class Smartphone {

    // Composition
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;

    // Agregation
    private Cover aCover;
    private ScreenProtector aScreenProtector;

    // initializare in mod direct
    /*public Smartphone (Screen theScreen, Case theCase, Speaker theSpeaker, Microphone theMicrophone){
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }*/

    // initializare in mod indirect
    /*public Smartphone (int pixelNo, Dimensions theDimensions, int speakerMaxVol, int speakerCrtVol,
                       int microMaxVol, int microCrtVol){
        this.theScreen = new Screen(pixelNo, theDimensions);
        this.theCase = new Case();
        this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
        this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
    }*/

    /*public Smartphone (Screen theScreen, Speaker theSpeaker, Microphone theMicrophone){
        this.theScreen = theScreen;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }*/

    public Smartphone (int pixelNo, String color, int width, int length, int depth, int speakerMaxVol, int microMaxVol){
        this.theScreen = new Screen(pixelNo, color, width, length, depth);
        this.theSpeaker = new Speaker(speakerMaxVol);
        this.theMicrophone = new Microphone(microMaxVol);
        this.theCase = new Case();

    }

    public Smartphone (int pixelNo, String color, int width, int length, int depth, int speakerMaxVol,
                       int microMaxVol, int speakerCrtVol, int microCrtVol){
        this.theScreen = new Screen(pixelNo, color, width, length, depth);
        this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
        this.theMicrophone = new Microphone(microMaxVol, microCrtVol);

    }

    public boolean setCover (Cover aCover){
        if (this.aCover != null){
            System.out.println("Err: A cover is already in place!");
            return false;
        }
        this.aCover = aCover;
        return true;
    }

    public Cover removeCover() {
        Cover referenceToCover = this.aCover;
        this.aCover = null;
        return referenceToCover;
    }

    public void pressPowerButton(){
        System.out.println("Class Smartphone delegate to Case ->");
        this.theCase.pressPowerButton();
    }

    public void pressVolumeUp(){
        System.out.println("Class Smartphone delegate to Case ->");
        this.theCase.pressVolumeUp();
        System.out.println("Class Smartphone delegate to Speaker ->");
        this.theSpeaker.increaseSpeakerVolume();
    }

    public void pressVolumeDown(){
        System.out.println("Class Smartphone delegate to Case ->");
        this.theCase.pressVolumeDown();
        System.out.println("Class Smartphone delegate to Speaker ->");
        this.theSpeaker.decreaseSpeakerVolume();
    }

    public void setPixel(int noPixel, String color){
        this.theScreen.setPixel(noPixel,color);
    }

    public void colorScreen(String color){
        this.theScreen.colorScreen(color);
    }

    public void increaseMicrophoneVolume(){
        this.theMicrophone.increaseMicroVolume();
    }

    public void decreaseMicrophoneVolume(){
        this.theMicrophone.decreaseMicroVolume();
    }

    public void muteMicrophone(){
        this.theMicrophone.setMicroToSilenceMode();
    }

    public void setSilence(){
        this.theSpeaker.setSpeakerToSilenceMode();
    }
}
