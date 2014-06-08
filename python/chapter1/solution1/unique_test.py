#!/usr/bin/env python

import unittest
from unique import *

class TestUnique(unittest.TestCase):
    def test_unique_dict(self):
        str = "abcde"
        self.assertEqual(True, is_unique_dict(str))

        str = ""
        self.assertEqual(True, is_unique_dict(str))

        str = "a"
        self.assertEqual(True, is_unique_dict(str))

        str = "aaa"
        self.assertEqual(False, is_unique_dict(str))

    def test_unique_bit(self):
        str = "abcde"
        self.assertEqual(True, is_unique_bit(str))

        str = ""
        self.assertEqual(True, is_unique_bit(str))

        str = "a"
        self.assertEqual(True, is_unique_bit(str))

        str = "aaa"
        self.assertEqual(False, is_unique_bit(str))

    def test_unique_set(self):
        str = "abcde"
        self.assertEqual(True, is_unique_set(str))

        str = ""
        self.assertEqual(True, is_unique_set(str))

        str = "a"
        self.assertEqual(True, is_unique_set(str))

        str = "aaa"
        self.assertEqual(False, is_unique_set(str))


if __name__ == '__main__':
    unittest.main()
