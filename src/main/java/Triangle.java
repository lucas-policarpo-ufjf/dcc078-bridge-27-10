public class Triangle extends Shape {

  public Triangle(Float area){
    super(area);
  }

  public String draw(){
     return "Triangle with area " + area + " and color hex code " + this.color.getHexCode();
  }
}
