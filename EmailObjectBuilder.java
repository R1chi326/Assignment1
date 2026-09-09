public class EmailObjectBuilder implements EmailBuilder {
    private String to;
    private String subject;
    private String body;

    @Override
    public EmailObjectBuilder setTo(String to) {
        this.to = to;
        return this;
    }

    @Override
    public EmailObjectBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public Email getResult() {
        // Валидация состояния
        if (to == null || to.trim().isEmpty()) {
            throw new IllegalStateException("Recipient (to) is required");
        }
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalStateException("Subject is required");
        }
        return new Email(to, subject, body);
    }
}