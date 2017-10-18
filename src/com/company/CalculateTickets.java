package com.company;

import java.util.ArrayList;

public class CalculateTickets {
    private int totalPrice;

    int standardPrice = 8;
    int oapPrice = 6;
    int studentPrice = 6;
    int childPrice = 4;


    public void setTotalPrice(ArrayList ticketType) {

        // tickets stored in array are looped to get total the price

        String type;
        for (int i = 0; i < ticketType.size(); i++) {
            type = ticketType.get(i).toString();

            if (type.contains("standard")) {
                totalPrice = totalPrice + standardPrice;
            }
            if (type.contains("oap")) {
                totalPrice = totalPrice + oapPrice;
            }
            if (type.contains("student")) {
                totalPrice = totalPrice + studentPrice;
            }
            if (type.contains("child")) {
                totalPrice = totalPrice + childPrice;
            }

        }
        this.totalPrice = totalPrice;
    }

    public int getTotalPrice() {
        System.out.println(totalPrice);

        return totalPrice;
    }
}

class CalculateDiscountPrice extends CalculateTickets {

    private int totalPrice;

    @Override
    public void setTotalPrice(ArrayList ticketType) {

        // if discount applies

        standardPrice = 6;
        oapPrice = 4;
        studentPrice = 4;
        childPrice = 2;

        String type;
        for (int i = 0; i < ticketType.size(); i++) {
            type = ticketType.get(i).toString();

            if (type.contains("standard")) {
                totalPrice = totalPrice + standardPrice;
            }
            if (type.contains("oap")) {
                totalPrice = totalPrice + oapPrice;
            }
            if (type.contains("student")) {
                totalPrice = totalPrice + studentPrice;
            }
            if (type.contains("child")) {
                totalPrice = totalPrice + childPrice;
            }

        }

        this.totalPrice = totalPrice;

    }

    @Override
    public int getTotalPrice() {
        return totalPrice;
    }
}