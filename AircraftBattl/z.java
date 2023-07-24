package AircraftBattl;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.Scanner;

public class z {
   private static String id;
   private static LocalDate birthday;
   private static int point;
   static Scanner sc = new Scanner(System.in);
   static String ScanerpassWord;
   static String finalpassWord = "123456";
   static String userName;

   public z(String id, LocalDate birthday, int point) {
      this.id = id;
      this.birthday = birthday;
      this.point = point;
   }

   public static String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public static LocalDate getBirthday() {
      return birthday;
   }

   public void setBirthday(LocalDate birthday) {
      this.birthday = birthday;
   }

   public static int getPoint() {
      return point;
   }

   public void setPoint(int point) {
      this.point = point;
   }


   public static void main(String[] args) {
      while (true) {
         System.out.print("\n\n\t\t欢迎使用 购物管理系统 1.0版\n"
            + "*************************************************************************\n"
            + "\t\t1.登录系统 \n " +
            "\t\t2.更改管理员密码\n" +
            "\t\t3.退出  " +
            "\n*************************************************************************" +
            "\n请您选择，输入数字（1，2，3）：");
         String value = sc.next();
         System.out.println("\t请输入用户名: ");
         userName = sc.next();

         switch (value) {
            case "1":
               //此方法用于 密码输入，并判断是否正确，当三次密码不正确 重新输入二
               ifPassWordAnduserName();
               break;
            case "2":
               //此方法  用于修改密码
               changePassWord();
               break;

            //这两个else,是想输入3 或者 乱输，都能关闭运行的程序
            case "3":
               System.out.println("好的,系统关闭!");
               System.exit(0);
            default:
               System.out.println("请不要乱输 你只有三个选择 乱输会系统结束！");
               System.exit(0);
         }
      }
   }

   private static int changePassWord() {
      System.out.println("\t你需要修改你的密码\n请输入密码(系统会将您的密码 修改): ");
      ScanerpassWord = sc.next();
      finalpassWord = ScanerpassWord;
      System.out.println("ok,你的密码已重置！\n\n");
      return 1;
   }

   private static void ifPassWordAnduserName() {
      for (int i = 0; i < 3; i++) {
         System.out.println("\t请输入 " + userName + " 的密码: ");
         ScanerpassWord = sc.next();
         if (ScanerpassWord.equals(finalpassWord)) {
            System.out.println("\t输入密码正确!");//此方法用于 使用购物管理系统
            useShopping();
            return;
         } else if (i == 2) {
            System.out.println("三次密码都没有输入正确, 重新输入数字 2 , 对密码进行修改!");

            String f = sc.next();
            if (f.equals("2")) changePassWord();
            else System.out.println("请不要乱输！");

         } else {
            System.out.println("第" + (i + 1) + "次输入密码不正确");
         }
      }
   }

   private static void useShopping() {
      System.out.print("\n\n\t\t欢迎使用购物管理系统\n" +
         "*************************************************************************\n" +
         "\t\t1. 用户信息管理\n" +
         "\t\t2. 购物结算\n" +
         "\t\t3. 真情回馈\n" +
         "\t\t4. 注销\n" +
         "*************************************************************************\n ");
      while (true) {
         System.out.print("请输入(1,2,3,4)进入  你想进入的购物管理系统页面 ");
         String value2 = sc.next();
         switch (value2) {
            case "1":
               Vipuser();
               break;
            case "2":
               System.out.println("欢迎进入【购物结算】界面，这里面其实没有东西，自动退出 ");
               System.exit(0);
            case "3":
               System.out.println("欢迎进入【真情回馈】界面，这里面其实没有东西，自动退出 ");
               System.exit(0);
            case "4":
               System.out.println("注意进入【注销】界面，这里面其实没有东西，自动退出 ");
               System.exit(0);
            default:
               System.out.println("请不要乱输 你只有四个选择 乱输会强制退至登录界面！");
               return;
         }
      }
   }

   private static void Vipuser() {
      System.out.print("\n\n\n\t\t购物管理系统 > 会员信息管理菜单" +
         "\n\t\t欢迎使用会员信息管理菜单\n" +
         "*************************************************************************\n" +
         "\t\t1. 显示用户会员信息\n" +
         "\t\t2. 添加会员信息\n" +
         "\t\t3. 修改会员信息\n" +
         "\t\t4. 查询会员信息\n" +
         "*************************************************************************\n " +
         "\t\t按数值0返回上一界面\n" +
         "请输入(1,2,3,4)进入  你想进入的页面: ");

      String value3 = sc.next();
      switch (value3) {
         case "1":
            System.out.println("欢迎进入【用户会员信息】界面!");
            userInformation();
            break;
         case "2":
            System.out.println("欢迎进入【添加会员信息】界面，这里面其实没有东西，自动退出 ");
            System.exit(0);
         case "3":
            System.out.println("欢迎进入【修改会员信息】界面，这里面其实没有东西，自动退出 ");
            System.exit(0);
         case "4":
            System.out.println("注意进入【查询会员信息】界面，这里面其实没有东西，自动退出 ");
            System.exit(0);
         case "0":
            System.out.println("注意退出【用户会员信息】\n\n ");
            return;
         default:
            System.out.println("请不要乱输 你只有三个选择 乱输会系统结束！");
            System.exit(0);
      }
   }

   private static void userInformation() {
      System.out.println("\n\n\n\t\t购物管理系统 > 会员信息管理菜单 > 显示用户信息\n\n" +
         "*****用户会员列表*********\n");
      int[][] data = {{1000, 2000, 300}, {1002, 2434, 200}, {102, 3467, 500}};

      System.out.println("a     b      c");

      for (int i = 0; i < data.length; i++) {
         for (int j = 0; j < data[i].length; j++) {
            System.out.print(data[i][j] + "\t");
         }
         System.out.println();
      }
      System.exit(0);
   }
}