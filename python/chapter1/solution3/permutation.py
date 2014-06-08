#!/usr/bin/env python

def is_permutation_dict(s, t):
    '''
    Normal solution, O(n) complexity.
    '''
    if not s or not t:
        return False
    if len(s) != len(t):
        return False

    content = {}
    for chr in s:
        if chr in content:
            content[chr] = content[chr] + 1
        else:
            content[chr] = 1

    for chr in t:
        if content.get(chr) <= 0:
            return False
        content[chr] -= 1

    return True

def is_permutation_sorted(s, t):
    '''
    Use python built-in method - sorted()

    As sorted method is based on Timsort(http://en.wikipedia.org/wiki/Timsort),
    which is a hybrid of merge sort and insertion sort. The average complexity
    is O(nlogn).
    '''
    if not s or not t:
        return False

    if len(s) != len(t):
        return False

    return sorted(s) == sorted(t)
