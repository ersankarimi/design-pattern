package singleton;

public class SingletonApp {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.save("0001");

        OrderDetailService orderDetailService = new OrderDetailService();
        orderDetailService.save("0001", "VGA");
        orderDetailService.save("0001", "CPU");
        orderDetailService.save("0001", "RAM");
    }
}
