package com.ba.designpattern.observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
    //Observable interface’i ise duyuru sisteminde ki kullanıcıların temsili olarak düşünebilirsiniz.
}
