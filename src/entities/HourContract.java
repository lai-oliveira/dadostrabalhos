package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date date, Double valuePerhour, Integer hours) {

        this.date = date;
        this.valuePerHour = valuePerhour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerhour() {
        return valuePerHour;
    }

    public void setValuePerhour(Double valuePerhour) {
        this.valuePerHour = valuePerhour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }


}

