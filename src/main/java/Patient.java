package practos2;

public class Patient
{
    private String name;
    private int age;
    private String symptoms;

    public Patient()
    {
    }

    public Patient(String name, int age, String symptoms)
    {
        this.name = name;
        this.age = age;
        this.symptoms = symptoms;
    }

    public Patient(String name, String symptoms)
    {
        this.name = name;
        this.symptoms = symptoms;
        this.age = 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSymptoms()
    {
        return symptoms;
    }

    public void setSymptoms(String symptoms)
    {
        this.symptoms = symptoms;
    }

    public void printPatientInfo()
    {
        System.out.printf(" Ваше имя: %s, Возраст: %d, Симптомы: %s \n", name, age, symptoms);
    }

    public void updatePatientAge(int newAge)
    {
        this.age = newAge;
    }

    public void updatePatientSymptoms(String newSymptoms)
    {
        this.symptoms = symptoms;
    }
}
