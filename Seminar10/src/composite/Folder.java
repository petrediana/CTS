package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Folder implements DiskElement {
    private String name;
    private Collection<DiskElement> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (DiskElement e : elements) {
            e.print();
        }
    }

    @Override
    public void addElement(DiskElement element) {
        elements.add(element);
    }

    @Override
    public void deleteElement(DiskElement element) {
        elements.remove(element);
    }

    @Override
    public Collection<DiskElement> getElements() {
        return elements;
    }
}
