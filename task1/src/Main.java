public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Имя");
        person.setAge(18);
        person.setGender("M");
        person.infoPerson();
        person.incrementAge();
        System.out.println(" ");
        person.infoPerson();
        person.incrementAge();
        System.out.println(" ");
        person.infoPerson();
    }
}
