#!/usr/bin/env python

def reverse_str(str):
    '''
    Reverse a string.
    '''
    if not str:
        return None
    return str[::-1]

def reverse_lst(str):
    '''
    Reverse a string.
    '''
    if not str:
        return None
    return ''.join([str[i] for i in range(len(str)-1, -1, -1)])

def reverse_recursive(str):
    '''
    Reverse a string.
    '''
    if not str:
        return None

    if len(str) <= 1:
        return str

    return reverse_recursive(str[1:]) + str[0]
