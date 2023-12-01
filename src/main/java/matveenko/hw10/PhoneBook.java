package matveenko.hw10;

import java.util.Objects;
import java.util.Optional;

class PhoneBook {
    private static final String[] PHONE_BOOK = new String[3];

    public static void main(String[] args) {
        PHONE_BOOK[0] = "016/161616";
        PHONE_BOOK[1] = "016/161617";
        PHONE_BOOK[2] = "016/161618";
        Optional<Integer> optional = findIndexByPhoneNumber("016/16161");
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println(Optional.empty());
        }
    }


    public static Optional<Integer> findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < PHONE_BOOK.length; i++) {
            if (Objects.equals(PHONE_BOOK[i],phoneNumber)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();

    }
}
