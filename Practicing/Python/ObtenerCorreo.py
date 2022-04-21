import re

str = "Pleas contact info@sololearn.com for assistance"

pattern = "([\w\.-]+)@([\w\.-]+)(\.[\w\.]+)"

match = re.search(pattern, str)

print(match.group())