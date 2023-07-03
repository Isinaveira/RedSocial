package org.example;

import java.util.Scanner;

public class Functionalities {

    public void addUser(){
        boolean validate = false;
        String s_validate = "";
        String user_name = "";

        while(!validate){
            System.out.println("Introduce el nombre del Usuario nuevo: ");
            Scanner sc = new Scanner(System.in);
            user_name = sc.nextLine();
            System.out.println("El nombre de usuario es: " + user_name);
            System.out.println("¿Es correcto?. Pulsa S)si N)no");
            s_validate = sc.nextLine();
            if(s_validate.equalsIgnoreCase("S")){
                validate = true;
            }
        }

    }
    public void addPost(){

    }

    public void addComment(){

    }

    public void followUser(){

    }

    public void deleteUser(){

    }

    public void deletePost(){

    }

    public void deleteComment(){

    }

    public void showUserPosts(){

    }

    public void showUserComments(){

    }

    public void showCommentsNumber(){

    }

}
