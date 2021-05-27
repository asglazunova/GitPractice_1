package SaimsTasks;

public class AnimalSpecies {
    private String name;
    private int population;
    private int growthRate;

    public void setInfo(String setName , int setPopulation , int setGrowthRate) {
        name = setName;
        population = setPopulation;
        growthRate = setGrowthRate;
    }
public String getName() {
        if(name == null){
            return "No name defined";
        }
    return name;
}
public int getPopulation() {
    return population;
}
public int getGrowthRate(){
        return growthRate;
}
    @Override
    public String toString() {
        return "AnimalSpecies" +
                " name ='" + name + '\'' +
                ", population =" + population +
                ", growthRate =" + growthRate ;
    }

    public static void main(String[] args) {
        AnimalSpecies as1 = new AnimalSpecies();
        as1.setInfo("Tiger" , 20, 15);
        System.out.println(as1);
        System.out.println("Name: " + as1.getName());
        System.out.println("Population: " + as1.getPopulation());
        System.out.println("Growth Rate: " + as1.getGrowthRate());

        AnimalSpecies cats = new AnimalSpecies();
        cats.setInfo("cats", 100,15);
        System.out.println(cats);

        AnimalSpecies birds = cats;
        cats.setInfo("birds",200,20);
        System.out.println(birds);


    }
    }

