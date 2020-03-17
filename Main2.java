import java.util.ArrayList;
import java.util.Scanner;

public class Main2{
 
 public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
      ArrayList <Hero> herosList= new ArrayList<Hero>();
      // String str=" ";
      boolean flag =true;
while(flag){
System.out.println("1.creat--2.delete--3.serch--4.close");
int cho =scn.nextInt();
switch (cho) {
case 1:
  
System.out.println("name,mp ,pro,weapon,hp");
herosList.add(new Hero(scn.next(),scn.next(),scn.next(),scn.next(),scn.next()));
System.out.println("you have"+herosList.size()+"do it");
break;
case 2:
System.out.print("name: ");
int x = herosList.indexOf(new String(scn.next()));
if(x >-1){
  herosList.remove(x);
  System.out.println("delete"+herosList.size()+"finish");
}else{
  System.out.println("no name is here");
}
break;
case 3:
if(herosList.size()>0){
  for(Hero i : herosList){
    i.show();
  }
}else{
  System.out.println("no player is here");
}
System.out.println("Total "+ Hero.hero1()+" hero" );
break;
case 4:
flag =false;
System.out.println("Hero System is done!!");
break;
default:
System.out.println("No chance");
}
}
// while(true){
//   System.out.println("pressin");
//   str =scn.nextLine();
// if(str.equals("N")){
// break;
// }
// herosmp.add(new Hero(scn.nextLine()));
// }
// for(int i=0;i<herosmp.size();i++){
//     System.out.println(i+"name"+herosmp.get(i).getname());
// }

}
}
 