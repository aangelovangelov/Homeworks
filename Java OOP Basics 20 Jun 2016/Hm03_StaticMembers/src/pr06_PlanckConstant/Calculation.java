package pr06_PlanckConstant;

public class Calculation {

    private static final Double PLANK_CONSTANT = 6.62606896e-34;
    private static final Double PI = 3.14159;

    public static Double reducedPlanckConstant() {
        return PLANK_CONSTANT / (PI * 2);
    }
}
