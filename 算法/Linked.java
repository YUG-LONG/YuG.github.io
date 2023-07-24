package 算法;

public class Linked {
   //一个节点类(有元素，引用)，一个节点（对象，实现节点类）
   private int size;

   private static class Node {
      private final String prv;
      private Node next;

      private Node(String prv) {
         this.prv = prv;
      }
   }

   private Node head = new Node(null);

   String addLinked() {
      Node currentHead = head;  // 保存初始的 head 引用
      size++;
      System.out.println(currentHead.prv); // 查看头节点的元素

      Node n = new Node("sd");  // 创建新的节点对象
      currentHead.next = n; // 将当前头节点的 next 指向新节点
      currentHead = currentHead.next; // 更新 head 引用为新节点

      size++;
      return currentHead.prv;
   }


   void addLinked(String prv) {//添加元素·到队列的末端
      int i = 0;
      /*if (head != null) {
         System.out.println(head.prv+" "+head.next.prv);
      } else {
         System.out.println("head.next is null");
      }
      不能直接使用head
      currentHead = currentHead.next;更新 head 引用为新节点
      会造成head引用的变化发生错误*/

      //复制一份节点对象,
      Node cur = head;

      //为新元素设置节点对象
      Node pp = new Node(prv);

      while (i != size) {
         System.out.println(cur.prv);
         cur = cur.next;
         i++;
      }
      //cur是一个节点引用，连接新元素
      cur = pp;
      System.out.println(cur.prv);
   }
}
