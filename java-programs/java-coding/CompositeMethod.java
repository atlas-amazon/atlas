
import java.util.*;

interface FileSystemComponent {
    void showDetails();
}
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("File: " + name);
    }
}

class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.doc");

        Folder folder1 = new Folder("Documents");
        folder1.addComponent(file1);
        folder1.addComponent(file2);

        Folder folder2 = new Folder("Work");
        folder2.addComponent(file3);
        folder2.addComponent(folder1); // folder inside folder

        folder2.showDetails();
    }
}