package org.example.leetcode.tree.filesystem.treenode.filesystem;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


public class FileSystem {

    private Node root;

    class Node{
        TreeMap<String, Node> children = new TreeMap<>();
        String val;
        String content;

        public Node(String val, String content){
            this.val =val;
            this.content =content;

        }
    }

    // 디렉토리 보여주는 메소드
    public static String ls(String path){

        return null;
    }




}
