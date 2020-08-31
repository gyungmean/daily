s = input()
alphabet = 'abcdefghijklmnopqrstuvwxyz'
count = []

for i in range(len(alphabet)) :
    count.append(-1)

for i in range(len(alphabet)):
    for char in s:
        if alphabet[i] == char :
            count[i] = s.index(char)
    i += 1

for i in count :
    print(i, end = ' ')