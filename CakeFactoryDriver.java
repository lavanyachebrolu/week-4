public class CakeFactoryDriver {
    public static void main(String[] args) {
        OrderCake[] orders = new OrderCake[6];
        for(int i = 0; i < 6; i+=2) {
            orders[i] = new OrderCake("Chocolate cake");
            orders[i+1] = new OrderCake("Vanilla cake");
        }
        OrderCollection orderRepository = new OrderCollection(orders);  
            
        Iterator orderItr = orderRepository.getIterator();

        int i = 1;
        System.out.println("Order List:");
        while(orderItr.hasNext()) {
            OrderCake currentOrder = (OrderCake) orderItr.next();
            Cake cake = currentOrder.getCake();
            System.out.println(i + ". " + cake.getName());
            i++;
        }
    }
}
