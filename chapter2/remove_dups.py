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

    while current:
        if current.value not in content:
            content[current.value] = True
        else:
            current.next = current.next.next

def remove_dups(lst):
    '''
    Remove duplicates from a linked list.

    Time Complexity: O(n), where n means the number of linked list.
    Space Compexity: O(1), no additional sapce is needed.
    '''
    if not lst:
        return None

    current = lst
    previous = None
    found = False
    while current and not found:
        if current.value == current.next.value:
            found = True
        previous, current = current, current.next

    if not previous and found:
        lst = lst.next
    else:
        previous.next = current.next


if __name__ == "__main__":
    lst = random_list(10, 0, 5)
    print lst
    print "Start to remove dups"
    remove_dups(lst.head())
    print lst
