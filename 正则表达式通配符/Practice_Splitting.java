package 正则表达式通配符;

public class Practice_Splitting {
   public static void main(String[] args) {
      //将字符串按照，进行分割 使用split方法
      String str = "wefg,234,143b,234g,46n6";
      String[] strArr = str.split(",");
      for (String i : strArr) {
         System.out.print(i + '\t');
      }

      System.out.println();
      char[] chstr = str.toCharArray();

      //参数无论是字符串数组还是字符串
      //都会将 参数 转化为单个的数字和字母
      for (char i : chstr) {
//         System.out.print(i+'\t');
         if (i >= '0' && i <= '9') {
            System.out.println(i);
         }
      }

      String erStr = str.replaceAll("4", "er");
      System.out.println(erStr + "\n" + str);

      //用于判断首字符串是否为startsWith方法中的参数
      char[] QQnb = "029%34&3t\nik96969".toCharArray();
      int num = 0;
      for (char i : QQnb) {
         //遍历QQnb用于获得全部数字
         if (!Character.isDigit(i)) {
            ++num;
         }
      }
      System.out.println("\n" + num);

      String regex = "[1-9][0-9]{4,9}";//
      System.out.println("2934396969".matches(regex));
      System.out.println("asdfbwvstgrba".replaceAll("[^abc]","X"));
      /*
      replaceAll("[abc]","X"))=XsdfXwvstgrXX

      加上^,视作将范围取反
      replaceAll("[^abc]","X"))=aXXXbXXXXXXba

      "2934396\r969"=969
       2934396\b969"=293439969
       */
      System.out.println("5".replaceAll("5?","_"));
   }
}