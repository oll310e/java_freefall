public class cat {
    int age;
    String name;

    public String getName(){
        System.out.println(name);
        return name;
    }

    public void changeName(String newName){
        name = newName;
    }
}
