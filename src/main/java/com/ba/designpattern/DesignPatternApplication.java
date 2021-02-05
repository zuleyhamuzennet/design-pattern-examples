package com.ba.designpattern;

import com.ba.designpattern.adapter.AudioPlayer;
import com.ba.designpattern.facade.ShapeMaker;
import com.ba.designpattern.factory.Asus;
import com.ba.designpattern.factory.ComputerFactory;
import com.ba.designpattern.factory.Mac;
import com.ba.designpattern.frontcontroller.FrontController;
import com.ba.designpattern.observer.NoticeObservable;
import com.ba.designpattern.observer.UserMan;
import com.ba.designpattern.observer.UserWoman;
import com.ba.designpattern.prototype.Shape;
import com.ba.designpattern.prototype.ShapeCache;
import com.ba.designpattern.template.HousingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);

        //Factory
        try {
            Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
            asus.since(1234);
            asus.name();
            Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
            mac.name();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Facade
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        //Observer
        UserMan userMan = new UserMan();
        UserWoman userWoman = new UserWoman();
        NoticeObservable noticeObservable = new NoticeObservable();
        userWoman.setObservable(noticeObservable);
        noticeObservable.addObserver(userMan);
        noticeObservable.addObserver(userWoman);
        noticeObservable.notifyObserver();
        userWoman.removeObserver();
        noticeObservable.notifyObserver();
        
        //template
        HousingClient housingClient = new HousingClient();
        housingClient.housingClientRun();

        // Front Controller
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Teacher");
        frontController.dispatchRequest("Student");

        // Adapter
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        // Prototype
        ShapeCache.loadCache();
        Shape circle = ShapeCache.getShape("1");
        System.out.println("Shape Type: "+ circle.getType());
        Shape rectangle = ShapeCache.getShape("2");
        System.out.println("Shape Type: "+rectangle.getType());
    }
    
    

}
