package day55_abstraction_interface.exercise;

public class Swimming extends exercise{
    @Override
    public void perform() {
        System.out.println("Performing swimming in ocean or pool");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes *11;
    }
}
