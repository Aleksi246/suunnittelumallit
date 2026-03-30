package t13;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }
    @Override
    public void visit(Directory directory) {
        // Calculate size of the directory
        for (FileSystemElement element : directory.getDirectory()) {
            element.accept(this);
        }
    }
    public int getTotalSize() {
        return totalSize;
    } 

    
}
