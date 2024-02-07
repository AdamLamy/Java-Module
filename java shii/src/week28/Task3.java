package week28;

public class Task3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String details(){
        return getName() + " " + getSurname() + " years " + getAge();
    }

}

