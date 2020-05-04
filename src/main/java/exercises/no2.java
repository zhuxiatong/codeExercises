package exercises;

import pojo.Node;

/**
 * @author zxt
 * @version 1.0
 * @date 2020/3/16 20:07
 */
public class no2 {

    public static boolean isInclude(Node root1,Node root2){
        boolean flag= false;
        if (root1 ==null&& root2 ==null){
            throw new RuntimeException("树结构为空");
        }

        //flag = bianli(root1,root1.left,root2.right,root2);
        return flag;
    }
//    public static boolean bianli(Node root1,Node left,Node right,Node root2){
//        boolean flag = false;
//        if (root1 == null && left ==null &&right==null){
//            return false;
//        }
//        if (root1.val == root2.val){
//            //比较树的左节点
//            bianli(left,left.left,left.right,root2.left);
//            //比较树的右节点
//            bianli(right,right.left,right.right,root2.right);
//            flag = true;
//        }
//        return flag;
//    }
}
