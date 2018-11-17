import java.util.LinkedList;
import java.util.*;

public class Shop {
    private static final int QUEUE_SIZE = 10;
    private static final int OLD_AGE = 18;
    private Deque<Person> kolejka = new LinkedList<Person>();

    //gettery & settery
    public int getQueueNumber() {
        return kolejka.size();
    }

    //dodanie klienta
    public void addClient(Person person) {
        if (kolejka.size() < QUEUE_SIZE) {
            if (person.getAge() >= OLD_AGE) {
                kolejka.add(person);
            } else {
                System.out.println("Osoba niepełnoletnia! Zakaz wejścia dla " + person.getFirstName() + "!");
            }
        } else {
            System.out.println("W kolejce jest już 10 osób, więcej nie wejdzie.");
        }

    }

    //obsłuzenie klienta
    public Person serveClient() {
        return kolejka.poll();
    }

    //dodanie klienta VIP nna początek kolejki
    public void addVipClient(Person person) {
        kolejka.addFirst(person);
    }
}
