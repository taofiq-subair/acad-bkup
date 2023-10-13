import re

# pattern = re.compile('ab')
# # matcher = re.finditer('ab', 'abaababa')
# count = 0
# matcher = pattern.finditer('alaba is gay')
# print(matcher)

# for match in matcher:
#   # print(match, 'matcher')
#   count += 1

#   print(match.start(), '...', match.end(), '...', match.group())
# print('number of occurence is', count)

# matcher = re.findall('\s', '@abjkk8ad ')
# print(matcher)
# for a in matcher:
#     print(a)
#     print(a.start(),'...', a.group())

# print('++++++++')
# print('++++++++')

# matcher2 = re.finditer("[a-zA-Z0-9]", "@abjkk8adZ")
# for a in matcher2:
#     print(a.start(),'...', a.group())

# print('++++++++')

# matcher3 = re.finditer("\W", "@abj kk8adZ")
# for a in matcher3:
#     print(a.start(),'...', a.group())

# print('++++++++')

# matcher4 = re.finditer(".", "@abj jkk 8adZ")
# for a in matcher4:
#     print(a.start(),'...', a.group())

# print('++++++++')

# matcher5 = re.finditer("\d", "@abj jkk 8adZ99 097")
# for a in matcher5:
#     print(a.start(),'...', a.group())

# matcher6 = re.finditer("a*", "aaabbabbabbbab")
# for a in matcher6:
#     print(a.start(),'...', a.group())

# mail = input('Enter your mail: ')

# matcher6 = re.finditer("t\w+\\.\w+@\w+\\.\w{3}", mail)
# for a in matcher6:
#   print(a.start(),'...', a.end(),'...', a.group())

# patt = input("enter your search pattern: ")

# m  = re.search(patt, 'abaaaba')
# print(m)
# if m != None:
#     print("Match is available")
#     print("First occurence of match with start: ", m.start()," and end index at: ", m.end())

# l = re.findall('\d', "ain5nn3n233b33")
# print(l)

# same as sub
# s = re.subn( '[a-b]','+', 'cbub,3uby,b4b,b44')
# print(s)

# t = re.split(',', 'cbub,3uby,b4b,b44')
# print(t)

ss = input("enter a valid gmail: ")

m = re.fullmatch("\w[a-zA-Z0-9_.]*@gmail[.]com", ss)


if m != None:
    print('Valid email!', m)
else:
    print('invalid mail')
