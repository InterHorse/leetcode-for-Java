package q78_Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author InterHorse
 * @date 2021-01-28 21:10:59
 *
 * 78. 子集
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 *
 * 提示：
 *
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 *
 * https://leetcode-cn.com/problems/subsets/
 */
public class Solotion {
    private List<List<Integer>> resList = new ArrayList<>();
    private int[] oriNums;
    public List<List<Integer>> subsets(int[] nums) {
        this.oriNums = nums;
        if (nums.length == 0) {
            return resList;
        }
        addList(new ArrayList<>(), 0);
        return resList;
    }

    private void addList(List<Integer> list, int index) {
        resList.add(new ArrayList<>(list));
        for (int i = index; i < oriNums.length; i++) {
            list.add(oriNums[i]);
            addList(list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
