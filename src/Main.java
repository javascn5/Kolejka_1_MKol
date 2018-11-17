public class Main {

    public static void main(String[] args) {
        Person klient1 = new Person("Michal", "Stonoga", 36);
        Person klient2 = new Person("Anna", "Żuk", 15);
        Person klient3 = new Person("Kataklizm", "Tromba", 19);
        Person klient4 = new Person("Tikata", "Matata", 1);
        Person vipKlient = new Person("Anastazja", "Złotousta", 36);

        Shop shop = new Shop();
        shop.addClient(klient1);
        shop.addClient(klient2);
        shop.addClient(klient3);
        shop.addClient(klient4);
        shop.addVipClient(vipKlient);

        int queueQ = shop.getQueueNumber();

        for(int i = 0; i < queueQ; i++){
            System.out.println("Obslużono: " + shop.serveClient());
        }
    }
}