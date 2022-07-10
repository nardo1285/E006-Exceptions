package Entities;

public class Person {

  private String name;
  private Integer age;
  protected char sex;
  private double weight;
  private double height;


  public Person() {
  }

  public Person(String name, Integer age, Character sex, double weight, double height) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.height = height;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex=" + sex +
        ", weight=" + weight +
        ", height=" + height +
        '}';
  }

}
