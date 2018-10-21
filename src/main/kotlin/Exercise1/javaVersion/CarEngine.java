package Exercise1.javaVersion;

public class CarEngine {
    private final Float speed;
    private final String modelName;
    private final String someOtherVariable;

    public CarEngine(Float speed, String modelName, String someOtherVariable) {
        this.speed = speed;
        this.modelName = modelName;
        this.someOtherVariable = someOtherVariable;
    }


    public String getModelName() {
        return modelName;
    }

    public Float getSpeed() {
        return speed;
    }

    public String getSomeOtherVariable() {
        return someOtherVariable;
    }

    @Override
    public String toString() {
        return "CarEngine(" +
                "speed=" + speed +
                ", modelName=" + modelName +
                ", someOtherVariable=" + someOtherVariable +
                ')';
    }
}
