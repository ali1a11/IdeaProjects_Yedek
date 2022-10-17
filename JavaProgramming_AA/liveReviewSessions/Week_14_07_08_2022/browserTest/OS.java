package Week_14_07_08_2022.browserTest;

public class OS {
    private String OS;

    public OS() {
    }

    public OS(String OS) {
        setOS(OS);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "OS{" +
                "OS='" + OS + '\'' +
                '}';
    }
}