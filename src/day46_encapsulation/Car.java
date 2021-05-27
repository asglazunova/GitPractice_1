package day46_encapsulation;

public class Car {
    // encapsulated / hidden instance variables
    private String model;
    private int year ;
    private int mileage ;

//setter method for model
    public void setModel(String newModel) {
        model = newModel;

    }
    // getter method for model
    public String getModel() {
        return model;
    }

    //setter for year
    public void setYear (int year) {
        this.year = year; // this. picked for instance variable , it's mean this class
    }
    //getter for year
    public int getYear() {
        return year;

    }
    // setter for mileage
    public void setMileage(int mileage) {
        this.mileage = mileage;


    }

    public int getMileage() {
        return mileage;
    }
        @Override
        public String toString() {
            return "Car " +
                    "model = '" + model + '\'' +
                    ", year=" + year +
                    ", mileage=" + mileage ;
// toString() is a specific method that exists in each and  every object
// it is normally used to Describe the object with assigned data
//it converts each instance variable values into a String and returns as 1
//string value


    }
}
