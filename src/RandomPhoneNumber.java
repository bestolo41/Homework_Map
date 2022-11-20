import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class RandomPhoneNumber {
    private static final List<String> phoneCode = new ArrayList<>(
            List.of(
                    "987",
                    "903",
                    "917",
                    "905",
                    "960",
                    "999",
                    "912",
                    "915",
                    "916",
                    "966"
            )
    );

    public static String getRandomPhoneNumber() {
        Random random = new Random();
        return "+7 (" + phoneCode.get(random.nextInt(phoneCode.size())) + ") " + Integer.toString(random.nextInt(999)) + "-" + Integer.toString(random.nextInt(99)) + "-" + Integer.toString(random.nextInt(99));
    }

}
