package src.Assignment5;

class SmartHomeApp {
    static Light light = new Light();
    static Thermostat thermostat = new Thermostat();
    static SecuritySystem securitySystem = new SecuritySystem();
    static EntertainmentSystem entertainmentSystem = new EntertainmentSystem();
        public static void main(String[] args) {
            SmartHomeFacade smartHomeFacade = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

            smartHomeFacade.leaveHome();

            smartHomeFacade.arriveHome();

        }
}

