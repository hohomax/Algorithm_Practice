package org.example.leetcode.tree.filesystem.treenode.filesystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FileSystemByList {

    //path, fileName;
    HashMap<String, List<String> > fileSystem;

    public class File{
        String filePath;
        String fileName;

        public File(String path, String fileName){
            this.filePath = path;
            this.fileName = fileName;
        }
    }

    public class Direcctorie{

        List<File> files;
        String direcctoriePath;

        public Direcctorie(){
            direcctoriePath = "/";
        }

    }


    public void mkdir(String path){


    }

    public void addFile(String path, String fileName) throws Exception {
        if(!path.contains("/"))
            throw new Exception("invalid Path");

    }


}
