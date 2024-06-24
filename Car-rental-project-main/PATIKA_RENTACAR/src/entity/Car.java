package entity;

import java.util.StringJoiner;

public class Car {
    private int id;
    private int model_id;
    private Car.Color color;
    private int km;
    private String plate;
    private Model model;

    public enum Color {
        RED,
        BLUE,
        WHITE,
        GREEN,
        AQUA
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("model_id=" + model_id)
                .add("color=" + color)
                .add("km=" + km)
                .add("plate='" + plate + "'")
                .add("model=" + model)
                .toString();
    }
}