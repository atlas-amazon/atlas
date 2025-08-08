public class Car {

    private String engine;
    private int wheels;

    private boolean airConditioning;
    private boolean sunroof;
    private String color;


    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airConditioning = builder.airConditioning;
        this.sunroof = builder.sunroof;
        this.color = builder.color;
    }

    public static class CarBuilder {
        // Required parameters
        private String engine;
        private int wheels;

        private boolean airConditioning = false;
        private boolean sunroof = false;
        private String color = "White";

        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

       
        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        public CarBuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Build method to return the final Car object
        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + 
               ", airConditioning=" + airConditioning + 
               ", sunroof=" + sunroof + ", color=" + color + "]";
    }
}