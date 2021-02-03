package com.ba.designpattern.observer;

public class UserWoman implements Observer{
    private Observable observable;

    public UserWoman() {
    }

    public void setObservable(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void notify(String message) {
        System.out.println(message + " UserWoman Mesaj Geldi.");
    }

    public void removeObserver(){
        observable.removeObserver(this);
    }
    /*
    iki tane kullanıcı sınıfımız var ikisi de Observer interface’ini implement etmiş yani artık ikisi
    de birer gözlemci ve Duyuru yapıldığında notify() metoduna gelen parametre ile duyuru okunacaktır.
    */
}
