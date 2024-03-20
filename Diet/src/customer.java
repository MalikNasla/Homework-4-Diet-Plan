public class customer {
    public String name;
    public String dietPlan;

    public customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    public String createMeal() {
        meal factory = mealAbstract.getFactory(dietPlan);
        carbs carbs = factory.createCarbs();
        protein protein = factory.createProtein();
        fats fats = factory.createFats();
        String finalMeal = "Name: " + name + "\nRestrictions: " + dietPlan +
                "\nMeal: " + carbs.getName() + ", " + protein.getName() + ", " + fats.getName();
        return finalMeal;
    }
}