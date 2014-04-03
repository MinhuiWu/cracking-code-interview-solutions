#!/usr/bin/env python

__author__ = 'Rio'

class Node():
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

class LinkedList():
    def __init__(self):
        self.head = None

    def add(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node

    def __str__(self):
        result = []
        current = self.head
        while current:
            result.append(str(current.value))
            current = current.next
        return '->'.join(result)

    def head(self):
        return self.head

def random_list(length, lo, hi):
    import random
    lst = LinkedList()
    for i in range(length):
        value = random.randint(lo, hi)
        lst.add(value)
    return lst
