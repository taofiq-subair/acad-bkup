import wikipedia

# finding the result of the search
# sentences =  2 refers to the number of line

result = wikipedia.summary("", sentences=5)

print(result)
