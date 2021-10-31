package org.example;

public class HomeWork05 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Вадим Геннадьевич", "Директор",
                "vadim@email.com", 2233445, 50000, 45);
        employees[1] = new Employee("Сергей Владимирович", "Заместитель директора",
                "zamdirektora@mail.com", 3336654, 35000, 42);
        employees[2] = new Employee("Дмитрий Дмитриевич", "Бухгалтер", "buhgalter@mail.com",
                6655484, 30000, 35);
        employees[3] = new Employee("Маргарита Петровна", "Кассир", "kassir@mai.com",
                22331564, 33000, 32);
        employees[4] = new Employee("Петр Петрович", "Охранник", "oxpaha@mail.com",
                5554684, 48000, 48);

     employees[4].printInfo();


        }

    }


