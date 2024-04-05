package org.example.leetcode.tree.filesystem.treenode;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Serialize_and_Deserialize_Binary_Tree {


    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public static void main(String args[]){

         //Codec ser = new Codec();
         // deser = new Codec();
         //TreeNode ans = deser.deserialize(ser.serialize(root));
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {



            if(root == null)
                return null;
            else{
                Queue<TreeNode> treeNodeQueue = new LinkedList<>();
                treeNodeQueue.add(root);
                String result = makeCode(treeNodeQueue);

                return result;
            }

        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {

            return null;

        }

        public String makeCode(Queue<TreeNode> tree){

            return null;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
}
