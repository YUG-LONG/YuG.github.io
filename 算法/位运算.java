package 算法;

public class 位运算 {
   public static void main(String[] args) {
/*      int N = 8;
      int[] array = new int[N];
      for (int i = 0; i < array.length - 1; i++) {
         array[i] = i + 1;
      }
//随机数范围【0，N】
      array[array.length - 1] = new Random().nextInt(N) + 1;
      int index = new Random().nextInt(N);
      // 使用异或运算交换两个元素的值
      array[2] ^= array[6];
      array[6] ^= array[2];
      array[2] ^= array[6];
      System.out.println("数组：" + Arrays.toString(array) + "\n");
      int n = 0;
      for (int i = 1; i <= N - 1; i++) {
         n ^= i;
         System.out.println(n);
      }
      System.out.println();
//n:每4个一组 4个数字分别：1,索引值加1,0,索引

      for (int i = 0; i < N; i++) {
         n ^= array[i];
         System.out.println(n);
      }
      System.out.println();

      array = new int[]{2, 4, 2, 5, 4};
      for (int i = 0; i < array.length - 2; i++) {
         array[i] ^= array[i + 1];
      }
      System.out.println(array[array.length - 2]);

      N = 0;n=15;
      for (int i = 0; i < 32; i++) {
         int i1 = (1 << i);
         int i2 = (n & (1 << i));
         System.out.println((1<<i)+ " " + (n & (1 << i)));
         if (i1 == i2)
            N++;
      }
      System.out.println(N);*/
      int N = 0;
      int n = 15;
      for (int i = 0; i < 6; i++) {
         System.out.println((n >>> i) + "  " + ((n >>> i) & 1));
         if (((n >>> i) & 1) == 1)
            N++;
      }
      System.out.println(N + "\n"+(9 << 3)+((9 & (9 << 3)) + "\n"));

      N = 0;
      n = 15;
      while (n != 0) {
         n = ((n - 1) & n);
         System.out.println(n);
         N++;
      }
      System.out.println(N + "\n");

      for (int j = 1; j < 100; j++)
         if (((j - 1) & j) == 0)
            System.out.println(j);
      n = 9;
      int ou = n & 0xaaaaaaaa;//转化为只保留了奇数位上的比特位，偶数位上的比特位被清零。
      int ji = n & 0x55555555;//只保留了奇数位上的比特位，偶数位上的比特位被清零。
      System.out.println((ou >> 1) + " " + (ji << 1) + "  "
         + ((ou >> 1) ^ (ji << 1)) + "  " + Math.ceil((double) 5 /2));

      int ss = ou & 0x7fffffff;//将数字 绝对值
      System.out.printf("%f,%d,%d",23.3,ss,Math.abs(ou));


   }

}
