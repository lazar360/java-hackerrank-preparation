package objectorientedprogramming_exercises;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String title) {
        this.title = title;
    }
}


public class JavaAbstractClass {
    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        myBook.setTitle("A tale of two cities");
        System.out.println("The title is: "+myBook.getTitle());
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    MyBook myBook = new MyBook();
    myBook.setTitle(bufferedReader.readLine());
    System.out.println("The title is: "+myBook.getTitle());
         */
    }
}
