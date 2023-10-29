public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Customer customer1 = new Customer("Покупатель 1");
        Customer customer2 = new Customer("Покупатель 2");

        store.addObserver(customer1);
        store.addObserver(customer2);

        store.newProductArrival("Смартфон");

        store.removeObserver(customer1);

        store.newProductArrival("Ноутбук");
    }
}

