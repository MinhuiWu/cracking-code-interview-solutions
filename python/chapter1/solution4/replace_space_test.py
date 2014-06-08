#!/usr/bin/env python

import unittest
from replace_space import *

class TestReplaceSpace(unittest.TestCase):
    def test_none(self):
        a = 'abcde'
        self.assertEqual(a, replace_space(a))
        self.assertEqual(a, replace_spaces(a))

    def test_spaces(self):
        a = 'Hello Mr John '
        target = 'Hello%20Mr%20John%20'
        self.assertEqual(target, replace_space(a))
        self.assertEqual(target, replace_spaces(a))


if __name__ == '__main__':
    unittest.main()
