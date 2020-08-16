public abstract class AbstractClassDemo {
    public void display() {
        System.out.println("Display");
    }

    public abstract void displayAbs();
}

class child extends AbstractClassDemo {

    @Override
    public void displayAbs() {
        
    }
}