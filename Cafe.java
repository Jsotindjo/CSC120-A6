/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 110;
        this.nSugarPackets = 100;
        this.nCreams = 90;
        this.nCups = 200;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= size;
        this.nCreams -= size;
        this.nCups -= size;

    }
    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if( nCoffeeOunces == 0)
        this.nCoffeeOunces += size;
    }

    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
