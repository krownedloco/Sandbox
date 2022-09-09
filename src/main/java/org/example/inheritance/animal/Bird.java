package org.example.inheritance.animal;

public class Bird extends Animal{



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bird {");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
