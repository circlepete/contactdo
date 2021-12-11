import lombok.Builder;
import org.apache.commons.lang3.StringUtils;

@Builder
public class ContactDO {
    static final String HTML_BREAK = "<br>";
    static final String BLANK_SPACE = " ";
    String gender;
    String firstName;
    String lastName;
    String email;
    String phone;

    protected String exportAsHtml() {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotBlank(gender)) {
            sb.append("Gender: ")
            .append(gender);
        }
        if ((StringUtils.isNotBlank(firstName) || StringUtils.isNotBlank(lastName)) && StringUtils.isNotBlank(gender)) {
            sb.append(HTML_BREAK);
        }
        if (StringUtils.isNotBlank(firstName)) {
            sb.append(firstName);
        }
        if (StringUtils.isNotBlank(firstName) && StringUtils.isNotBlank(lastName)) {
            sb.append(BLANK_SPACE);
        }
        if (StringUtils.isNotBlank(lastName)) {
            sb.append(lastName);
        }
        if (StringUtils.isNotBlank(email)) {
            sb.append(HTML_BREAK)
                    .append(email);
        }
        if (StringUtils.isNotBlank(phone)) {
            sb.append(HTML_BREAK)
                    .append(phone);
        }

        System.out.println("HTML export:\n" + sb.toString());

        return sb.toString();
    }
}
