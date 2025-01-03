class implementation{
    int q;
    public void setValue(int q){
        this.q= q;
    }
    public void show(){
        System.out.println(q);
    }
}
public class NewThis {
    public static void main(String[] args){
        implementation test = new implementation();
        test.setValue(24);
        test.show();
    }
}
