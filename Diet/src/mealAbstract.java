public abstract class mealAbstract {
    private static meal factoryInstance = null;
    public static meal getFactory(String dietPlan) {
            if (dietPlan.equals("paleo")){
                factoryInstance = new paleo();
            }
            else if (dietPlan.equals("vegan")){
                factoryInstance = new vegan();
            }
            else if (dietPlan.equals("nut allergy")){
                factoryInstance = new nutAllergy();
            }
            else {
                factoryInstance = new noRestriction();
            }
        return factoryInstance;
    }
}