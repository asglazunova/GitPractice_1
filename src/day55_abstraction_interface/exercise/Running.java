package day55_abstraction_interface.exercise;

public class Running extends exercise{

    @Override
    public void perform() {
        System.out.println("Performing Running ");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes *13;
    }
}
