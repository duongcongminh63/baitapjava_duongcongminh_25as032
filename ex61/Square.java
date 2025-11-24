package ex61;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

   public Square (double side , String color , boolean filled){
        this.color=color;
        this.filled=filled;
   }

    public double getSide() {
        return width;  // width = length
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

