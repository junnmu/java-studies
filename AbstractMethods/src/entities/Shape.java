package entities;

import entities.enums.Color;

// Se uma classe tem um método abstrato, ela é abstrata (não pode ser instanciada como objeto)
public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método abstrato não tem implementação (por ser muito genérico)
    public abstract double area();
}
