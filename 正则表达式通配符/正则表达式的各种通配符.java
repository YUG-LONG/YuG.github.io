package 正则表达式通配符;

//学习正则匹配表达式
public class 正则表达式的各种通配符 {
   public static void main(String[] args) {
      String str = "b2d b 5 5556 & ￥%f b";
      System.out.println();
/*加上中括号 更简洁明了
^A 以A开头, 加上[]视作取反
A$ 以A结尾

\\b单词匹配，\\B非单词匹配

？匹配 ? 零次或一次。将匹配字符串中的 "?" 或不匹配任何内容，并将其替换为下划线 "_"
+ 匹配 ? 一次或多次。将匹配字符串中连续出现的一个或多个 "?"，并将其替换为下划线 "_"
* 匹配 ? 零次或多次。将匹配字符串中连续出现的零个或多个 "?"，并将其替换为下划线 "_"
{n} 出现正好N次
{n,m}出现n至m次
{n,}出现至少N次

当regex="b"时，将字符串的所有b，改为"_"

[^b]=___b__b____________________b,将所有的 非b字符 更改
 ^b =_2d b 5 5556 & ￥%f b, 匹配首字符b
 b$ == [b$] == b2d b 5 5556 & ￥%f _ ， 匹配末尾字符b
[b$]=_2d _ 5 5556 & ￥%f _ , 匹配所有b字符串

[^b] == [^b$] == ___b__b____________________b

\\b=_b2d_ _b_ _5_ _5556_ & ￥%_f_ _b_ 单词边界
\\B= b_2_d b 5 5_5_5_6 _&_ _￥_%f b 非单词边界
 */
      System.out.println(str.length() + "\n" +
            str.replaceAll("b", "_") + "\n\n" +//匹配所有b

            str.replaceAll("^b", "_") + "\n" +
            //判断字符串的第一个是否是 b
            str.replaceAll("b$", "_") + "\n" +
            //判断字符串的最后一个是否为b
            str.replaceAll("[b$]", "_") + "\n\n" +
            //匹配所有 b

            str.replaceAll("[^b]", "_") + "\n" +
            //匹配所有的 非b的 字符串
            str.replaceAll("[^b$]", "_") + "\n\n" +
            //匹配所有的 非b的 字符串

         /* 单词边界匹配：
         字母数字算，b2d改为：_b2d_
         字母算：b被改为_b_；
         数字算：_5_；
         多个数字算：_5556_
         但是中文字符串：￥%f不太算：￥%_f_*/
            str.replaceAll("\\b", "_") + "\n" +
            str.replaceAll("\\B", "_") + "\n\n" +
         /*非单词边界匹配：
？匹配 ? 零次或一次。将匹配字符串中的 "?" 或不匹配任何内容，并将其替换为下划线 "_"
+ 匹配 ? 一次或多次。将匹配字符串中连续出现的一个或多个 "?"，并将其替换为下划线 "_"
* 匹配 ? 零次或多次。将匹配字符串中连续出现的零个或多个 "?"，并将其替换为下划线 "_" */
            str.replaceAll("[5?]", "_") + "\n" +
            str.replaceAll("[5+]", "_") + "\n" +
            str.replaceAll("[5*]", "_") + "\n" +

            str.replaceAll("5?", "_") + "\n\n" +
            //不加[]的结果：_b_2_d_ _b_ __ ____6_ _&_ _￥_%_f_ _b_
            str.replaceAll("5+", "_") + "\n\n" +
            //不加[]的结果：b2d b _ _6 & ￥%f b
            str.replaceAll("5{2}", "_") + "\n\n" +
            str.replaceAll("5*", "_") + "\n" + "\n" +
            //不加[]的结果：b2d b _ _6 & ￥%f b

            "现在是北京时间 2023年 6月 31日 ".replaceAll("\\D+", "_")
         //\D匹配的是非数字字符串 添加一个+ 匹配到的非数字字符串视作一体

      );
      String[] ArrStr = ("Baidu Translation provides instant free " +
         "200+ language translation services, " +
         "with web pages, APP, API products, supporting text translation, " +
         "document translation, image translation and other special functions, to " +
         "meet the needs of users such as word translation, document " +
         "translation, contract translation, etc"
      ).split(" ");//.replaceAll("\\b[a-zA-Z]{3}\\b"," ")
      for (String i : ArrStr) {
         if (i.matches("\\b[a-zA-Z]{3}\\b")) {
            System.out.println(i);
         }
      }
      str = "现在是北京时间2023年12月31日下午15点45分 ".replaceAll("\\D+", " ");
      ArrStr = str.split(" ");
      for (String i : ArrStr) {
         if (i.matches(".*\\d{4}.*")) {//匹配由4个数字组成
            System.out.println(i+"年");
         } else if (i.matches(".*(0[1-9]|1[0-2]).*")) {
            //匹配1-9月：[1-9]，或:|, 10-12月:1[0-2]
            System.out.println(i+"月");
         } else if (i.matches(".*(0[1-9]|[1-2]\\d|3[0-1]).*")) {
            System.out.println(i+"日");
         }
      }
      str = "现在是北京时间2023年7月1日下午15点45分 ";
      System.out.println(str.matches(".*\\d{4}.*") + "\n" +
         str.matches("(0?[1-9]|1[0-2])$") + "\n" +
         str.matches(".*((0?[1-9])|((1|2)[0-9])|30|31)$.*")+ "\n" +

      "2016/03/05\r\n".matches("\\b(\\d{4})[/-](\\d{2})[/-](\\d{2})\\b")//,"$2-$1-$3")
      );


       str = "ghcfyjt7"; // 要匹配的字符串

      boolean isMatch = str.matches("^(0?[1-9]|1[0-2])$"); // 使用正则表达式进行匹配

      System.out.println(isMatch+"  "+(7 >> 1)+"  "+(4 >>> 1)); // 输出匹配结果

   }
}
