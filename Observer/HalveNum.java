class HalveNum extends Observer {
    private float num;
    public HalveNum(Subject subject) {
        subject.registObserver(this);
    }

    public void update(float num) {
        this.num = num / 2;
        System.out.println(this.num);
    }
}