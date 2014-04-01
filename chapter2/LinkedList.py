#!/usr/bin/env python

__author__ = 'Rio'

class Node():
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

class LinkedList():
    def __init__(self):
        self.head = None

    def random_list(self):

