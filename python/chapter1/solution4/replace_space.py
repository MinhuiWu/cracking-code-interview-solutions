#!/usr/bin/env python
''' Lesson learned: split() method will trim spaces by default, which
means we can't use it for this problem:
    return ''.join(s.split())
'''
def replace_space(s):
     '''
     Replace whispaces by using list.
     Time complexity: O(n), where n means the length of string.
     '''
     if not s or len(s) <= 1:
         return s
     result = []
     for chr in s:
         if chr is ' ':
             result.append('%20')
         else:
             result.append(chr)
     return ''.join(result)

def replace_spaces(s):
    '''
    Replace whitespaces by using replace() method
    '''
    return s.replace(' ', '%20')


