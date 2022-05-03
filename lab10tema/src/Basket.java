import java.util.*;

public class Basket {
    private ArrayList<String> fruits;

    public Basket() {
    }

    public Basket(ArrayList<String> fruits) {
        this.fruits = fruits;
    }

    public boolean find(String fruit) {
        for (String f : fruits) {
            return f.equals(fruit);
        }
        return false;
    }

    public boolean remove(String fruit) {
//        if (find(fruit)) {
//            fruits.remove(fruit);
//        }
        return fruits.remove(fruit);
    }

    public void afisare() {
        for (String f : fruits) {
            System.out.print(f + " ");
        }
    }

    public int position(String fruit) {
        for (String f : fruits) {
            return fruits.indexOf(fruit);
        }
        return 0;
    }

    public String addFruit(String fruit) {
        return String.valueOf(fruits.add(fruit));
    }

    public int customCount() {
        int count = 0;
        for (String f : fruits) {
            count++;
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(fruits, basket.fruits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("mar");
        lista.add("para");
        lista.add("portocala");
        Basket basket = new Basket(lista);

        System.out.println(basket.find("mar"));

        basket.afisare();
        System.out.println();
        System.out.println(basket.remove("mar"));
        basket.afisare();
        System.out.println();

        System.out.println(basket.position("para"));
        System.out.println(basket.addFruit("kiwi"));
        System.out.println(basket.customCount());
    }
}
