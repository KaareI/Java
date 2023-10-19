package Week5;

import java.util.Calendar;

public class yl93 {

    public class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString() {
            return day + "." + month + "." + year;
        }
    }

    public class Person {
        private String name;
        private MyDate birthday;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.birthday = new MyDate(day, month, year);
        }

        public int age() {
            // Calculate the age based on the birthday and the current date
            Calendar today = Calendar.getInstance();
            int currentYear = today.get(Calendar.YEAR);
            int currentMonth = today.get(Calendar.MONTH) + 1; // January is 0, so add 1
            int currentDay = today.get(Calendar.DATE);

            int age = currentYear - birthday.year;

            // Adjust age if birthday hasn't occurred this year yet
            if (currentMonth < birthday.month || (currentMonth == birthday.month && currentDay < birthday.day)) {
                age--;
            }

            return age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return this.name + ", born " + this.birthday;
        }
    }

    public static void main(String[] args) {
        yl93 outerInstance = new yl93();
        yl93.Person pekka = outerInstance.new Person("Pekka", 15, 2, 1993);
        yl93.Person steve = outerInstance.new Person("Thomas", 1, 3, 1955);
        yl93.Person kaarel = outerInstance.new Person("Kaarel", 1, 9, 2002);

        System.out.println(steve.getName() + " age " + steve.age() + " years");
        System.out.println(kaarel.getName() + " age " + kaarel.age() + " years");
        System.out.println(pekka.getName() + " age " + pekka.age() + " years");
    }
}
