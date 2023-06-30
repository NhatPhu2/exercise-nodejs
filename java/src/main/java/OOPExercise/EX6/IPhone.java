package OOPExercise.EX6;

import java.util.ArrayList;
import java.util.List;

public class IPhone {
    List<Photo> photos;

    public IPhone() {
    }

    void airdrop(IPhone other, String id) {
        Photo pho = new Photo();
        for (Photo pt : photos) {
            if (pt.getId().equals(id))
                pho.setId(pt.getId());
        }
        other.setPhotos(new ArrayList<>(List.of(pho)));
    }

    public IPhone(List<Photo> photos) {
        this.photos = photos;
    }

    public String getPhotos() {
        return photos.get(0).getId();
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
