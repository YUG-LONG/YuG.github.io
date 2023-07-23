package 正则表达式通配符;

enum 枚举实例 {
   Spring(3, "春天！"),
   Summer(4, "夏日！"),
   Autumn(2, "秋天！"),
   Winter(5, "冬天！");
   //创建‘枚举实例’类的 属性
   private final int age;
   private final String a_desc;

   //要保证 类的对象个数是有限的 就必须私有构造方法（封装对象）
   private 枚举实例(int age, String a_desc) {
      this.age = age;
      this.a_desc = a_desc;
   }

   //提供获取 ‘枚举实例‘ 成员参数 的方法
   public int getAge() {
      return age;
   }

   public String getA_desc() {
      return a_desc;
   }
}
