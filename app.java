public class app {
    public static void main(String[] args){
        cat myCat = new cat();
        myCat.name = "Bob";
        myCat.age = 7;

        myCat.getName();

        myCat.changeName("Truls");
        myCat.getName();
    }
}