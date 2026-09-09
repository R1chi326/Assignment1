public class Main {
    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeWelcomeEmail(objectBuilder, "student@aitu.kz");
        Email emailObject = objectBuilder.getResult();
        System.out.println("--- Object Representation ---");
        System.out.println(emailObject);

        EmailHtmlPreviewBuilder previewBuilder = new EmailHtmlPreviewBuilder();
        director.makeWelcomeEmail(previewBuilder, "student@aitu.kz");
        String htmlPreview = previewBuilder.getResult();
        System.out.println("\n--- HTML Preview Representation ---");
        System.out.println(htmlPreview);
    }
}