/**
 * Created by manuel on 16/03/2015.
 */
public class Usuario {
    private String name;
    private String last_name;
    private int age;
    private String username;
    private String password;
    public Usuario(){
        name = "";
        last_name = "";
        age = 10;
        username = "";
        password = "";
    }
    public Usuario(String n, String ln, int a, String u, String p){
        name = n;
        last_name = ln;
        age = a;
        username = u;
        password = p;
    }
    public String get_name(){
        return name;
    }
    public void set_name(String s){
        name = s;
    }
    public String get_last_name(){
        return last_name;
    }
    public void set_last_name( String s ){
        last_name = s;
    }
    public int get_age(){
        return age;
    }
    public void set_age(int n){
        age = n;
    }
    public String get_username(){
        return username;
    }
    public void set_username(String s){
        username = s;
    }
    public String get_password(){
        return password;
    }
    public void set_password(String s){
        password = s;
    }
}
