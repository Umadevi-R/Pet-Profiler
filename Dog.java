public class Dog extends Pet{

    public Dog(String someName,int someAge) {
        super(someName,someAge,7);
    }
    @Override public String selfDescribe(){
        return "Fun dog looking to make friends! "+super.selfDescribe();
    }

}