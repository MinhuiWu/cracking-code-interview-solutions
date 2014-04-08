#!/usr/bin/env python

__author__ = 'Rio'

from LinkedList import *

def remove_dups_dict(lst):
    '''
    Remove duplicates from a linked list.


    Use dictionary to check duplicates.
    Time Complexity: O(n), where n means the number of linked list.
    Space Complexity: O(n), additional storage is requested.
    >> lst = duplicates_list(10)
    >>
    >> lst = remove_dups(lst)
    >>
    '''
    if not lst:
        return None

    current = lst
    content = {current.value: True}

    while current.next != None:
        if current.next.value not in content:
            content[current.next.value] = True
            current = current.next
        else:
            current.next = current.next.next

def remove_dups(lst):
    '''
    Remove duplicates from a linked list.

    Time Complexity: O(n^2), where n means the number of linked list.
    Space Compexity: O(1), no additional sapce is needed.
    '''
    if not lst:
        return None

    current = lst
    while current:
        runner = current
        while runner.next != None:
            if runner.next.value == current.value:
                runner.next = runner.next.next
            else:
                runner = runner.next
        current = current.next


if __name__ == "__main__":
    l = Node(0, Node(1, Node(2, Node(3, Node(4, Node(5, Node(5, Node(6))))))))
    current = l
    while current:
        print current.value,
        current = current.next


    remove_dups_dict(l)
    current = l
    while current:
        print current.value
        current = current.next

    remove_dups(l)
    current = l
    while current:
        print current.value
        current = current.next
