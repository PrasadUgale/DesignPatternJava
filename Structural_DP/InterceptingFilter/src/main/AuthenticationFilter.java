package main;

public class AuthenticationFilter implements Filter {
    public void execute(String request){
        System.out.println("Authenticating Request:" + request);
    }
}
