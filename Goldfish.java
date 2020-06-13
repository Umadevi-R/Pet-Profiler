public class Goldfish extends Pet{
  
    public Goldfish(String someName,int someAge) {
        
        super(someName,someAge);
    }
    @Override public String selfDescribe(){
        return "Hello, my name is "+name+". I am a goldfish and I am "+age+" year(s) old. I swim around and nap all day!";
    }
 }
