import java.util.Scanner;

public class Hero{

    private String  name,mp , pro, weapon, hp;
    public void show(){}
     boolean hero2 =true; 
    private String inside ;
    public static int hero1(){ return herototal; }
    private static int herototal=0;
public Hero(String name1, String hp1){
   name =name1;
   hp =hp1;
}

public Hero(String name1, String mp1, String pro1, String weapon1, String hp1){
   name =name1;
   mp=mp1;
   pro=pro1;
   weapon=weapon1;
   hp=hp1;
Scanner scn =new Scanner(System.in);
System.out.println("hero system");
   this.inside =scn.nextLine();
   System.out.println("hero creating...");
   switch(scn.nextInt()){
       case 1:
       Hero.herototal ++;
       this.hero2 =true;
       break;
   }
}
//     public void setname(String newname){
//         this.name= newname;
//     }
//     public String getname(){
// return this.name;
//     }
// public void setmp(String newmp){
//     this.mp=newmp;
// }
// public String getmp(){
//     return this.mp;
// }
// public void setpro(String newpro){
//     this.pro=newpro;
// }
// public String getpro(){
//     return this.pro;
// }
// public void setweapon(String newewapon){
//     this.weapon=newweapon;
// }
// public String getweapon(){
//     return this.weapon;
// }
// public void gethp(String newhp){
//     this.hp=newhp;
// }
// public String gethp(){
//     return this.hp;
}
