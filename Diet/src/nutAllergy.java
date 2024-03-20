import java.util.Random;

public class nutAllergy implements meal{
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
            return new cheese();
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
        int rand  = new Random().nextInt(3);
        if (rand == 0)
        {
            return new avocado();
        }
        else if (rand == 1)
        {
            return new sourCream();
        }
        else {
            return new tuna();
        }
    }
}
