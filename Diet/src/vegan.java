import java.util.Random;

public class vegan implements meal{
    @Override
    public carbs createCarbs() {
        int rand  = new Random().nextInt(3);
        if (rand == 0)
        {
            return new bread();
        }
        else if (rand == 1)
        {
            return new lentils();
        }
        else {
            return new pistachio();
        }
    }

    @Override
    public protein createProtein() {
        return new tofu();
    }

    @Override
    public fats createFats() {
        int rand  = new Random().nextInt(2);
        if (rand == 0)
        {
            return new avocado();
        }
        else {
            return new peanuts();
        }
    }
}
