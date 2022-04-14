package ui.sql;

import java.sql.*;

public class Sql {

    protected String uat_url = "jdbc:postgresql://10.81.8.31:5432/vaccine?prepareThreshold=0";
    protected String uat_login = "vaccine";
    protected String uat_password = "vaccine";
    protected String dev_url = "jdbc:postgresql://10.81.21.24/vaccine?prepareThreshold=0";
    protected String dev_login = "vaccine";
    protected String dev_password = "thai6aShud";
    Connection connection;

    public Sql(){

    }

    //Возвращает true или false по запросу из vc_user по oid
    public Boolean selectVcUser(ConnectionStands connectionStands, String oid) throws SQLException {
        switch(connectionStands) {
            case UAT:
                connection = DriverManager.getConnection(uat_url, uat_login, uat_password);
                break;
            case DEV:
                connection = DriverManager.getConnection(dev_url, dev_login, dev_password);
                break;
        }
        Statement statement = connection.createStatement();
        Boolean exe = statement.execute("select * from vc_user where user_id = '" + oid + "';");
        // Закрытие соединения
        connection.close();
        return exe;
    }

    //Возвращает true или false по запросу из vc_cert по oid
    public Boolean selectVcCert(ConnectionStands connectionStands, String oid) throws SQLException {
        switch(connectionStands) {
            case UAT:
                connection = DriverManager.getConnection(uat_url, uat_login, uat_password);
                break;
            case DEV:
                connection = DriverManager.getConnection(dev_url, dev_login, dev_password);
                break;
        }
        Statement statement = connection.createStatement();
        Boolean exe = statement.execute("select * from vc_cert where user_id = " + oid + ";");
        // Закрытие соединения
        connection.close();
        return exe;
    }

    //Возвращает true или false по запросу из covid_status_cert по oid
    public Boolean selectCovidStatusCert(ConnectionStands connectionStands, String oid) throws SQLException {
        switch(connectionStands) {
            case UAT:
                connection = DriverManager.getConnection(uat_url, uat_login, uat_password);
                break;
            case DEV:
                connection = DriverManager.getConnection(dev_url, dev_login, dev_password);
                break;
        }
        Statement statement = connection.createStatement();
        Boolean exe = statement.execute("select * from covid_status_cert where oid = " + oid);
        // Закрытие соединения
        connection.close();
        return exe;
    }

}

