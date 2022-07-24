class Solution:
    def reverseWords(self, s: str) -> str:
        return " ".join([i for i in s.strip().split(" ")[::-1] if i != ""])
        