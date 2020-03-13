package com.dhanifudin.cashflow;

import com.dhanifudin.cashflow.models.Account;
import com.dhanifudin.cashflow.models.Session;

public class Application extends android.app.Application {

    private static Account account;
    private static Session session;


    @Override
    public void onCreate() {
        account = new Account("Ika Wahyu F");
        super.onCreate();
        session = new Session(this);
    }

    public static Session getSession() {
        return session;
    }

    public static Account getAccount() {
        return account;
    }
}
