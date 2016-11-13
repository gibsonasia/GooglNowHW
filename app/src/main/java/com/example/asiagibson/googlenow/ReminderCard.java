package com.example.asiagibson.googlenow;

public class ReminderCard implements GoogleNowCard {
    private String cardTitle;


    public ReminderCard(String reminderCardTitle) {
        // constructor
        this.cardTitle = reminderCardTitle;

    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

}
