import re

str = "My name is David. Hi David."
pattern = r"David"

nestr = re.sub(pattern, "Amy", str)
print(nestr)