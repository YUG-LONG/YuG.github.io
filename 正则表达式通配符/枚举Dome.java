package 正则表达式通配符;

public class 枚举Dome {
   public static void main(String[] args) {
      枚举实例 spring = 枚举实例.Spring;
      System.out.println(spring.getA_desc()+"\t"+spring.getAge());
      枚举实例 summer = 枚举实例.Summer;
      System.out.println(summer.getA_desc()+"\t"+summer.getAge());
      枚举实例 Autumn = 枚举实例.Autumn;
      System.out.println(Autumn.getA_desc()+"\t"+Autumn.getAge());
      枚举实例 Winter = 枚举实例.Winter;
      System.out.println(Winter.getA_desc()+ Winter.getAge()+"\t"+
         Winter+"\t"+Winter.toString()+"\t"+
         枚举实例.class.getSuperclass());
   }
}
