package org.example.leetcode.tree.filesystem.treenode.filesystem;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;


public class FileSystemNode {

    private List<String> files;
    private String currentPath;
    private TreeNode parent;
    private List<TreeNode> child;

    public FileSystemNode(){
        files = new ArrayList<>();
        parent =  null;
        child = null;
    }


    // 디렉토리 보여주는 메소드
    public String ls(String path){

        return null;
    }


    public void addFile(String path, String fileName) throws Exception {

        if(!path.contains("/"))
            throw new Exception("invalid Path");

        currentPath = path;
        files.add(fileName);


    }


}
