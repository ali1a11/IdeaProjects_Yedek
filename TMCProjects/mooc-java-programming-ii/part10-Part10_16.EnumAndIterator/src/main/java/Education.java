public enum Education {
    PHD ("Doctoral degree"),
    MA ("Masters degree"),
    BA ("Bachelors degree"),
    HS ("High School diploma");

    private String degree;
    private Education(String degree) { // constructor
        this.degree = degree;
    }


}

/* from mooc
public enum Education {

    HS, BA, MA, PHD
}
 */