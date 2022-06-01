package study.java.introduction.chaper02.class08;

import lombok.Builder;

import java.time.LocalDateTime;

public class Order {

    private String orderNumber;
    private String customerPhone;
    private String customerAddress;
    private LocalDateTime orderDate;
    private int price;
    private String menuId;

    @Builder
    public Order(String orderNumber, String customerPhone, String customerAddress, LocalDateTime orderDate, int price, String menuId) {
        this.orderNumber = orderNumber;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.orderDate = orderDate;
        this.price = price;
        this.menuId = menuId;
    }

    public void showOrderInfo() {
        System.out.println("주문접수번호 = " + orderNumber);
        System.out.println("주문핸드폰번호 = " + customerPhone);
        System.out.println("주문집주소 = " + customerAddress);
        System.out.println("주문날짜 = " + orderDate.getYear() + orderDate.getMonth() + orderDate.getDayOfMonth());
        System.out.println("주문시간 = " + orderDate.getHour() + orderDate.getMinute() + orderDate.getSecond());
        System.out.println("주문가격 = " + price);
        System.out.println("메뉴번호 = " + menuId);
    }
}
