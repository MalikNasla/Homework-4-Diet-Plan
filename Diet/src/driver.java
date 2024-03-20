import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<>();
        customers.add(new customer("Hamzeh", "no restriction"));
        customers.add(new customer("Samer", "paleo"));
        customers.add(new customer("Norden", "vegan"));
        customers.add(new customer("Haboos", "nut allergy"));
        customers.add(new customer("Malik", "vegan"));
        customers.add(new customer("Hamada", "paleo"));

        for (int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i).createMeal() + "\n");
        }
    }
}