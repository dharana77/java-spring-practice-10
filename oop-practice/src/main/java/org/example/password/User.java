package org.example.password;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator){
        String password = passwordGenerator.generatePassword();

        /*
            비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() <= 12 && password.length() >= 8){
            this.password = password;
        }
    }

    public String getPassword(){
        return this.password;
    }
}
