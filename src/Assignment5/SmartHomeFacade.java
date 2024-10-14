package src.Assignment5;

class SmartHomeFacade{
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem){
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome(){
        light.turnOff();
        securitySystem.arm();
        entertainmentSystem.turnOff();
        thermostat.setTemperature(18); // Set to energy-saving mode.
        System.out.println("--- Leaving Home ---");
    }


    public void arriveHome(){
        light.turnOn();
        securitySystem.disarm();
        entertainmentSystem.turnOn();
        thermostat.setTemperature(22); // Set to comfortable mode.
        System.out.println("--- Arriving Home ---");
    }

}
