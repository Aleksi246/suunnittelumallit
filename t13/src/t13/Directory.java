package t13;

import java.util.*;

public class Directory implements FileSystemElement{
    private String name;
    private List<FileSystemElement> folder = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public List<FileSystemElement> getDirectory(){
        return this.folder;
    }
    
    public void add(FileSystemElement element){
        this.folder.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}

