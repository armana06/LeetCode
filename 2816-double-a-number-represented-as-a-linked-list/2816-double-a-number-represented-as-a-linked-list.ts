/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function doubleIt(head: ListNode | null): ListNode | null {
    var list: Array<ListNode | null> = [];
    let temp: ListNode | null = head;
    while(temp != null) {
        list.push(temp);
        temp = temp.next;
    }
    let carry = 0;
    for(let i = list.length - 1; i >= 0; --i) {
        let tempVal : number | undefined = list[i].val;
        list[i].val = (2 * tempVal + carry)%10;
        carry = Math.floor((2 * tempVal + carry)/10);
    }
    //console.log(carry);
    if(carry != 0) {
        let tempNode = new ListNode(carry, list[0]);
        list.unshift();
        list[0] = tempNode;
    }
    return list[0];
};