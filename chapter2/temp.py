from LinkedList import *

l = Node(0, Node(1, Node(2, Node(3, Node(4, Node(5))))))

while l:
    print l.value
    l = l.next
