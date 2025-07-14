class OverloadExample {
    void show() {
        System.out.println("No parameters");
    }

    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double b) {
        System.out.println("Double: " + b);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.show();
        obj.show(10);
        obj.show(12.5);
        obj.show("Hello");
    }
}
