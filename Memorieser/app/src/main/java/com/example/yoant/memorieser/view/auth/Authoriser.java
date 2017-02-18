package com.example.yoant.memorieser.view.auth;

public class Authoriser {

    //TODO Those parameters are tmp and must be deactivated and deleted before release.
    private final String ADMIN_LOGIN = "admin",
                         ADMIN_PASSWORD = "admin";

    private Authoriser() {
    }

    private static class AuthoriserSingletoneHolder {
        static final Authoriser HOLDER_INSTANCE = new Authoriser();
    }

    public static Authoriser getInstance() {
        return AuthoriserSingletoneHolder.HOLDER_INSTANCE;
    }

    //TODO Realise support of database login-password pair and and checkForCorrectness
    public boolean checkCorrectnessLoginPasswordPair(String login, String password){
        if(login.equals(ADMIN_LOGIN))
            if(password.equals(ADMIN_PASSWORD))
                return true;
        return false;
    }

}
