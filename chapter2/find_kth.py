#!/usr/bin/env python

__author__ = "Rio"

from LinkedList import Node

def find_kth(lst, k):
    '''
    Find kth element in a linked list.
    '''
    fast = lst
    while k:
        if not fast:
            return
        fast = fast.next
        k -= 1

    slow = lst
    while fast:
        slow = slow.next
        fast = fast.next

    return slow.value

def find_kth_stack(lst, k):
    if not lst:
        return None

    stack = []
    current = lst
    while current:
        stack.append(current.value)
        current = current.next

    value = 0
    while k:
        value = stack.pop()
        k -= 1

    return value

def find_kth_reverse_list(lst, k):
    if not lst:
        return None

    last = None
    current = lst
    while current:
        next = current.next
        current.next = last
        last = current
        current = next

    while k:
        last = last.next
        k -= 1

    return last.value

if __name__ == "__main__":
    l = Node(0, Node(1, Node(2, Node(3, Node(4, Node(5, Node(5, Node(6))))))))
    current = l
    while current:
        print current.value,
        current = current.next

    print

    print find_kth(l, 2)
    print find_kth_stack(l, 2)
    print find_kth_reverse_list(l, 2)
