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
