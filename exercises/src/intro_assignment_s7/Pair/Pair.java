package intro_assignment_s7.Pair;

public class Pair <A, B> {
    private A aContent;
    private B bContent;

    public Pair(A aContent, B bContent) {
        this.aContent = aContent;
        this.bContent = bContent;
    }

    public A getaContent() {
        return aContent;
    }

    public B getbContent() {
        return bContent;
    }

    public Pair<B, A> swap() {
        return new Pair<>(bContent, aContent);
    }
}