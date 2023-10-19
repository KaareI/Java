package Week7;
import java.util.ArrayList;

public class yl4 {

    public static class Thing {
        private String name;
        private int weight;
    
        // Constructor
        public Thing(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }
    
        public String getName() {
            return name;
        }
    
        public int getWeight() {
            return weight;
        }
    
        @Override
        public String toString() {
            return name + " (" + weight + " kg)";
        }
    }
    
    public static class Suitcase {
        private int maxWeight;
        private ArrayList<Thing> things;
    
        public Suitcase(int maxWeight) {
            this.maxWeight = maxWeight;
            this.things = new ArrayList<Thing>();
        }
    
        public void addThing(Thing thing) {
            int totalWeight = calculateTotalWeight();
            if (totalWeight + thing.getWeight() <= maxWeight) {
                things.add(thing);
            }
        }
    
        private int calculateTotalWeight() {
            int totalWeight = 0;
            for (Thing thing : things) {
                totalWeight += thing.getWeight();
            }
            return totalWeight;
        }
    
        public void printThings() {
            for (Thing thing : things) {
                System.out.println(thing);
            }
        }
    
        public int totalWeight() {
            return calculateTotalWeight();
        }
    
        public Thing heaviestThing() {
            if (things.isEmpty()) {
                return null;
            }
    
            Thing heaviest = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
    
            return heaviest;
        }
    
        @Override
        public String toString() {
            int numThings = things.size();
            String thingsText = (numThings == 0) ? "empty" : (numThings == 1) ? "1 thing" : numThings + " things";
            return thingsText + " (" + calculateTotalWeight() + " kg)";
        }
    }

    public static class Container {
        private int maxWeight;
        private ArrayList<Suitcase> suitcases;
    
        public Container(int maxWeight) {
            this.maxWeight = maxWeight;
            this.suitcases = new ArrayList<Suitcase>();
        }
    
        public void addSuitcase(Suitcase suitcase) {
            int totalWeight = calculateTotalWeight();
            if (totalWeight + suitcase.totalWeight() <= maxWeight) {
                suitcases.add(suitcase);
            }
        }
    
        public void printThings() {
            for (Suitcase suitcase : suitcases) {
                suitcase.printThings();
            }
        }
    
        private int calculateTotalWeight() {
            int totalWeight = 0;
            for (Suitcase suitcase : suitcases) {
                totalWeight += suitcase.totalWeight();
            }
            return totalWeight;
        }
    
        @Override
        public String toString() {
            int numSuitcases = suitcases.size();
            return numSuitcases + " suitcases (" + calculateTotalWeight() + " kg)";
        }
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int weight = 1; weight <= 100; weight++) {
            Thing brick = new Thing("Brick", weight);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
}

