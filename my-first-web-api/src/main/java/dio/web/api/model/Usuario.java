package dio.web.api.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;
    public Usuario( String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassoword() {
        return password;
    }
    public void setPassoword(String passoword) {
        this.password = passoword;
    }
}
