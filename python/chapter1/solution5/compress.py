#!/usr/bin/env python

__author__ = "Rio"

def compress_str(string):
    ''' Compress string where duplicated characters become number.

    >> compress_str('a')
    >> a

    >> compress_str('abc')
    >> a1b1c1

    >> compress_str('aabb')
    >> a2b2
    '''
    if not string:
        return None

    if len(string) == 1:
        return string

    last = ''
    count = 1
    result = []
    for chr in string:
        if last == chr:
            count += 1
        else:
            if last:
                result.append(last+str(count))
            last = chr
            count = 1

    result.append(last+str(count))
    return ''.join(result)
