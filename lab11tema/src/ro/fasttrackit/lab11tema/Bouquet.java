package ro.fasttrackit.lab11tema;

import java.util.ArrayList;

public class Bouquet {
    private final ArrayList<String> flowers;

    public Bouquet(ArrayList<String> flowers) {
        this.flowers = flowers;
    }

    public void getAll() {
        for (String f : flowers) {
            System.out.println(f + " ");
        }
    }

    public String add(String flower) {
        return String.valueOf(flowers.add(flower));
    }

    public String remove(String flower) {
        return String.valueOf(flowers.remove(flower));
    }

    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("trandafir");
        flowers.add("lalea");
        flowers.add("garoafa");
        flowers.add("floarea-soarelui");
        flowers.add("frezie");
        flowers.add("zambila");
        
        Bouquet buchet = new Bouquet(flowers);
        buchet.getAll();
        System.out.println();

        buchet.remove("trandafir");
        buchet.getAll();

    }
}
