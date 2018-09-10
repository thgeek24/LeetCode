package Algorithm;

/**
 * @author taohong on 03/09/2018
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isTwoSymm(root.left, root.right);
    }

    private boolean isTwoSymm(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null) {
            return false;
        } else if (right == null) {
            return false;
        } else if (left.val != right.val) {
            return false;
        } else {
            return isTwoSymm(left.left, right.right) && isTwoSymm(left.right, right.left);
        }
    }

    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(2);

        TreeNode tn1 = new TreeNode(1);
        tn1.left = new TreeNode(2);
        tn1.right = new TreeNode(3);

        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(tn.left.left));
        System.out.println(st.isSymmetric(tn));
        System.out.println(st.isSymmetric(tn1));
    }
}
