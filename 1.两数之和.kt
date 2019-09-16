/*
 * @lc app=leetcode.cn id=1 lang=kotlin
 *
 * [1] 两数之和
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in 0 until nums.size) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i

        }
        throw Throwable("err")
    }
}

