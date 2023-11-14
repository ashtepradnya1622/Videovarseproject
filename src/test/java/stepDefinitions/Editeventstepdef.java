package stepDefinitions;

import object.Editevent;
import object.Login;

public class Editeventstepdef {
    Login login;
    Editevent editevent;
    public Editeventstepdef(Login login, Editevent editevent ) {
        this.editevent  = editevent;
        this.login = login;
    }
}
