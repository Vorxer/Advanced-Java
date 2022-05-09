package misc;

public class Airliner {

    private String model;

    private String operator;

    public Airliner(String model, String operator) {
        this.model = model;
        this.operator = operator;
    }

    public String getModel() {
        return model;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Airliner{" +
                "model='" + model + '\'' +
                ", operator='" + operator + '\'' +
                '}';
    }
}
