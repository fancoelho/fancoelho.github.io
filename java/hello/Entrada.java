package hello;

public class Entrada {

    private final long id;
    private final String content;

    public Entrada(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
