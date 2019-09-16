/*
 * @lc app=leetcode.cn id=2 lang=kotlin
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (35.63%)
 * Likes:    3046
 * Dislikes: 0
 * Total Accepted:    209.8K
 * Total Submissions: 588.5K
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 
 * 
 */
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result: ListNode? = null
        var currentNode:ListNode?=null
        var l1Tmp = l1
        var l2Tmp = l2
        var carry=0
        while (l1Tmp != null || l2Tmp != null) {
            val listNode=((l1Tmp?.`val`?:0) + (l2Tmp?.`val`?:0)+carry).let {
                val node=ListNode(it%10)
                carry=it/10
                return@let node
            }
            l1Tmp= l1Tmp?.next
            l2Tmp=l2Tmp?.next
            if (result==null){
                result=listNode
                currentNode=result
            }else{
                currentNode!!.next=listNode
                currentNode=listNode
            }
        }
        if (carry!=0){
            currentNode?.next=ListNode(carry)
        }
        return  result
    }
}

