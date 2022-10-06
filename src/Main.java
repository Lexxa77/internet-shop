public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(10000);
        vasyaBasket.add("Молоко", 80, 1.5);
        vasyaBasket.add("Хлеб", 40, 0.4);

        Basket petyaBasket = new Basket(50000);
        petyaBasket.add("Лопата", 2800, 2.5);
        petyaBasket.add("Бочка", 2900, 10.0);

        Basket mashaBasket = new Basket("Стол", 5000, 22);


        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
        mashaBasket.print("Корзина Маши:");

    }
}