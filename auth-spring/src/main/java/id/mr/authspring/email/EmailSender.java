package id.mr.authspring.email;

public interface EmailSender {
    void send(String to, String email);
}
