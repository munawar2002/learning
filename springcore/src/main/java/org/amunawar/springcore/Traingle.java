package org.amunawar.springcore;

public class Traingle implements Shape {  //implements InitializingBean, DisposableBean {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Drawing Traingle");
        System.out.println("Point A ("+pointA.getX()+","+pointA.getY()+")");
        System.out.println("Point B ("+pointB.getX()+","+pointB.getY()+")");
        System.out.println("Point C ("+pointC.getX()+","+pointC.getY()+")");
    }

    public void myInit(){
        System.out.println("This method will be called when whole Bean is Initialized");
    }

    public void cleanup(){
        System.out.println("This method will be called when whole bean is Destroyed.");
    }

//    public void afterPropertiesSet() throws Exception {
//        System.out.println("This method will be called after everything is Initialized. Whole Bean is Initialized");
//    }


//    public void destroy() throws Exception {
//        System.out.println("This method will be called when whole bean is Destroyed.");
//    }
}

