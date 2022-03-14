public class Animal {

    public static String getBirdSound(){
        return "tweet!!";
    }
    public static String getChatSound(){
        return "meaaw!!";

    }
    public static String getDefaultSound(){
        return "hello!!";
    }

    public static void main(String[] args){
        String firstArgument = args[0];
        String output = "";
        if(firstArgument.equalsIgnoreCase("bird"))
            output = getBirdSound();
        else if(firstArgument.equalsIgnoreCase("chat"))
            output = getChatSound();
        else
            output = getDefaultSound();

        System.out.println(output);

    }
}
