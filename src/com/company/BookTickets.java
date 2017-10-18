package com.company;

import java.util.*;

public class BookTickets implements CinemaBooking {

    String[] typeOfTicket = {"Standard", "OAP", "Student", "Child"};
    ArrayList<String> customerTickets = new ArrayList<String>();

    public void bookTicket() {

        // Get user to enter the tickets they want.

        Scanner ticketType = new Scanner(System.in);
        System.out.println("Ticket Type");
        String ticket = ticketType.nextLine().toLowerCase();


        // Check if user has selected any tickets

        if (ticket.contains("done")) {
            if (customerTickets.isEmpty()) {
                System.out.println("No tickets selected. Please select tickets to purchase.");
                bookTicket();
            } else {
                //Calculate tickets and check if discount applies

                CalculateTickets calculateTicket = new CalculateTickets();

                CheckDiscount discount = new CheckDiscount();
                discount.setDiscount();

                // check if discount applies
                if (discount.getDiscount()) {
                    System.out.println("Discount applied");

                    calculateTicket.setTotalPrice(customerTickets);
                    System.out.println("The total price for the tickets booked is £" + calculateTicket.getTotalPrice());

                } else {
                    System.out.println("discount not applied");

                    calculateTicket.setTotalPrice(customerTickets);
                    System.out.println("The total price for the tickets booked is £" + calculateTicket.getTotalPrice());
                }
            }

            // check if the user has entered the right ticket type
        } else if (ticket.contains("standard") || ticket.contains("oap") || ticket.contains("student") || ticket.contains("child")) {
            customerTickets.add(ticket);
            System.out.println("Tickets selected: " + customerTickets);
            bookTicket();

        } else {
            System.out.println("Enter a vaild Ticket Type");
            bookTicket();
        }
    }
}
