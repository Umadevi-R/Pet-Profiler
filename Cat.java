
public class Cat extends Pet{
   
    public Cat(String someName,int someAge) {
       
        super(someName,someAge,8);
        
    }
    @Override public String selfDescribe(){
        return "Fun cat ready to party! "+super.selfDescribe();
    }
   
}
