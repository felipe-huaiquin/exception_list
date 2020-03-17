import java.util.ArrayList;
public class ClassCastException{
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("3");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        for(int i = 0; i < myList.size();i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
            }catch (Exception e){
                System.out.println("ERROR!!!!. The error was found in the index:"+i+". The value that triggered the error was: "+myList.get(i));
            }
        }


    }
}