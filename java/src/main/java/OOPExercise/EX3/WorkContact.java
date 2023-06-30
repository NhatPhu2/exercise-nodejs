package OOPExercise.EX3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorkContact implements Contact{
    private List<String> listName = new ArrayList<>();
    private List<String> listPhoneNumber = new ArrayList<>();
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
        return null;
    }
}
