#!/usr/bin/env python

from LinkedList import Node

__author__ = 'Rio'

def delete_middle(lst, middle):
    if not lst: return lst

    if not middle.next:
        return lst

    next = middle.next
    middle.next = next.next
    middle.value = next.value

if __name__ == '__main__':
    l = Node(0, Node(1, Node(2, Node(3, Node(4, Node(5, Node(5, Node(6))))))))
    current = l
    while current:
        print current.value,
        current = current.next

    current = l
    i = 0
    while i < 3:
        current = current.next
        i += 1

    print
    delete_middle(l, current)
    current = l
    while current:
        print current.value,
        current = current.next

