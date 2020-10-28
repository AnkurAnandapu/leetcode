public class GoodNodes {

    int count = 0;

    public int goodNodes(TreeNode root) {
        goodNodes(root, root.val);
        return count;
    }

    public void goodNodes(TreeNode node, int previousValue) {
        if (node == null) {
            return;
        }
        if (previousValue <= node.val) {
            count++;
        }
        goodNodes(node.left, Math.max(previousValue, node.val));
        goodNodes(node.right, Math.max(previousValue, node.val));
    }
}