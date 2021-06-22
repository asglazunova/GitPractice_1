package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("chop veggies , add dressing");
    }

    @Override
    public void serve() {
        System.out.println("put into bowl , and serve with fork");
    }
}
