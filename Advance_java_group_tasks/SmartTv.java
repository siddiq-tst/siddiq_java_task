package Advance_java_group_tasks;

public class SmartTv implements iVolumeControl, iChannelControl, iSmartFeatures,iConnectivity,iMediaControl {
    //1st interface --> Advance_java_group_tasks.iVolumeControl
    @Override
    public void increaseVolume() {
        System.out.println("Increase volume we can maximize to 50");
    }

    @Override
    public void decreseVolume() {
        System.out.println("Decrease volume we can minimize to 0");
    }

    @Override
    public void averageVolume() {
        System.out.println("User can set the volume as per requirement");
    }


    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        //1st interface --> Advance_java_group_tasks.iVolumeControl
        smartTv.increaseVolume();
        smartTv.decreseVolume();
        smartTv.averageVolume();

        //2nd interface --> Advance_java_group_tasks.iChannelControl
        smartTv.nextChannel();
        smartTv.previousChannel();
        smartTv.currentChannel();

        //3nd interface --> iSmartFearures
        smartTv.browseInternet();
        smartTv.installApp();
        smartTv.uninstallApp();

        //4th interface --> Advance_java_group_tasks.iConnectivity
        smartTv.connectToWiFi();
        smartTv.pairBluetoothDevice();
        smartTv.enableScreenMirroring();

        //5th interface --> Advance_java_group_tasks.iMediaControl
        smartTv.playMedia();
        smartTv.stopMedia();
        smartTv.enableScreenMirroring();



    }

    //2nd interface --> Advance_java_group_tasks.iChannelControl

    @Override
    public void nextChannel() {
        System.out.println("By clicking on next button it will go to next channel");

    }

    @Override
    public void previousChannel() {
        System.out.println("By clicking on previous button it will go to previous channel");

    }

    @Override
    public void currentChannel() {
        System.out.println("User watching the current channel");

    }

    //3nd interface --> iSmartFearures
    @Override
    public void browseInternet() {
        System.out.println("User is able to browse the url through internet");

    }

    @Override
    public void installApp() {
        System.out.println("User is able to install the app");

    }

    @Override
    public void uninstallApp() {
        System.out.println("User is able to uninstall the app");

    }

    //4th interface --> Advance_java_group_tasks.iConnectivity

    @Override
    public void connectToWiFi() {
        System.out.println("User is able to connect smart tv through wifi");
    }

    @Override
    public void pairBluetoothDevice() {
        System.out.println("User is able to connect smart tv through bluetooth device");

    }

    @Override
    public void enableScreenMirroring() {
        System.out.println("User is able to connect smart tv through screen mirroring");

    }

    //5th interface --> Advance_java_group_tasks.iMediaControl
    @Override
    public void playMedia() {
        System.out.println("User is able to play the media");

    }

    @Override
    public void pauseMedia() {
        System.out.println("User is able to the pause the media");

    }

    @Override
    public void stopMedia() {
        System.out.println("User is able to stop the media ");

    }
}