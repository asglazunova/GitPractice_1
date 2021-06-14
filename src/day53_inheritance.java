public class day53_inheritance {

    public class ElectricCar{
        private String make;
        private String model;
        private double price;
        private int year;
        private int range;

        public int getRange() {
            return range;
        }

        public void setRange(int range) {
            this.range = range;
        }

        protected void drive(int miles){

        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}
