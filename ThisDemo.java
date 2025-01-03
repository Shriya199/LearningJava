class ahx{
    int q;
    void display(){
        System.out.println("New keyword");
    }
     void show(){
        this.display();

    }
}
public class ThisDemo{
    public static void main(String[] args){
        ahx y = new ahx();
        y.show();
    }

}