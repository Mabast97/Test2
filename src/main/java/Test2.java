import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", Gender.FEMALE, 900),
                new Person("Mabast", Gender.MALE, 760),
                new Person("Ahmed", Gender.MALE, 755),
                new Person("Mohammed", Gender.MALE, 950),
                new Person("Maria", Gender.FEMALE, 890)
        );

        String names = people.stream().map(person -> person.name.startsWith("A") ).toString();

        System.out.println(names);


//        // Imperative Approach
//        List<Person> females = new ArrayList<Person>();
//
//        for (Person person : people)
//        {
//            if ((person.gender).equals(Gender.FEMALE))
//                females.add(person);
//        }
//        for (Person female : females)
//            System.out.println(female.name);
//
//        // Declarative Approach
//        List<Person> females2 = people.stream().filter(p -> (p.gender)
//                .equals(Gender.FEMALE)).collect(Collectors.toList());
//        System.out.println(females2);

    }

    static class Person {
        private final String name;
        private final Gender gender;
        private final int salary;

        Person(String name, Gender gender, int salary) {
            this.name = name;
            this.gender = gender;
            this.salary = salary;
        }
    }

    enum Gender{
        FEMALE, MALE
    }
}
