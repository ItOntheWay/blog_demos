package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: za2599@gmail.com
 * @create: 2022-06-30 22:33
 **/
public class L0257 {


    List<List<Integer>> res = new ArrayList<>();

    private void dfs(int targetSum, int startIndex, int[] path, int depth) {

        int val = 0;

        for(int i=0;i<depth;i++) {
            val += path[i];
        }

        // 注意审题！！！
        // 必须要凑齐K个数
        if (depth==path.length) {

            if(targetSum==val) {
                List<Integer> list = new ArrayList<>();

                for(int i=0;i<depth;i++) {
                    list.add(path[i]);
                }

                res.add(list);
            }

            return;
        } else if (val>=targetSum){
            // 还没达到数量，累加和就已经等于目标值了，那就可以提前返回了
            return;
        }

        for (int i=startIndex;i<10;i++) {
            path[depth] = i;
            dfs(targetSum, i+1, path, depth+1);
        }
    }


    public List<String> binaryTreePaths(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {



    }
}
