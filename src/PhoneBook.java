import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();


    public void addContact(String fullName, String number) {
        if (phoneBook.containsKey(fullName)) System.out.println("Контакт с таким именем уже существует");
        else if (phoneBook.containsValue(number)) System.out.println("Контакт с таким номером уже существует");
        else phoneBook.put(fullName, number);
    }

    public void randomFilling(int quantity) {
        for (int i = 0; i < quantity; i++) {
            this.addContact(RandomName.getRandomFullName(), RandomPhoneNumber.getRandomPhoneNumber());
        }
    }

    @Override
    public String toString() {
        String text = "";
        for (String k : phoneBook.keySet()) {
            text = text + k + " " + phoneBook.get(k) + "\n";
        }
        return text;
    }
}
