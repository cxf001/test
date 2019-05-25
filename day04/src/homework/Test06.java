package homework;

import java.util.ArrayList;

/*
字符串数组strs中包含字符串{"12","345","6789","1","123","4567"}，
创建2个ArrayList集合，分别存放strs数组中字符串长度为偶数的元素和字符串长度为奇数的元素，
最终将这两个集合在控制台打印输出：打印格式如下：
长度为偶数的元素有：[12, 6789, 4567];
 长度为基数的元素有：[345, 1, 123];
 */
public class Test06 {
    public static void main(String[] args) {
        String[] strs=new String[]{"12","345","6789","1","123","4567"};
        ArrayList<Object> s1 = new ArrayList<>();
        ArrayList<Object> s2 = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            if(s.length()%2==0){
                s1.add(strs[i]);
            }else{
                s2.add(strs[i]);
            }
        }
        System.out.print("长度为偶数的元素有：" + s1);
        System.out.println();
        System.out.println("长度为奇数的元素有：" + s2);
    }
}
