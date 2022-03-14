public class Animal {

    //comment on git functionality
    public static String getBirdSound(){
        return "Tweet!!";
    }
    public static String getDefaultSound(){
        return "hello!!";
    }

    public static void main(String[] args){
        String firstArgument = args[0];
        String output = "";
        if(firstArgument.equalsIgnoreCase("bird"))
            output = getBirdSound();
        else
            output = getDefaultSound();
        System.out.println(output);

    }
}
