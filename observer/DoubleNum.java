class DoubleNum extends Observer {
    private float num;
    public DoubleNum(Subject subject) {
        subject.registObserver(this);
    }

    public void update(float num) {
        this.num = num * 2;
        System.out.println(this.num);
    }
}