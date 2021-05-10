package homework1day5.core;

import homework1day5.google.Auth;

public class GoogleAuthAdapter implements GoogleAuth{
	public void LoginWithGoole(){
        Auth auth = new Auth();
        auth.login();
    }
}