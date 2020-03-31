// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // import java.lang.*;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // abstract class Shape1 {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    private double s;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public abstract double getArea();
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // class Circle extends Shape1 {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    private double r;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public Circle(double rad) {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       r = rad;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public double getArea() {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       return ((double) Math.pow(r, 2)) * Math.PI;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // class Square extends Shape1 {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    private double l, w;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public Square(double len, double wid) {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       l = len;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       w = wid;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public double getArea() {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       return l*w;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // class RegHexagon extends Shape1 {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    private double s;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public RegHexagon(double s) {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       this.s = s;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public double getArea() {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       return Math.pow(s, 2)*Math.pow(3, 0.5)*3/2;
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // 
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // class shape {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    public static void main(String[] args) {
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       Shape1 c = new Circle(3.2);
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       Shape1 s = new Square(6.9, 42.0);
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       Shape1 o = new RegHexagon(6.9);
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       System.out.println(c.getArea());
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       System.out.println(s.getArea());
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       System.out.println(o.getArea());
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //       System.out.println(Math.sin(30*Math.PI/180));
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //    }
// // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // }