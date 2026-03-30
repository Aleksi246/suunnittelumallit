package t12;

import java.util.*;

public class AccessControlService {
    private Map<Integer, List<String>> accessRights = new HashMap<>();
    private static AccessControlService instance;

    private AccessControlService(){}

    public static AccessControlService getInstance(){
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(int id, String username){
        List<String> list = accessRights.get(id);

        if(list != null && list.contains(username)){
            return true;
        }

        return false;
    }

    public void grantAccess(int id, String username){
        List<String> list = accessRights.get(id);

        if (list == null) {
            list = new ArrayList<>();
            accessRights.put(id, list);
        }
        list.add(username);
        
    }


}
