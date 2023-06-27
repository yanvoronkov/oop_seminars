package lesson7.observer;

import java.util.List;

public interface Publisher {

//    /**
//     * Регистрация нового наблюдателя
//     * @param observer
//     */
//    void registerObserver(Observer observer);
//
//    /**
//     * Убрать наблюдателя из списка
//     * @param observer
//     */
//    void removeObserver(Observer observer);
//
//    /**
//     * Компания отправляет новую вакансию
//     * @param vacancy
//     */


    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Vacancy vacancy);

}
