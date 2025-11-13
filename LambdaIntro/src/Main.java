import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return firstName+" "+lastName;
        }
    }
    public static void main(String[] args) {
//        List<Person> people = new ArrayList<>(Arrays.asList(
//                new Main.Person("Lucy","Van Pelt"),
//                new Main.Person("Sally","Brown"),
//                new Main.Person("Linus","Van Pelt"),
//                new Main.Person("Peppermint","Patty"),
//                new Main.Person("Charlie","Brown")
//        ));

        List<Person> people = new ArrayList<>();
                people.add(new Person("Lucy","Van Pelt"));
                people.add(new Person("Sally","Brown"));
                people.add(new Person("Linus","Van Pelt"));
                people.add(new Person("Peppermint","Patty"));
                people.add(new Person("Charlie","Brown"));

        var comparatorLastName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.lastName().compareTo(o2.lastName());
            }

        };
        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);
        
        interface EnhancedComparator<T> extends Comparator<T>{
            int secondLevel(T o1, T o2);
        }

//        var coparatorMixed = new EnhancedComparator<Person>(){
//
//
//            @Override
//            public int compare(Person o1, Person o2) {
//                int result = o1.lastName().compareTo(o2.lastName());
//                return (result == 0 ?secondLevel(o1,o2) : result);
//            }
//
//            @Override
//            public int secondLevel(Person o1, Person o2) {
//                return o1.firstName().compareTo(o2.firstName());
//            }
//        };

        people.sort(new EnhancedComparator<Person>(){


            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName().compareTo(o2.lastName());
                return (result == 0 ?secondLevel(o1,o2) : result);
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        });

        System.out.println(people);

    }
}