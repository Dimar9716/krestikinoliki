package org.example;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private float salary;
    private int age;

    public Employee (String name, String position, String email, long phoneNumber, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo () {
        System.out.println("Имя сотрудника:" + name);
        System.out.println("Должность:" + position);
        System.out.println("Email:" + email);
        System.out.println("Номер телефона:" + phoneNumber);
        System.out.println("Зарплата:" + salary);
        System.out.println("Возраст сотрудника:" + age);
    }

}
