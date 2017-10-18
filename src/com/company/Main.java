package com.company;

public class Main {

    public static void main(String[] args) {

        initialiseApp();
        CinemaBooking book = new BookTickets();
        book.bookTicket();

    }

    static void initialiseApp(){


        System.out.println("Welcome to QA Cinema, Please select tickets you would like to purchase");
        System.out.println("Enter: 'Standard', 'OAP','Student' or 'Child' to select ticket type: \n");

        System.out.println("Standard - £8");
        System.out.println("OAP - £6");
        System.out.println("Student - £6");
        System.out.println("Child - £4 \n" );

        System.out.println("Type 'done' to complete your ticket purchase");

    }
}
