package t13;

public class Main {
    public static void main(String[] args) {
    
        Directory home = new Directory("home");
        Directory videos = new Directory("videos");
        Directory documents = new Directory("documents");
        Directory secretDocuments = new Directory("secretDocuments");
        File video1 = new File("video1.mp4", 1000);
        File video2 = new File("video2.mp4", 2000);
        File document1 = new File("document1.txt", 100);
        File document2 = new File("document2.txt", 200);
        File secretDocument1 = new File("secretDocument1.txt", 300);
        
        videos.add(video1);
        videos.add(video2);
        documents.add(document1);
        documents.add(document2);
        secretDocuments.add(secretDocument1);
        
        home.add(videos);
        home.add(documents);
        documents.add(secretDocuments);

        SearchVisitor searchVisitor = new SearchVisitor("secret");
        home.accept(searchVisitor);
        System.out.println(searchVisitor.getFiles());

        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        home.accept(sizeCalculatorVisitor);
        System.out.println("Total size of home: " + sizeCalculatorVisitor.getTotalSize());

        SizeCalculatorVisitor sizeCalculatorVisitor2 = new SizeCalculatorVisitor();
        documents.accept(sizeCalculatorVisitor2);
        System.out.println("Total size of documents: " + sizeCalculatorVisitor2.getTotalSize());

    }
}
