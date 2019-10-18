import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class AddressTest {
    @Test
    void AddPeople(){
        AddressBook address = new AddressBook();
        Person bob = new Person("BOB", "Zimmerman", 20);
        Person Ray = new Person("Ray", "Z", 30);
        address.setAddress(bob, "EPFL");
        address.setAddress(Ray, "UNIL");
        System.out.print(address.toString());
    }
    @Test
    void removePeople(){
        AddressBook address = new AddressBook();
        Person bob = new Person("BOB", "Zimmerman", 20);
        Person Ray = new Person("Ray", "Z", 30);
        address.setAddress(bob, "EPFL");
        address.setAddress(Ray, "UNIL");
        address.removePerson(bob);
        System.out.print(address.toString());
    }
    @Test
    void nullAddress(){
        AddressBook address = new AddressBook();
        Person bob = new Person("BOB", "Zimmerman", 20);
        Person Ray = new Person("Ray", "Z", 30);
        address.setAddress(bob, "EPFL");
        address.setAddress(Ray, null);
        System.out.print(address.toString());
    }
    @Test
    void updatePerson(){
        AddressBook address = new AddressBook();
        Person bob = new Person("BOB", "Zimmerman", 20);
        Person Ray = new Person("Ray", "Z", 30);
        address.setAddress(bob, "EPFL");
        address.setAddress(Ray, "OLD ADDRESS");
        address.setAddress(Ray, "NEW ADDRESS");
        System.out.print(address.toString());
    }
    @Test
    void PersonHashTest(){
        AddressBook address = new AddressBook();
        Person Jay = new Person("Jay", "THE FIRST", 9);
        Person Jay2 = new Person("Jay", "THE SECOND", 9);
        address.setAddress(Jay, "THE FIRST ADDRESS");
        address.setAddress(Jay2, "THE SECOND ADDRESS");
        System.out.print(address.toString());
        //Semantic error where Jay the first gets tJay the seconds address to due incorrect hashing algorithim
    }
}
