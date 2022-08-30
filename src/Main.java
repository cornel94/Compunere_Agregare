public class Main {

    public static void main(String[] args) {

/*        Screen aPhoneScreen = new Screen();
        Microphone aPhoneMicrophone = new Microphone();
        Speaker aPhoneSpeaker = new Speaker();
        Case aPhoneCase = new Case();

        Smartphone smartphone = new Smartphone(aPhoneScreen,aPhoneCase,aPhoneSpeaker,aPhoneMicrophone);

        System.out.println("Case 1: use the component directly:");
        smartphone.getTheCase().pressPowerButton();
        smartphone.getTheCase().pressVolumeDown();
        smartphone.getTheCase().pressVolumeUp();
        System.out.println();

        System.out.println("Case 2: use the 'wrapper' methods:");
        smartphone.pressPowerButton();
        smartphone.pressVolumeDown();
        smartphone.pressVolumeUp();*/

        Smartphone iPhone = new Smartphone(2000, "green", 5,12,2,100,100);
        Cover aCover = new Cover();
        iPhone.pressPowerButton();
        iPhone.pressVolumeUp();
        iPhone.pressVolumeDown();
        iPhone.increaseMicrophoneVolume();
        iPhone.decreaseMicrophoneVolume();
        iPhone.muteMicrophone();
        iPhone.setSilence();
        iPhone.colorScreen("blue");
        iPhone.setCover(aCover);
    }
}
