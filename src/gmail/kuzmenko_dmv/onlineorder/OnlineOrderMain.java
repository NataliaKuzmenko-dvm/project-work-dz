package gmail.kuzmenko_dmv.onlineorder;

public class OnlineOrderMain {
    public static void main(String[] args) {
        // Створення масивів для зберігання даних
        String[] clients = {"Alice", "Tom"};
        String[] products = {"smartphone", "laptop"};
        double[] firstPrice = {305.99, 570.95};
        String[] addresses = {"Moon Street, 10", "Tera Street, 17"};

        // Виведення замовлень
        for (int orderNumber = 0; orderNumber < clients.length; orderNumber++) {
            System.out.println("Order No " + (orderNumber + 1) + " + Client: " + clients[orderNumber] + ".");
            System.out.println("Product: " + products[orderNumber] + ",");
            System.out.println("firstPrice EUR: " + firstPrice[orderNumber] + ".");
            System.out.println("Address: " + addresses[orderNumber] + ".");
            System.out.println(); // порожній рядок для розділення
        }
    }
}

