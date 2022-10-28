public class Circle extends Shape {

    public Circle(Float area){
        super(area);
    }

    public String draw(){
        return "Circle with area " + area + " and color hex code " + this.color.getHexCode();
    }
}
