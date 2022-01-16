class ShapeTest {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        System.out.println(shape1.toString());

        Shape shape2 = new Shape("blue", true);
        System.out.println(shape2.toString());
        shape2.setColor("orange");
        shape2.setFilled(false);
        System.out.println(shape2.toString());

    }
}
