package 算法;

import java.util.*;

public class 跳至i最快完成跳跃 {
   public static void main(String[] args) {
      int[] arr = {100, -23, -23, 404, 100, 23, 253, 3, 93, 404};
      System.out.println(minJumps(arr));
   }

   /*
   输入：arr = [100,-23,-23,404,100,23,23,23,3,404]
   输出：3
   解释：那你需要跳跃 3 次，下标依次为 0 --> 4 --> 3 --> 9 。下标 9 为数组的最后一个元素的下标。
    */
   static final int MAX = Integer.MAX_VALUE;

   public static int minJumps(int[] arr) {
      int n = arr.length;
      Queue<Integer> queue = new LinkedList<>();
      Map<Integer, List<Integer>> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
         int a = arr[i];
         List<Integer> list = map.getOrDefault(a, new ArrayList<>());
         list.add(i);
         map.put(a, list);
      }
      int[] dis = new int[n]; //每个元素到最后一个元素的距离，用来存结果
      Arrays.fill(dis, MAX);
      dis[n - 1] = 0;
      queue.offer(n - 1);
      boolean[] visited = new boolean[n]; //记录元素是否被访问过，初始都是false
      while (!queue.isEmpty()) {
         int x = queue.poll();
         if (x - 1 >= 0 && dis[x - 1] == MAX) { //等于MAX说明x左边的元素还没有计算过
            dis[x - 1] = dis[x] + 1;
            queue.offer(x - 1);
            System.out.println("x-1  "+(x-1));
         }
         if (x + 1 < n && dis[x + 1] == MAX) {
            dis[x + 1] = dis[x] + 1;
            System.out.println("x+1  "+(x+1));
            queue.offer(x + 1);
         }
         if (!visited[x]) {
            for (int i : map.get(arr[x])) {
               if (dis[i] == MAX) {
                  dis[i] = dis[x] + 1;
                  queue.offer(i);
                  System.out.println("i  "+i);
                  visited[i] = true;
               }
            }
         }
      }

      return dis[0];
   }
}