package web.model;

public class Car {
    private int id;
    private String name;
    private int year;

    public Car(){}

    public Car(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    void add(Car car){
    }

    public int getId() { return id;}

    public void setId(int id) {this.id = id;}

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public int getYear() { return year;}

    public void setYear(int year) { this.year = year;}

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
