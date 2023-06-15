package lesson5;

import lesson5.models.Reservation;
import lesson5.models.Table;
import lesson5.models.TableModel;
import lesson5.presenters.BookingPresenter;
import lesson5.presenters.Model;
import lesson5.presenters.View;
import lesson5.views.BookingView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * TODO: Домашняя работа: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {
        Model tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);
        bookingPresenter.showTables();

        // Клиент нажимает на кнопку "Зарезервировать", возбуждается событие,
        // вызывается метод reservationTable()
        bookingView.reservationTable(new Date(), 102, "Станислав");
        bookingView.reservationTable(new Date(), 103, "Станислав");
        bookingView.reservationTable(new Date(), 103, "Станислав");

        bookingView.changeReservationTable(9001, new Date(), 103, "Иван");
        bookingView.changeReservationTable(9005, new Date(), 103, "Петр");

        Collection <Reservation> reservations = new ArrayList<>();
        for (Reservation reservation: reservations) {
            System.out.println(reservation);
        }



    }

}
