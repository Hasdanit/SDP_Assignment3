package src.Assignment5;

class Thermostat{
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Thermostat setting temperature to: " + temperature + "°C");
    }
}
