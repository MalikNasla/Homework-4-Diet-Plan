import java.util.Random;

public class paleo implements meal{
    public carbs createCarbs() {
        return new pistachio();
    }

    @Override
    public protein createProtein() {
        int rand  = new Random().nextInt(3);
        if (rand == 0)
        {
            return new chicken();
        }
        else if (rand == 1)
        {
            return new beef();
        }
        else {
            return new fish();
        }
    }

    @Override
    public fats createFats() {
        int rand  = new Random().nextInt(3);
        if (rand == 0)
        {
            return new avocado();
        }
        else if (rand == 1)
        {
            return new tuna();
        }
        else {
            return new sourCream();
        }
    }
}
