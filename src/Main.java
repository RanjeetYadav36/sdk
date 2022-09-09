import novj.publ.api.NovaOpt;

public class Main {

    public static void  start(){
        NovaOpt.GetInstance().initialize(2);

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        start();


    }
}