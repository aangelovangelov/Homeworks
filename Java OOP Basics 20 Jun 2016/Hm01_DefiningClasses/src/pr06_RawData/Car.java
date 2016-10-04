package pr06_RawData;

import java.util.List;

public class Car extends Cargo{
     private String model;
     private List<Tire> tires;

     public Car(String model, double engineSpeed, double enginePower, double cargoWeight, String cargoType, List<Tire> tires) {
          super(engineSpeed, enginePower, cargoWeight, cargoType);
          this.model = model;
          this.tires = tires;
     }

     public List<Tire> getTires() {
          return tires;
     }

     public String getModel() {
          return model;
     }
}
