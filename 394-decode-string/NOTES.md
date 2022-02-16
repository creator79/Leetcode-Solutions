Intuition :
1) If string does not have inner substring like this 3[a5[cd]] then it can be solved easily (simple iteration)
2) In some cases, we can have inner sub string as I mentioned above then it is best to solve with stack. Solve inner substring first.(Iterative approach)
3) Insert the character in stack until you find ']' char
4) If you find ']' char then pop the character until you find '[', This is how you can get the substring.
5) Remove the '[' character
6) Find the number k, number can be in single digit, two digits, .. so on.
7) Put back the substring k times in stack
8) Atlast take the result in one char array because stack format will not in string format.
9) return the result
​