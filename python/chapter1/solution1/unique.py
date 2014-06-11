#!/usr/bin/env python
# -*- coding: utf-8 -*-

def is_unique_dict(str):
    '''
    Returns True if the str contains unique characters, otherwise returns False.

    Use set datastructure to store each character.
    Time Complixity: O(N), where N means the len(str)
    '''
    if not str or len(str) <= 1:
        return True

    content = set()
    for chr in str:
        if chr in content:
            return False
        else:
            content.add(chr)

    return True

def is_unique_bit(str):
    '''
    Returns True if the str contains all unique characters, otherwise return False.
    '''
    if not str or len(str) <= 1:
        return True

    mask = 0
    for chr in str:
        if (mask & (1 << ord(chr))):
            return False
        mask |= (1 << ord(chr))

    return True

def is_unique_set(str):
    '''
    Returns True if the str contains all unique characters, otherwise return False.

    Leverage the feature of set - all elements must be unique.
    '''
    return len(str) == len(set(str))
