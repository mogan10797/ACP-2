import java.util.Scanner;

public class Shape{

private int tri,rect,round;
public static int shape1(){return shapetotal;}
private static int shapetotal=0;
boolean flag =true;
public Shape(int round){
round=round1;
Scanner scn =new Scanner(System.in);
int b =scn.nextInt();
switch(b){
    case 1:
    Shape.shapetotal ++;
    this.flag=true;
    break;
}
}
public Shape(int tri1,int rect1,int round1){
    tri=tri1;
rect=rect1;
round=round1;
Scanner scn =new Scanner(System.in);

System.out.println("shape");
int a=scn.nextInt();
switch(a){
    case 1:
    Shape.shapetotal ++;
    this.flag=true;
    break;
}
}
}