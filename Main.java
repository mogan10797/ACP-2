import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    ArrayList<Shape> Shapes=new ArrayList<Shape>();
    int r=scn.nextInt();
    System.out.println(area(r));
    float w=scn.nextFloat();
    float h=scn.nextFloat();
    System.out.println(area(w,h));
    float f1=scn.nextFloat();
    float f2=scn.nextFloat();
    System.out.println(area(f1,f2));
    boolean flag=true;
    while(flag){
        System.out.println("1.round--2.rect--3.tri--4.quit");
        int cho =scn.nextInt();
        switch(cho){
            case 1:
              System.out.println("round");
            //    Shapes.add(new Shape(scn.nextInt()));
              System.out.println(Math.PI*r*r);
              System.out.println("shape"+Shapes.size()+"object");
              break;
              case 2:
              
              System.out.println("rect");

              System.out.println(w*h); 
              System.out.println("shape"+Shapes.size()+"object");             
              break;
              case 3:
              System.out.println("tri");
             
              System.out.println(f1*f2/2.0f);
              System.out.println("shape"+Shapes.size()+"object");
              break;
              case 4:
             flag=false;
             System.out.println("finish");
             default:
        }
    }
}

public static double area(double r){
   
return Math.PI*r*r;
}
public static float area(float w, float h){
    return w*h;
}
public static float area(float f1,float f2){
return f1*f2/2.0f;
}

}