public class EmailHtmlPreviewBuilder implements EmailBuilder {
    private String to = "";
    private String subject = "";
    private String body = "";

    @Override
    public EmailHtmlPreviewBuilder setTo(String to) {
        this.to = to;
        return this;
    }

    @Override
    public EmailHtmlPreviewBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailHtmlPreviewBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public String getResult() {
        return "<div class='email-preview'>\n" +
               "  <p><b>To:</b> " + to + "</p>\n" +
               "  <p><b>Subject:</b> " + subject + "</p>\n" +
               "  <hr/>\n" +
               "  <div>" + body + "</div>\n" +
               "</div>";
    }
}