interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {
    @Override
    public void parentMethod() {
        // Implement parentMethod
    }

    @Override
    public void childMethod() {
        // Implement childMethod
    }
}
