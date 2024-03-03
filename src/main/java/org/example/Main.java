package org.example;
import practos2.Patient;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Patient[] patients = new Patient[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < patients.length; i++)
        {
            System.out.println("Введите ваше имя: ");
            String name = scanner.nextLine();
            System.out.println("Введите ваш возраст: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите ваш симптом: ");
            String symptoms = scanner.nextLine();

            patients[i] = new Patient(name, age, symptoms);
        }

        for (Patient patient : patients)
        {
            patient.printPatientInfo();
        }
    }
}
