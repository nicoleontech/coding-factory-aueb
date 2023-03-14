package gr.aueb.cf.ch18.clientserver;

public class EchoClient {

    public static void main(String[] args) {
        EchoServer echoServer = new EchoServer();
        String request = "Hello Coding Factory";
        String response;

        System.out.println("Request: " + request);
        response = echoServer.echo(request);
        System.out.println(response);
    }
}
