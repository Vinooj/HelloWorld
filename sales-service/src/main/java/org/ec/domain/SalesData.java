package org.ec.domain;

/**
 * Created by nparasha on 6/13/2017.
 */
public class SalesData {

    int dailySales;
    int emailSubscriptions;
    int completedTasks;

    public int getDailySales() {
        return dailySales;
    }

    public void setDailySales(int dailySales) {
        this.dailySales = dailySales;
    }

    public int getEmailSubscriptions() {
        return emailSubscriptions;
    }

    public void setEmailSubscriptions(int emailSubscriptions) {
        this.emailSubscriptions = emailSubscriptions;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }
}
