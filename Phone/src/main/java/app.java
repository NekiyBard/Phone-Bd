public class app {
    public static void main(String[] args){
        DbConnectionImpl connection = new DbConnectionImpl();
    connection.showData(connection.connect());
    }

}
