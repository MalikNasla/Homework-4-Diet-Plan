import java.util.Random;

public class noRestriction implements meal{
    public carbs createCarbs() {
        int rand  = new Random().nextInt(4);
        if (rand == 0)
        {
            return new cheese();
        }
        else if (rand == 1)
        {
            return new bread();
        }
        else if (rand == 2)
        {
            return new lentils();
        }
        else {
            return new pistachio();
        }
    }

    @Override
    public protein createProtein() {
        int rand  = new Random().nextInt(4);
        if (rand == 0)
        {
            return new chicken();
        }
        else if (rand == 1)
        {
            return new beef();
        }
        else if (rand == 2)
        {
            return new fish();
        }
        else {
            return new tofu();
        }
    }

    @Override
    public fats createFats() {
        int rand  = new Random().nextInt(4);
        if (rand == 0)
        {
            return new avocado();
        }
        else if (rand == 1)
        {
            return new sourCream();
        }
        else if (rand == 2)
        {
            return new tuna();
        }
        else {
            return new peanuts();
        }
    }
}
