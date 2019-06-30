class observertest {
    public static void main(String args[]) {
        Subject subject = new Subject();
        Observer double_num  = new DoubleNum(subject);
        Observer halve_num  = new HalveNum(subject);
        subject.setNum(3);
    }
}