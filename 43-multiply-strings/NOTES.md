Intuition: .Recall the multiplication method in elementry mathematics, we used to
mutliply two numbers:
1 We multiplied each digit of second number with each digit of first num
taking (d1*d2)%10 to answer and (d1*d2)/10 as carry
2 If the second num have more than one digits we appended 0 before
writing the res in the second column and continued till all the digits
of 2nd num are used.
3 Finally we added all the columns in case 2nd num contains more than one
digit.
.Trick here is instead of taking carry while multiplying digit by digit
we do this step at end
.Take the example:
num1 =98, num2 = 18.
​
Step1: First we multiply each number in num1 and num2:
-> res = [9, 8+72, 64] => [9, 80, 64]
​
Step2: Then we add the carry of res[i] to res[i-1]:
-> res = [9 , 80+6, 4] = [9, 86, 4] -> [9+8, 6, 4] = [17, 6, 4]
​
Step3: Turn res to prod and then prod to string:
-> "17" + "6" + "4" = "1764"