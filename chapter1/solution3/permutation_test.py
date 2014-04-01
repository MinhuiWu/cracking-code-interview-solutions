#!/usr/bin/env python

import unittest
from permutation import *

class TestPermutation(unittest.TestCase):
    def test_none(self):
        s = None
        t = None
        self.assertEqual(False, is_permutation_dict(s, t))
        self.assertEqual(False, is_permutation_sorted(s, t))

    def test_empty(self):
        s = ''
        t = ''
        self.assertEqual(False, is_permutation_dict(s, t))
        self.assertEqual(False, is_permutation_sorted(s, t))

    def test_same_len(self):
        s = 'abc'
        t = 'def'
        self.assertEqual(False, is_permutation_dict(s, t))
        self.assertEqual(False, is_permutation_sorted(s, t))

    def test_diff_len(self):
        s = 'abcd'
        t = 'abc'
        self.assertEqual(False, is_permutation_dict(s, t))
        self.assertEqual(False, is_permutation_sorted(s, t))

    def test_same(self):
        s = 'abc'
        t = 'cba'
        self.assertEqual(True, is_permutation_dict(s, t))
        self.assertEqual(True, is_permutation_sorted(s, t))


if __name__ == '__main__':
    unittest.main()
