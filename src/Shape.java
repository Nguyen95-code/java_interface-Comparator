public class Shape {
    public String color="green";
    public boolean fill=true;
    public Shape(){

    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    public String toString(){
        if (this.fill){
            return "A Shape with color of"  + this.color +  "and filled";
        }else {
            return "A Shape with color of"  + this.color +  "and not filled";
        }
    }
}
