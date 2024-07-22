package az.edu.turing.springboot04.config;

public class DBProperties {

    String url;
    String user;
    String password;

    public DBProperties(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
