package homework3.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void receiveCall(String name, String phone) {
        System.out.println("Звонит " + name + " по номеру " + phone);
    }

    public void sendMessage(String... phones) {
        for (String phone : phones) {
            System.out.println(phone);
        }
    }
}
