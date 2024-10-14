package src.Assignment5;

class EntertainmentSystem{
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Entertainment system turned ON.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Entertainment system turned OFF.");
    }
}
