package t13;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor{
    private List<String> files = new ArrayList<>();
    private String search;

    public SearchVisitor(String search){
        this.search = search;
    }

    @Override
    public void visit(File file) {
        if(file.getName().contains(this.search)){
            files.add(file.getName());
        }
    }
    @Override
    public void visit(Directory directory) {
        if(directory.getName().contains(this.search)){
            files.add(directory.getName());
        }  
        for (FileSystemElement element : directory.getDirectory()) {
            element.accept(this);
        }
 
    }

    public List<String> getFiles(){
        return files;
    }
}
