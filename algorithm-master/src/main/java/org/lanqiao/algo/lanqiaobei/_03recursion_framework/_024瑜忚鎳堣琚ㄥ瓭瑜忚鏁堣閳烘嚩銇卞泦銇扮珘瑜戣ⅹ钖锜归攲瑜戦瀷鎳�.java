package org.lanqiao.algo.lanqiaobei._03recursion_framework;

/**
 * 小明最近喜欢搭数字积木，
 一共有10块积木，每个积木上有一个数字，0~9。


 搭积木规则：
 每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
 最后搭成4层的金字塔形，必须用完所有的积木。


 下面是两种合格的搭法：


 0
 1 2
 3 4 5
 6 7 8 9


 0
 3 1
 7 5 2
 9 8 6 4


 请你计算这样的搭法一共有多少种？


 请填表示总数目的数字。
 注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。

 思路：这就是一个全排列
 */
public class _024全排列应用_搭积木 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      src[i] = i;
    }
    f("");
    System.out.println(count);
  }

  static int[] src = new int[10];
  static int count;

  static void f(String prefix) {
    if (prefix.length() == src.length) {
      if (check(prefix)) // 是否合法解
        count++;
      return;
    }

    for (int i = 0; i < src.length; i++) {
      if (!prefix.contains(src[i] + "")) {//字符可用
        f(prefix + src[i]);
      }
    }
  }

  /**
   0
   1 2
   3 4 5
   6 7 8 9
   * @param prefix
   * @return
   */
  private static boolean check(String prefix) {
    return prefix.charAt(0) < prefix.charAt(1) && prefix.charAt(0) < prefix.charAt(2) &&
        prefix.charAt(1) < prefix.charAt(3) && prefix.charAt(1) < prefix.charAt(4) &&
        prefix.charAt(2) < prefix.charAt(4) && prefix.charAt(2) < prefix.charAt(5) &&
        prefix.charAt(3) < prefix.charAt(6) && prefix.charAt(3) < prefix.charAt(7) &&
        prefix.charAt(4) < prefix.charAt(7) && prefix.charAt(4) < prefix.charAt(8) &&
        prefix.charAt(5) < prefix.charAt(8) && prefix.charAt(5) < prefix.charAt(9);
  }
}
