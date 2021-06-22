package day55_abstraction_interface.flag;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkrainianFlag ukrainianFlag = new UkrainianFlag();
        ukrainianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();
    }
}
