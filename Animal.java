public class Animal {

    public String getBirdSound(){
        return "tweet!!";
    }
    public String getDefaultSound(){
        return "meaaw!!";
    }

    public static void main(String[] args){
        String firstArgument = args[0];
        if(firstArgument.equalsIgnoreCase("chat"))
            System.out.println("mieww!!");
        else
            System.out.println("tweet!!");

    }
}
