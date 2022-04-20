class BinaryNode:
    def __init__(self, value, left=None, right=None):
        self.data = value
        self.left = left
        self.right = right

class TernaryNode:
    def __init__(self, value, left=None, center=None, right=None):
        self.data = value
        self.left = left
        self.right = right
        self.center = center

root = BinaryNode("R", BinaryNode("C"), BinaryNode("H"))
print(root.left.data)
print(" ----------------------- ")

root = TernaryNode(4, TernaryNode(3, TernaryNode(5, TernaryNode(2)), TernaryNode(5), TernaryNode(2)), None, TernaryNode(5))

print(root.left.left.left.data)
print(" ----------------------- ")

aux = root
while aux.left != None:
    aux = aux.left

print(aux.data)
print(" ----------------------- ")
print(root.left.right.data)

print(" ----------------------- ")
root = BinaryNode("Santi", None, BinaryNode("Jesús", BinaryNode("Pedro", None, BinaryNode("Pedro"))))

print(root.right.left.right.data)