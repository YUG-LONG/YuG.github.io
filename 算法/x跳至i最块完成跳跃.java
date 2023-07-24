package 算法;

import java.util.Random;

public class x跳至i最块完成跳跃 {
   static int earthling = 30;
   static Random r = new Random();
   static String[] Array = new String[earthling];
   int[] vlaue;

   public static void main(String[] args) {
      new x跳至i最块完成跳跃(r, Array);
      for (String s : Array) {
         System.out.println(s);
      }
      System.out.println("\n");
      System.out.println(jump(Array));
   }

   static int jump(String[] arr) {
      boolean[] visited = new boolean[earthling];
      //整形数组，判断数组元素是否经过
      int[] queue = new int[earthling];
      int l = 0;
      int r = 0;

      queue[r++] = 0;
      visited[0] = true;
      int jump = 0;
      /*
      深宽度优先遍历
      一次遍历一整陈
      2 23
4 26
3 14
5 16
1 9
4 26
       */

      while (l <= r) {
         int tmp = r;
         for (; l <= tmp; l++) {
            int cur = queue[l];

            if (cur == earthling - 1) {
               return jump;
            }

            //这2个 if语句 是 a-1，a+1
            if (cur + 1 < earthling && !visited[cur + 1]) {
               visited[cur + 1] = true;
               queue[r++] = cur + 1;
            }
            if (cur > 0 && !visited[cur - 1]) {
               visited[cur - 1] = true;
               queue[r++] = cur - 1;
            }
//这个方法用于 判断 数组开头的元素是否是指定的元素
            value(arr[cur], visited, queue, r);
//            System.out.println(arr[cur]);
         }
         jump++;
      }
      return -1;
   }

   public x跳至i最块完成跳跃(Random r, String[] Array) {
      for (int i = 0; i < earthling / 2; i++) {
         boolean flag = true;
         while (flag) {
            int a = r.nextInt(earthling);
            int b = r.nextInt(earthling);
            if (Array[a] == null && Array[b] == null && a != b) {
/*               arr[a] = "a:" + i + "\t{ a-1=" + (a - 1 < 0 ? null : a)
                  + " , a+1=" + (a + 2) + " , i=" + (b + 1) + " }";
               arr[b] = "a:" + i + "\t{ a-1=" + (b - 1 < 0 ? null : b)
                  + " , a+1=" + (b + 2) + " , i=" + (a + 1) + " }";*/
               Array[a] = i + "," + (a - 1 < 0 ? null : a)
                  + "," + (a + 2 > earthling ? null : (a + 2)) + "," + (b + 1);

               Array[b] = i + "," + (b - 1 < 0 ? null : b)
                  + "," + (b + 2 > earthling ? null : (a + 2)) + "," + (a + 1);
               flag = false;
            }
         }
      }
   }

   //数组中 2个元素相同但索引不同的 判断两者是否 有元素经过
   static int value(String cur, boolean[] visited, int[] queue, int r) {
      String[] index = cur.split(",");
      if (index[0] != null && index[3] != null) {
         System.out.println(index[0]+ " "+index[3]);
        visited[Integer.parseInt(index[0])] = true;
         queue[r++] = Integer.parseInt(index[0]);

         visited[Integer.parseInt(index[3])] = true;
         queue[r++] = Integer.parseInt(index[3]);
      }
      return 0;
   }
}