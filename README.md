# Poker

A well-known casino wants to improve its shaky financial position by installing a new model of the slot machines "Poker" of improved design.
A poker player needs to collect 5 cards in such a way that among them there is a maximum number of coinciding (the best combination - all five cards coincide, and the worst - all are different).
Unfortunately, the casino chief programmer recently suddenly become rich, retired and left the Bahamas.
Without he, the casino can not decide how to determine the size of the client's winnings from the set of cards that have fallen out.
Help the casino cope with this task.


# Input format
The program receives 5 positive integers x1, x2, x3, x4, x5.
The random number selection function is welcome.

# Output Format
The program should display the following lines:
### Table
Output | Explanation
------------ | -------------
poker | if all 5 numbers are equal
four of a kind | if exactly 4 numbers are equal to each other
full house | if three of the five numbers are equal to each other and the two remaining numbers are equal
three of a kind | if exactly three numbers are equal
two pairs | if there are two pairs of equal numbers
one pair | if only two numbers are equal
all different | if all numbers are different

# Example
Input | Output
------------ | -------------
7 3 7 7 3|full house
1000 999 998 997 996|all different
1 5 2 5 5|three of a kind
1 1 1 1 1|poker

# The Olympic Challenge
## Test 1
![Test 1](/image/test1.jpg)
## Test 2
![Test 2](/image/test2.jpg)