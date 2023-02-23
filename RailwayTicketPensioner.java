package Model;

import android.annotation.SuppressLint;

@SuppressLint("NotConstructor")
public class RailwayTicketPensioner extends RailwayTicket {
    // задание полей
    private float ticketDiscount; // скидка на пенсионерский билет

    // создание пустого конструктора
    public RailwayTicketPensioner() {
    }
    // создание конструктора исходных данных пенсионерского билета (стоимость билета, количество билетов, скидка)
    public void RailwayTicketPensioner(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // переопределение метода подсчёта стоимости детских билетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}
