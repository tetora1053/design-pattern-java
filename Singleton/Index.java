class Index
{
    public static void main(String args[]) {
        Owl identified_obj_1 = Owl.getInstance();
        identified_obj_1.setName("Tetora");
        System.out.println(identified_obj_1.getName());

        Owl identified_obj_2 = Owl.getInstance();
        System.out.println(identified_obj_2.getName());

        identified_obj_2.setAge(3);
        System.out.println(identified_obj_2.getAge());
        System.out.println(identified_obj_1.getAge());
    }
}