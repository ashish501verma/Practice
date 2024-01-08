public class Practieoops2 {
    public static void main(String[] args) {
       Rectange r=new Rectange(20,5);
       // Rectange r= new Rectange();
        System.out.println(r.Area());
        System.out.println(r.Para());

    }

}
class Rectange{
    double height;
    double width;

    public Rectange(double height,double width){
        this.height=height;
        this.width=width;

    }
    public double Area(){
        return height*width;
    }

    public double Para(){
        return height + width;
    }
}
