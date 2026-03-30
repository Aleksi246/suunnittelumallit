package t13;

public class File implements FileSystemElement{
    private String name;
    private int size; //bytes

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }
    public int getSize(){
        return this.size;
    }

    @Override
    public void accept(FileSystemVisitor visitor){
        visitor.visit(this);
    }
}
