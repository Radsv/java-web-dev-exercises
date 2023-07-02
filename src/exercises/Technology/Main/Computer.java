package exercises.Technology.Main;

public class Computer extends AbstractEntity{
    // computer is my parent class

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean getIsHasKeyboard() {
        return hasKeyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }


}