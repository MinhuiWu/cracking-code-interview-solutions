#!/usr/bin/env python

import unittest
from reverse import *

class TestReverseString(unittest.TestCase):
    def test_none(self):
        a = None
        self.assertEqual(None, reverse_str(a))
        self.assertEqual(None, reverse_lst(a))
        self.assertEqual(None, reverse_recursive(a))

    def test_empty(self):
        a = ''
        self.assertEqual(None, reverse_str(a))
        self.assertEqual(None, reverse_lst(a))
        self.assertEqual(None, reverse_recursive(a))

    def test_single(self):
        a = 'a'
        self.assertEqual('a', reverse_str(a))
        self.assertEqual('a', reverse_lst(a))
        self.assertEqual('a', reverse_recursive(a))

    def test_one_word(self):
        src = 'Hello'
        dst = src[::-1]
        self.assertEqual(dst, reverse_str(src))
        self.assertEqual(dst, reverse_lst(src))
        self.assertEqual(dst, reverse_recursive(src))

if __name__ == '__main__':
    unittest.main()
