package org.amunawar.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller
public class Circle implements Shape, ApplicationEventPublisherAware {
    private Point center;
    private ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Point getCenter() {
        return center;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        //System.out.println("Circle Point ("+center.getX()+","+center.getY()+")");
        System.out.println(messageSource.getMessage("drawing.point",new Object[] {center.getX(),center.getY()},"Default Point Message",null));
        System.out.println(messageSource.getMessage("greetings",null,"Default Greeting",null));
        DrawEvent drawEvent = new DrawEvent(this);
        applicationEventPublisher.publishEvent(drawEvent);

    }

    @PostConstruct
    public void initCircle(){
        System.out.println("Init of Circle");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy of Circle");
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
