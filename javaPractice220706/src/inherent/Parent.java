package inherent;

public class Parent {
	
	int age =45;
    String name ="Parent";
    
    public Parent(){
        System.out.println("Parent Default Constructor");
    }
    public void Parent(int _age,String _name){
        age=_age;
        name=_name;
        System.out.println("Parent Constructor");
    }
    public void showInfo(){
        System.out.println("Name:"+name+", age:"+age);
    }

}
