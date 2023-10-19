package Week8;

import java.util.ArrayList;

public class yl11 {
    
// ToBeStored interface
public interface ToBeStored {
    double weight();
}

// Book class
static class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }
}

// CD class
static class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}

// Box class
static class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> contents;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public void add(ToBeStored item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.contents.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored item : this.contents) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.contents.size() + " things, total weight " + this.weight() + " kg";
    }
}

    public static void main(String[] args) {
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(10);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}



