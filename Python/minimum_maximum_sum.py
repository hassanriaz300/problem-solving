"""
Question: Given a list of five positive integers,
find the minimum and maximum possible sums by adding
exactly four elements.
"""


def find_min_max_sum(numbers):

    total_sum = 0
    smallest = numbers[0]
    largest = numbers[0]

    for i in range(len(numbers)):

        total_sum = total_sum + numbers[i]

        if numbers[i] > largest:
            largest = numbers[i]

        if numbers[i] < smallest:
            smallest = numbers[i]

    minimum_sum = total_sum - largest
    maximum_sum = total_sum - smallest

    print(minimum_sum, maximum_sum)


find_min_max_sum([7, 2, 9, 4, 6])