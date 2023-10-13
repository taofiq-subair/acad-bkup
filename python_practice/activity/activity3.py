def sortByLength(names):
    if len(names) <= 0:
        return
##    sortedNames = []
##    buffer = names[0]
##    length = len(names)
##    while length
##    for b in buffer:
##        for a in names:
##            if b <= a:
    sortedNames = sorted(names, key = lambda x : len(x))
    return sortedNames            
         
        
     
a = ['adadd','dd','d','efeefefef','eee','t']
print(a)
print(a)

print(sortByLength(a))


def empInitials(listOfEmp):
    dic = {}
    for a in listOfEmp:
        s = a.split()
        dic[f"{s[0][0]}.{s[1][0]}"] = a
    return dic
lll = ['Taofiq Subair', 'Jimoh Sule', 'Sarah Jennings']



print(empInitials(['Taofiq Subair']))
