# Question:
# Given a positive integer n, print a right-aligned
# triangle using stars (*).

def print_triangle(n):

    for i in range(1, n + 1):

        for j in range(n - i):
            print(" ", end="")

        for k in range(i):
            print("*", end="")

        print()


print_triangle(4)