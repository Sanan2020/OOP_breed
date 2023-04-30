import java.util.Random;
class Kuntong3 {

public void breed_ran( String husband, String wife,String sex1,String sex2) {
  System.out.println(sex1+" 505 "+sex2);
   if((sex1.equals("ผู้")) && (sex2.equals("เมีย"))){
  //ผสมพันธ์
  System.out.println("\n---กำลังผสมพันธ์---");
  System.out.println("ข้าชื่อ "+husband+" เพศ"+sex1);
  System.out.println("ข้าชื่อ "+wife+" เพศ"+sex2);
  System.out.println("---การผสมพันธ์สำเร็จ---");
  //ชื่อลูก
  String str1 = new String (husband);
  String str2 = new String (wife);
  System.out.print("มีลูกชื่อ "+str1.substring(0,1)+str2.substring(0,1));
  }else{
    System.out.println("!!!การผสมพันธ์ล้มเหลว!!!");
    System.exit(0);//จบการทำงาน
  }
}

 //เพศของลูก
 public void breed_ran() {
         Random rand = new Random();
         int sex_child = rand.nextInt(10);
        if(sex_child<=4){
          System.out.println(" เพศหญิง");
        }else{
          System.out.println(" เพศชาย");
        }
    } 
}