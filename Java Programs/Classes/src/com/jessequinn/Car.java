package com.jessequinn;

public class Car {

    // state components
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            String validModel = model.toLowerCase();

            if (validModel.equals("carrera") || validModel.equals("commodore")) {
                this.model = model;
            } else {
                this.model = "Unknown";
            }
        } else {
            System.out.println("No model was provided!");
        }
    }

    public String getModel() {
        if (this.model != null && !this.model.isEmpty()) {
            return this.model;
        } else {
            return "";
        }
    }
}
