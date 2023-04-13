public class Person {
    public String Name;
    public String Surname;

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }

    public Person(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public static void changePerson (Person person){
        person.Name = "Iliy";
        person.Surname = "Lagutenko";
       // person = new Person("Iliy", "Lagutenko");
    }
}
