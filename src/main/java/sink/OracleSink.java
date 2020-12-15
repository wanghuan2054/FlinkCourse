package sink;/*
package sink;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import SocketWindowWordCount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleSink extends RichSinkFunction<SocketWindowWordCount.WordWithCount> {
    private Connection connection;
    private PreparedStatement statement;

    // 1,初始化
    @Override
    public void open(Configuration parameters) throws Exception
    {
        super.open(parameters);
        Class.forName("oracle.jdbc.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@XX.XX.XX.XX:1521:mdwtst", "XX", "XX");
        statement = connection.prepareStatement("INSERT INTO Test VALUES (?,?)");
    }

    // 2,执行
    @Override
    public void invoke(SocketWindowWordCount.WordWithCount value, Context context) throws Exception
    {
        System.out.println("value.toString()-------" + value.toString());
        statement.setString(1, value.word);
        statement.setString(2, String.valueOf(value.count));
        statement.execute();
    }

    // 3,关闭
    @Override
    public void close() throws Exception
    {
        super.close();
        if (statement != null)
            statement.close();
        if (connection != null)
            connection.close();
    }

}
*/
