package OOPExercise.EX3;

import java.util.List;
import java.util.Map;

public interface Contact {
    List<String> getName();
    List<String> getPhoneNumber();
    Map<String,String> displayContactInfo();
}
