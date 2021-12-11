import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        String myGender = null;
        String myFirstname = "Foo";
        String myLastName = "Bar";
        String myEmail = "foobar@mail.com";
        String myPhone = null;

        ContactDO contactDO = ContactDO.builder()
                .gender(myGender)
                .firstName(myFirstname)
                .lastName(myLastName)
                .email(myEmail)
                .phone(myPhone)
                .build();

        contactDO.exportAsHtml();
    }
}