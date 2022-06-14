package examen2.ej3;

public class User implements IUser{

    private String name;
    private boolean isOnlyVideos;

    public User(String name, boolean isOnlyVideos) {
        this.name = name;
        this.isOnlyVideos = isOnlyVideos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getUpdated(INotification notification) {
        System.out.println(name+" received: "+notification.getMsg());
    }

    @Override
    public boolean isOnlyVideos() {
        return isOnlyVideos;
    }
}
