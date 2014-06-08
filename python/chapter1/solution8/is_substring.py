#!/usr/bin/env python

__author__ = 'Rio'

def is_substring(s, t):
    return t in s

def is_rotation(s, t):
    ss = s + s
    return is_substring(ss, t)
