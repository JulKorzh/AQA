public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Корж Юлия Юрьевна", "Студент", "julkorzh1@gmail.com",
                "80292926950", 2000, 28);
        persArray[1] = new Person("Иванов Иван Иванович", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[2] = new Person("Драб Павел Дмитриевич", "Водитель", "paveldrab@gmail.com",
                "80298652365", 15000, 35);
        persArray[3] = new Person("Волкова Юлия Игоревна", "Engineer",
                "volova@mailbox.com", "80298954885", 35000, 32);
        persArray[4] = new Person("Козлова Екатерина Павлова", "Admin",
                "kozlovaka@mailbox.com", "80333695874", 10000, 19);
        for (Person person : persArray) {
            person.info();
        }
    }
}