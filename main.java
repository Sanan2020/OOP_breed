import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Kuntong3 a = new Kuntong3();
    Scanner sn = new Scanner(System.in);
    
    System.out.print("ป้อนชื่อนกตัวผู้:");
    String husband = sn.nextLine();
    System.out.print("ป้อนเพศ:");
    String sex1 = sn.nextLine();
    System.out.print("ป้อนชื่อนกตัวเมีย:");
    String wife = sn.nextLine();
    System.out.print("ป้อนเพศ:");
    String sex2 = sn.nextLine();

    // System.out.print(" = "+sex1+sex2);
    a.breed_ran(husband,wife,sex1,sex2); //เรียก, ส่ง Argument ไปยัง breed_ran
    a.breed_ran(); //เรียกการสุ่ม
  }
}