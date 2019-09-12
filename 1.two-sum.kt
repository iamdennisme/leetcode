/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        nums.mapIndexed { index, i ->
            map.put(index, i)
        }
        map.forEach { (_, value) ->
            val result = target - value
            if (map.containsValue(result)) {
                return intArrayOf(value, result)
            }
        }
        throw Throwable("err")
    }
}

