package pr04_Тelephony;

import pr04_Тelephony.interfaces.Browsavable;
import pr04_Тelephony.interfaces.Callavable;

public class Phone implements Callavable, Browsavable {

    private static final String MODEL = "Smartphone";

    @Override
    public void brows(String site) {
        if (isValidSite(site)) {
            System.out.println("Browsing: " + site + "!");
        } else {
            System.out.println("Invalid URL!");
        }
    }

    @Override
    public void call(String phone) {
        if (this.isValidPhone(phone)) {
            System.out.println("Calling... " + phone);
        } else {
            System.out.println("Invalid number!");
        }
    }

    private boolean isValidSite(String site) {
        for (int i = 0; i < site.length(); i++) {
            if (Character.isDigit(site.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidPhone(String phone) {
        try {
            Double.parseDouble(phone);
            return true;

        } catch (Exception ex) {
            return false;
        }
    }
}

