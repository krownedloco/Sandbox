package org.example.inheritance.animal;

public class Bird extends Animal{



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bird {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void mate() {

    }

    @Override
    public void call() {

    }
}
