package homework1day5.business.concretes;

import homework1day5.business.abstracts.UserService;
import homework1day5.dataAccess.abstracts.UserDao;
import homework1day5.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    UserDao userDao;
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    
    List<String> error = new ArrayList<String >();
    @Override
    public Object add(User user) {
        error = new ArrayList<>();
        this.CheckPasswordIsValid(user.getPassword());
        this.CheckFirstNameIsValid(user.getFirstName());
        this.CheckLastNameIsValid(user.getLastName());
        this.CheckEmailIsCorrect(user.geteMail());
        this.CheckEmailIsUsedBefore(user.geteMail());

        if(error.size() > 0){
            for (var error : error){
                System.out.println(error);
            }
            return false;
        }
        this.sendEmail(user);
        userDao.add(user);
        return true;
    }

	@Override
    public void delete(User user) {
        error = new ArrayList<>();
        this.CheckEmailIsUsedBefore(user.geteMail());
        if(error.size() == 0){
            System.out.println("Kullan�c� mevcut de�ildir.");
        }
        userDao.delete(user);
        System.out.println("Silinen kullan�c�:  "+user.geteMail());
    }

    @Override
    public User getByEmail(String email) {
        var user =this.userDao.getByEmail(email);
        if(user == null){
            error.add("Bu e-postaya sahip kullan�c� mevcut de�ildir.");
        }
        return (User) user;

    }

	@Override
    public void sendEmail(User user) {
        System.out.println("Ba�ar�yla g�nderilen e-posta:  "+user.geteMail());
    }

    private void CheckEmailIsUsedBefore(String email){
        var user =this.userDao.getByEmail(email);
        if(user != null){
            error.add("Bu e-Mail daha �nceden kullan�lm��t�r.");
        }
    }
    private void CheckEmailIsCorrect(String email){
        String EMAILPATTERN = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(EMAILPATTERN,    Pattern.CASE_INSENSITIVE);
        if(!pattern.matcher(email).find()){
            error.add("Bu e-Mail do�ru de�ildir.");
        }
    }

    private void CheckPasswordIsValid(String password){
        if(password.length() < 6){
            error.add("�ifreniz en az 6 karakterden fazla olmal�d�r.");
        }
    }
    private void CheckFirstNameIsValid(String firstName){
        if(firstName.length() < 2){
            error.add( "Ad�n�z en az 2 karakterden fazla olmal�d�r.");
        }
    }

    private void CheckLastNameIsValid(String lastName){
        if(lastName.length() < 2){
            error.add("S en az 2 karakterden fazla olmal�d�r.");
        }
    }


}
