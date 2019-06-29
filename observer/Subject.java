import java.util.ArrayList;
class Subject {
    private ArrayList observers;
    private float num;
    public Subject() {
        observers = new ArrayList();
    }

    public void registObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void setNum(float num) {
        this.num = num;
        notifyObservers();
    }

    private void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer o = (Observer)observers.get(i);
            o.update(num);
        }
    }
}