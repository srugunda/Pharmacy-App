package com.solo.erispharmacyapp;

import com.google.gson.annotations.SerializedName;

public class Statement {
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("last_payment_amount")
    private Integer last_payment_amount;
    @SerializedName("last_payment_date")
    private String last_payment_date;
    @SerializedName("amount_owed")
    private Integer amount_owed;
    @SerializedName("account_status")
    private String account_status;

    public Statement(Integer id, String name, Integer last_payment_amount, String last_payment_date, Integer amount_owed, String account_status) {
        this.id = id;
        this.name = name;
        this.last_payment_amount = last_payment_amount;
        this.last_payment_date = last_payment_date;
        this.amount_owed = amount_owed;
        this.account_status = account_status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLast_payment_amount() {
        return last_payment_amount;
    }

    public void setLast_payment_amount(Integer last_payment_amount) {
        this.last_payment_amount = last_payment_amount;
    }

    public String getLast_payment_date() {
        return last_payment_date;
    }

    public void setLast_payment_date(String last_payment_date) {
        this.last_payment_date = last_payment_date;
    }

    public Integer getAmount_owed() {
        return amount_owed;
    }

    public void setAmount_owed(Integer amount_owed) {
        this.amount_owed = amount_owed;
    }

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }
}
