package advanced;

public class JavaSingletonPattern {

    static JavaSingletonPattern instance;
    private JavaSingletonPattern(){}
    public String str;

    public static JavaSingletonPattern getSingleInstance(){
        if (instance == null){
            return new JavaSingletonPattern();
        }
        return instance;
    }
}
