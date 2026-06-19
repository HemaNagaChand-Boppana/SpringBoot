package com.naga_chand.Springboot_beginner.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.naga_chand.Springboot_beginner.models.User;

@Service
public class UserService {
    private List<User> allUsers;
    private int curId = 3;

    public UserService(){
        allUsers = new ArrayList<>();
        allUsers.add(new User(1,"John Doe","Male","/images/john.png"));
        allUsers.add(new User(2,"Jane Doe","Female","/images/jane.png"));
    }

    public List<User> getAllUsers(){
        return allUsers;
    }

    public User getUserById(int id){
        for(int i=0;i<allUsers.size(); i++){
            if(allUsers.get(i).getId()==id)
                return allUsers.get(i);
        }
        return null;
    }

    public User addNewUser(User user){
        user.setId(curId);
        curId++;
        allUsers.add(user);
        return user;
    }

    public User updateUser(User user){
        User u = null;
        for(int i=0;i<allUsers.size();i++){
            if(user.getId()==allUsers.get(i).getId()){
                u = allUsers.get(i);
                u.setName(user.getName());
                u.setGender(user.getGender());
                u.setImage(user.getImage());
            }
        }
        return u;
    }

    public User deleteUserById(int id){
        User u = null;
        for(int i=0;i<allUsers.size();i++){
            if(allUsers.get(i).getId()==id){
                u = allUsers.get(i);
                allUsers.remove(i);
                break;
            }
        }
        return u;
    }
}
