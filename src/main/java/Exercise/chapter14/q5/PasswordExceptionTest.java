package exercise.chapter14.q5;

public class PasswordExceptionTest {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }
        else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상 입니다.");
        }
        else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }
        this.password = password;
    }

    public static void main(String[] args) {
        PasswordExceptionTest test = new PasswordExceptionTest();

        String password = null;
        try{
            test.setPassword(password);
            System.out.println("비밀번호는 null일 수 없습니다");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";
        try{
            test.setPassword(password);
            System.out.println("비밀번호는 5자 이상 입니다");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde";
        try{
            test.setPassword(password);
            System.out.println("비밀번호는 숫자나 특수문자를 포함해야 합니다");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde1";
        try{
            test.setPassword(password);
            System.out.println("정상 비밀번호 입니다.");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
