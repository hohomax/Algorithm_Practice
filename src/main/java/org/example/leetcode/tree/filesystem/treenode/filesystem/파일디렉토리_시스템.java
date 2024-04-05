package org.example.leetcode.tree.filesystem.treenode.filesystem;

public class 파일디렉토리_시스템 {

    public static void main(String[] args) throws Exception {


        /*

        FileSystemByList fileSystemByList = new FileSystemByList();
        fileSystemByList.mkdir("/a");
        fileSystemByList.ls("/a");
        fileSystemByList.addFile("/a/b", "abc.text");
        */


        FileSystemNode fileSystemNode = new FileSystemNode();

        fileSystemNode.addFile("/a/b", "abc.text");
        fileSystemNode.ls("/");
        fileSystemNode.ls("a/b");

    }


}
