public class Vehicle {
    int passenger;
    int fuelcap;
    int fuelUse;

    public int getFuelUse() {
        return fuelUse;
    }

    public void setFuelUse(int fuelUse) {
        this.fuelUse = fuelUse;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public Vehicle(int passenger, int fuelcap, int fuelUse) {
        this.passenger = passenger;
        this.fuelcap = fuelcap;
        this.fuelUse = fuelUse;
    }
    public String range1(){
       return "Zasięg (km): "+ (getFuelcap()/getFuelUse())*100+"km";
    }
    public String range2(){
        return "przewozi: "+getPassenger()+"osób\n"+"Zasięg (km): "+ (getFuelcap()/getFuelUse())*100+"km";
    }
}
