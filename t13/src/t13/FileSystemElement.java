package t13;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
