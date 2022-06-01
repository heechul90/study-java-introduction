package study.java.introduction.chaper02.class08;

import java.time.LocalDateTime;

public class OrderTest {

    public static void main(String[] args) {

        Order order = Order.builder()
                .orderNumber("202206011513")
                .customerPhone("01022221111")
                .customerAddress("서울")
                .orderDate(LocalDateTime.now())
                .price(30000)
                .menuId("0003")
                .build();

        order.showOrderInfo();
    }
}
