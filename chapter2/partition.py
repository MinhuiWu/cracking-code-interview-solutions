#!/usr/bin/env python

from LinkedList import Node

__author__ = 'Rio'

def partition(lst, x):
    ''' Partition a linked list around value x.
    '''
    if not lst: return None

    before, after = None, None

    current = lst
    while current:
        next = current.next
        # Insert node in front of the head
        if current.value < x:
            current.next = before
            before = current
        else:
            current.next = after
            after = current
        current = next

    if not before:
        return after

    head = before
    while head.next:
        head.next = head.next.next
    head.next = after

    return before

if __name__ == "__main__":
    l = Node(0, Node(5, Node(1, Node(9, Node(5, Node(7, Node(1, Node(3))))))))
    current = l
    while current:
        print current.value,
        current = current.next

    print
    current = partition(l, 5)
    while current:
        print current.value
        current = current.next
