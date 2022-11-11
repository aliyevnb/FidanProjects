package org.example;

public class Cat {

    String name = "default name";
    String color = "default color";
    int age = 2;

    public Cat() {
        name = "Default name";
        color = "Default color";
        age = 3;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

/*    @Override
    public String toString() {
        return "Name = {"+ name +
                "}; Color = {" + color +
                "}; age = {" +age + "}";
    }

 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
