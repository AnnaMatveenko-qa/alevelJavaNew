package ua.matveenko.hw6;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

     public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

   public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("0999999999", "Redmi Note 11", 178.5);
        System.out.print(phone.number + "  ");
        System.out.print(phone.model + "  ");
        System.out.print(phone.weight + "  ");
        System.out.println();
        Phone secondPhone = new Phone("0971111111", "iPhone 15 Pro");
        secondPhone.weight = 150;
        System.out.print(secondPhone.number + "  ");
        System.out.print(secondPhone.model+ " ");
        System.out.print(secondPhone.weight);
        System.out.println();
        Phone anotherPhone = new Phone();
        anotherPhone.number = "0501111199";
        anotherPhone.model = "Samsung Galaxy Flip 5";
        anotherPhone.weight =  187;
        System.out.print(anotherPhone.number + " ");
        System.out.print(anotherPhone.model + " ");
        System.out.print(anotherPhone.weight);
        System.out.println();
        phone.receiveCall("John");
        secondPhone.receiveCall("Marta");
        anotherPhone.receiveCall("Latifa");
        System.out.println(phone.getNumber());
        System.out.println(secondPhone.getNumber());
        System.out.println(anotherPhone.getNumber());
    }
}
