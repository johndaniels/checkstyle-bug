package indentation;

public class Indentation {

  public Indentation indentation(Object... args) {
    return this;
  }

  public static void main(String[] args) {
    Indentation i = new Indentation();
    i.indentation()
        .indentation(
            "a",
            "b"
        );
  }
}