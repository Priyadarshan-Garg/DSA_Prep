package org.example.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entites.User;
import org.example.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;
    private List<User> UserList ;
    private ObjectMapper objectMapper = new ObjectMapper();
    private static final String UserPath = "E:\\Langauges\\JAVA\\Codes_I_wrote\\untitled\\src\\main\\java\\org\\example\\LocalDB\\user.json";
    public UserBookingService(User user) throws IOException {
        this.user=user;
        File users = new File(UserPath);
        UserList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }
    public boolean loginUser(){
        Optional<User> foundUser = UserList.stream().filter(user1 ->{
            return user1.getName().equals(user.equals()) && UserServiceUtil.chekPassword(user.getPassword(), user1.getHashPassword());;
        }).findFirst();
    return foundUser.isPresent();
    }
    public Boolean signUp(User user1){
        try{
            UserList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch (IOException ex){
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException{
            File userFile = new File(UserPath);
            objectMapper.writeValue(userFile,UserList);
    }
    public void fetchBooking(){
        user.printTickets();
    }
    public boolean cancelTicket(String TicketId){
        user.getTicketsBooked().remove(TicketId);
        return false;
    }


}
