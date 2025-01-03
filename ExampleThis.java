class xyz {
    int i ;

    public void setValue(int x) {
        i = x;
    }
    public void show(){
        System.out.println(i);
    }
}
class ExampleThis{
    public static void main(String[] args){
        xyz t = new xyz();
        t.setValue(10);
        t.show();
        

    }

}