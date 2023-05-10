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
        if (this.nCoffeeOunces < size || this.nSugarPackets <nSugarPackets|| this.nCreams <nCreams){
            restock(10,20,30,40);
        }
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= size;
        this.nCreams -= size;
        this.nCups -= size;

    }

    
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;

    }

    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("CC Cafe", "Elm Street", 4);
        myCafe.sellCoffee(5, 6, 3);


        
    }
    
}
