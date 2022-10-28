public abstract class Shape {
    protected Color color;
    Float area;

    public Shape(Float area){
        this.area = area;
    };

    public void setColor(Color color){
        this.color = color;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public abstract String draw();
}
