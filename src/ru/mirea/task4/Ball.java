package ru.mirea.task4;

class Ball{
    private double x,y;
    public Ball(){}

    public Ball(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void move(double xDisp, double yDisp){
        this.x+=xDisp;
        this.y=yDisp;
    }

    public String toString(){
        return "Ball (" + this.x + ", " + this.y + ")";
    }
}

class BallTester{
    static public void main(){
        Ball b1 = new Ball();
        b1.setX(1.0);
        b1.setY(1.0);
        System.out.println(b1.toString());

        b1.move(2.0, -1.5);
        System.out.println(b1.toString());

        b1.setXY(0, 0);
        System.out.println(b1.toString());
    }
}
