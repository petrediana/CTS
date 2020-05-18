package composite;

import java.util.Collection;

public class File implements DiskElement {
    private String name;

    public File(String name) {
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
        System.out.println(name);
    }

    @Override
    public void addElement(DiskElement element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteElement(DiskElement element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<DiskElement> getElements() {
        throw new UnsupportedOperationException();
    }
}
