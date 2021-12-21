package Chapter6;

interface Message{
    public String getTitle();
    public String getMessage();
    public String getTypeMessage();
    public String printMessage();
}

class TextMessage implements Message{
    private String title;
    private String body;
    private String type;

    public TextMessage(String title, String body, String type) {
        this.title = title;
        this.body = body;
        this.type = type;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.body;
    }

    @Override
    public String getTypeMessage() {
        return this.type;
    }

    @Override
    public String printMessage() {
        return ("Title: " + this.title + "\nMessage: " + this.body + "\nType: " + this.type);
    }
}

class BinaryMessage implements Message{
    private String title;
    private String message;
    private String type;

    public BinaryMessage(String title, String message, String type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public String getTypeMessage() {
        return this.type;
    }

    @Override
    public String printMessage() {
        return ("Title: " + this.title + "\nMessage Binary: " + this.message +
                "\nType: " + this.type);
    }

    public void print(){
        System.out.println("Title: " + this.title + "\nMessage Binary: " + this.message +
                "\nType: " + this.type);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage("Message Title", "Message Body",
                "text");
        System.out.println(textMessage.printMessage());

        BinaryMessage binaryMessage = new BinaryMessage("Binary Message Title",
                "10101010101010000000", "binary");
        System.out.println(binaryMessage.printMessage());
        binaryMessage.print();
    }
}
