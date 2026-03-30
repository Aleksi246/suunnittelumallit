package t12;

import java.util.Date;

public interface DocumentInterface {
    int getId();
    Date getDate();
    String getContent(User user);
}
