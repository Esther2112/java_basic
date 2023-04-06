package day09.quiz;

public abstract class SmartPhone implements Camera, PhoneCall {

    private String model;

    public SmartPhone(String model) {
        this.model = model;
    }

    public abstract String information();

    public String getModel() {
        return model;
    }
    public abstract String charge();
    public void setModel(String model) {
        this.model = model;
    }
}
