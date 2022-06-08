Explanation:
The problem statement is a bit deceptive, which is why I suspect there are more thumbs downs and thumb ups.
Because the problem states that the string contains only as or only bs, if it is not a palindrome, we can remove all as or all bs, leaving only the other character.
​
So if it is a palindrome, we only need 1 operation to empty the string. Otherwise, we need 2 operations.
​
Then it simplifies the problem to simply check if the gien string is a palindrome. If a given string is the same backwards then it is forwards, then it is a palindrome, and we can check this easily using StringBuilder to check if the string reversed is the same forwards (or insert your chosen way of reversing string).