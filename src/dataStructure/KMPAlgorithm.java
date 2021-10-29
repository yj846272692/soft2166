package dataStructure;

import java.util.Arrays;

/**
 * @author YG.
 * @description: KMP算法
 * @DATE: 2021/10/29
 */
public class KMPAlgorithm {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        int[] next = KmpNext(str2);
        System.out.println("next=" + Arrays.toString(next));
        int index = KmpSearch(str1, str2, next);
        System.out.println("index=" + index);
    }

    //KMP搜索算法

    /**
     * @param str1 源字符串
     * @param str2 子串
     * @param next 部分匹配表，是子串对应的部分匹配表。
     * @return 如果是-1 表示没有找到，否则返回第一个匹配的位置
     */
    public static int KmpSearch(String str1, String str2, int[] next) {
        //遍历
        for (int i = 0, j = 0; i < str1.length(); i++) {
            //需要处理str1.charAt(i)！=str2.charAt(j),去调整j的大小
            //KMP 的核心算法
            while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
                j = next[j - 1];
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            if (j == str2.length()) {
                //找到了
                return i - j + 1;
            }
        }
        return -1;
    }

    //获取到一个字符串的部分匹配表
    public static int[] KmpNext(String des) {
        //创建一个next数组保存部分匹配值
        int[] next = new int[des.length()];
        next[0] = 0;//如果字符串长度为1，部分匹配表就是0
        for (int i = 1, j = 0; i < des.length(); i++) {
            //当des.charAt(i)!=des.charAt（j），需要从next[j-1]获取新的j
            //找到我们发现  des.charAt(i)==des.charAt（j）  成立，才退出
            while (j > 0 && des.charAt(i) != des.charAt(j)) {
                j = next[j - 1];
            }
            //当 des.charAt(i)==des.charAt（j）  满足时，部分匹配表的值就+1
            if (des.charAt(i) == des.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }


}
