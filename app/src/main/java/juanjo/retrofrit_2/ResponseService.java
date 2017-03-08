package juanjo.retrofrit_2;

public class ResponseService {

    private int id;
    private String name;
    private String lastName;
    private String nickName;

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseService() {
    }

    /**
     *
     * @param id
     * @param lastName
     * @param nickName
     * @param name
     */
    public ResponseService(int id, String name, String lastName, String nickName) {
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}