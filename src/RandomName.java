import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class RandomName {
    private static final List<String> maleName = new ArrayList<>(
            List.of("Дмитрий",
                    "Владимир",
                    "Алексей",
                    "Александр",
                    "Игорь",
                    "Евгений",
                    "Геннадий",
                    "Константин",
                    "Анатолий",
                    "Петр"));

    private static final List<String> femaleName = new ArrayList<>(
            List.of(
            "Светлана",
            "Инна",
            "Мария",
            "Ольга",
            "Наталья",
            "Галина",
            "Евгения",
            "Анна",
            "Ксения",
            "Надежда"));

    private static final List<String> surname = new ArrayList<>(
            List.of(
            "Смирнов",
            "Иванов",
            "Кузнецов",
            "Соколов",
            "Попов",
            "Лебедев",
            "Козлов",
            "Новиков",
            "Морозов",
            "Петров",
            "Волков",
            "Соловьёв",
            "Васильев",
            "Зайцев",
            "Павлов",
            "Семёнов",
            "Голубев",
            "Виноградов",
            "Богданов",
            "Воробьёв",
            "Фёдоров",
            "Михайлов",
            "Беляев",
            "Тарасов",
            "Белов",
            "Комаров",
            "Орлов",
            "Киселёв",
            "Макаров",
            "Андреев",
            "Ковалёв",
            "Ильин",
            "Гусев",
            "Титов",
            "Кузьмин",
            "Кудрявцев",
            "Баранов",
            "Куликов",
            "Алексеев",
            "Степанов"));

    public static String getRandomName() {
        Random random = new Random();
        int gender = random.nextInt(2);
        if (gender == 0) return maleName.get(random.nextInt(maleName.size()));
        else return femaleName.get(random.nextInt(femaleName.size()));
    }
    public static String getRandomSurname() {
        Random random = new Random();
        int gender = random.nextInt(2);
        if (gender == 0) return surname.get(random.nextInt(surname.size()));
        else return surname.get(random.nextInt(surname.size())) + "а";
    }

    public static String getRandomFullName() {
        Random random = new Random();
        int gender = random.nextInt(2);
        if (gender == 0) return maleName.get(random.nextInt(maleName.size())) + " " + surname.get(random.nextInt(surname.size()));
        else return femaleName.get(random.nextInt(femaleName.size())) + " " + surname.get(random.nextInt(surname.size())) + "а";
    }

}
