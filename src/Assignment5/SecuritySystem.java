package src.Assignment5;

class SecuritySystem{
    private boolean isArmed;

    public void arm(){
        isArmed = true;
        System.out.println("Security system armed.");
    }

    public void disarm(){
        isArmed = false;
        System.out.println("Security system disarmed.");
    }
}