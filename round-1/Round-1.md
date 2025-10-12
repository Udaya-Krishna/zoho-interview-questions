Zoho interview questions

Round 2

1.  Remove duplicates from the given string. For characters, keep the
    first occurrence, and for numbers, keep the last occurrence.

Do not use additional variables to store the values.

Input: a1b2c34c3b2cb3a1d

Output: abc4231d

2.  Count the sum of frequency

Input: 1 1 2 3 4

Output:

1 -\> 9 \[2+3+4\]\
2 -\> 2 \[1+1\] \[2,3,4 occurs once. 1 occurs twice\]

Input: 1 3 2 4 1 3 5 4 4

Output:

1-\> 7

2-\> 8

3-\> 12

3.  Find the matching regex pattern

Input: xxxaabbccxyz

a+b\*c+

Output: aabbcc

4.  You are given two version strings, v1 and v2, representing software
    versions. Each version consists of numbers separated by dots. Print
    1 if version 1 is greater than version 2, if both versions are
    equal, -1 if version 1 is smaller than version 2.

Input:

v1 = \"1.01\"

v2 = \"1.001\"

Output: 0

Input:

v1 = \"1.01\"

v2 = \"1.0.1\"

Output: 1

v1 → \[1, 1, 0\] (missing part treated as 0)\
v2 → \[1, 0, 1\] At the third segment, 0 \< 1, so version 1 is greater.

5.  Given an array of numbers, rearrange the elements in a wave-like
    pattern such that:

For every pair of neighbouring numbers, the first number is greater than
the second, the next is smaller than the following, and so on.

Input: 1,2,3,4,5,6,7,9

Output: 9,1,7,2,6,3,5,4

Input: 10,20,30,40,50,60

Output: 60,10,50,20,40,30
