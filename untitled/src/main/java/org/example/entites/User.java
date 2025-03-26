package org.example.entites;

import java.util.List;

public class User {
    private String name;
    private String userId;
    private String userName;
    private String hashPassword;
    private String Password;
    private List<Ticket> ticketsBooked;

    public User(String name,String password,String hashPassword,List<Ticket> ticketsBooked,String userId){
        this.Password = password;
        this.hashPassword = hashPassword;
        this.userId = userId;
        this.name = name;
        this.ticketsBooked = ticketsBooked;
    }

    public String getName() {
        return name;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public String getPassword() {
        return Password;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
    public void printTickets(){
        for (int i = 0; i < ticketsBooked.size(); i++) {
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }
}
