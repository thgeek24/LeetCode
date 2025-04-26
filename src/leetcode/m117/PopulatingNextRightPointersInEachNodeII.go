package m117

type Node struct {
	Val   int
	Left  *Node
	Right *Node
	Next  *Node
}

// LeetCode 117
func connect(root *Node) *Node {
	if root == nil {
		return root
	}

	nodeMap := make(map[int]*Node)
	connectNodeMap(root, 0, &nodeMap)
	return root
}

func connectNodeMap(node *Node, layer int, nodeMap *map[int]*Node) {
	if node == nil {
		return
	}

	if curr, exist := (*nodeMap)[layer]; exist {
		curr.Next = node
		(*nodeMap)[layer] = curr.Next
	} else {
		(*nodeMap)[layer] = node
	}
	connectNodeMap(node.Left, layer+1, nodeMap)
	connectNodeMap(node.Right, layer+1, nodeMap)
}
