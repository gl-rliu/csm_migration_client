package com.confluent.dto;

public class Event {
    private String accountNumber;
    private String paymentId;
    private long eventTime;

    // Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public long getEventTime() {
        return eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public String toString() {
        return "Event{" +
                "accountNumber='" + accountNumber + '\'' +
                ", paymentId='" + paymentId + '\'' +
                ", eventTime=" + eventTime +
                '}';
    }
}