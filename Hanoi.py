def hanoi(nDisks, fromRod, toRod):
    if nDisks ==1:
        return f"{nDisks} moved to {toRod}\n"
    else:
        middleRod = 6 - (fromRod+toRod)
        



print(hanoi(3, 1 ,3))
