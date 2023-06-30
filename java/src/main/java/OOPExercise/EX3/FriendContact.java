package OOPExercise.EX3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendContact implements Contact{
    private List<String> listName = new ArrayList<>();
    private List<String> listPhoneNumber = new ArrayList<>();
    public FriendContact() {
    }

    public FriendContact(List<String> listName, List<String> listPhoneNumber) {
        this.listName = listName;
        this.listPhoneNumber = listPhoneNumber;
    }

    @Override
    public List<String> getName() {
        return listName;
    }

    @Override
    public List<String> getPhoneNumber() {
        return listPhoneNumber;
    }

    @Override
    public Map<String, String> displayContactInfo() {
        Map<String,String> info = new HashMap<>();

        return null;
    }
}
