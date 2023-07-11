/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//First we need to check if the lists are not null
//If the head of first list is small then in it's next element we will add all the elements of merge list recursively, return list1
//If the head of second list is small then again we will do the same thing recursively, return list2
//If any of the list is null then simply return the other list. 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next, list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list2.next, list1);
                return list2;
            }
        }
           if(list1==null){
                return list2;
            }
        return list1;
    }
}