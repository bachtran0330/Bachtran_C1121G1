package Bai6_ThucHanh;

public class Square extends Rectangle implements Colorable {
    public double side = 1.0;
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double width, double height, String color, boolean filled){
        super(width, height, color, filled);
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double width){
        setSide(width);
    }
    public void setHeight(double height){
        setSide(height);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " . Whích is a subclass off " + super.toString() +
                '}';
    }
    @Override
    public void resize(double percent) {
        this.side = this.side + this.side*(percent/100);

    }

    @Override
    public void howToColor() {

    }
}
