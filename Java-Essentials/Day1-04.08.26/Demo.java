// class Demo{
//     public static void main(){
//         System.out.println("Hello World!");
//     }
// }

/*
    Passing no arguement inside the main fn. is also running the code properly.
 */

//--------------------------------------------------------------------------------------------------------------------------------------

public class Demo{
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}

/*
    The "(String[] args)" part in the arguement of the main function :----
    * it is for taking arguements(multiple) and storing all of them in the String array.
    * and then, they can all be accessed via args[0], args[1] etc. indices.
 */