package dao;

public enum BodyType {
    VAN("VAN"),

    SUV("SUV"),

    CAR("CAR"),

    TRUCK("TRUCK"),

    WAGON("WAGON");

    String type;

    BodyType(String type){this.type=type;}
}