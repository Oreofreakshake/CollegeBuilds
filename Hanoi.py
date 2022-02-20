def hanoi(nDisks, start, end):
    if nDisks == 1:
        return f"{start} moved to {end}\n"

    else:
        middle = 6 - (start + end)
        output1 = hanoi(nDisks - 1, start, middle)
        output2 = f"{start} moved to {end}\n"
        output3 = hanoi(nDisks - 1, middle, end)

        return output1 + output2 + output3


print(hanoi(3, 1, 3))
