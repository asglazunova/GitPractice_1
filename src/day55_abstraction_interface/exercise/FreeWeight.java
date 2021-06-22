package day55_abstraction_interface.exercise;

public class FreeWeight extends Lifting{

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }

    @Override
    public void perform() {
        System.out.println("lifting free weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes *6;
    }
}
