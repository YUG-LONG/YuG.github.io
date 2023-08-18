package webLearn;

import 算法.将对象添加到数组中_对sort方法的比较规则重构;

import java.util.Arrays;

public class 将对象添加到数组中 {
   public static void main(String[] args) {
      // 定义一个自定义类 MyObject
      将对象添加到数组中_对sort方法的比较规则重构[] objects = new 将对象添加到数组中_对sort方法的比较规则重构[4];
      objects[0] = new 将对象添加到数组中_对sort方法的比较规则重构("Apple", 3);
      objects[1] = new 将对象添加到数组中_对sort方法的比较规则重构("Banana", 2);
      objects[2] = new 将对象添加到数组中_对sort方法的比较规则重构("Orange", 5);
      objects[3] = new 将对象添加到数组中_对sort方法的比较规则重构("Grape", 1);

      System.out.println("Before sorting:");
      for (将对象添加到数组中_对sort方法的比较规则重构 obj : objects) {
         System.out.println(obj);
      }

      // 调用 Arrays.sort() 方法进行排序
      Arrays.sort(objects);

      System.out.println("\nAfter sorting:");
      for (将对象添加到数组中_对sort方法的比较规则重构 obj : objects) {
         System.out.println(obj);
      }
   }
}
