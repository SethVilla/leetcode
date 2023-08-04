// 21 Merge Two Sorted Lists https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 *
 **/

class ListNode {
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
}

/*
* @param {ListNode} list1
* @param {ListNode} list2
* @return {ListNode}
*/
const mergeTwoLists = (list1, list2) => {
    const list = new ListNode();
    let current = list;

    while (list1 && list2) {
        if (list1.val < list2.val) {
            current.next = list1;
            list1 = list1.next;
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }

    if (list1) {
        current.next = list1;
    } else {
        current.next = list2;
    }

    return list.next;
}
