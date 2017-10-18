package com.company;

import java.util.Calendar;

public class CheckDiscount {

    private boolean discount;

    public void setDiscount() {

        Calendar cal = Calendar.getInstance();

        // check if the discont applies. change the day to test the discount functionality
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {

            discount = true;
        } else {
            discount = false;
        }
        this.discount = discount;
    }

    public boolean getDiscount() {

        return discount;
    }



}
