import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple3;

public class CsvFileReader {

    public static void main(String[] args) throws Exception {

        // 获取执行环境
        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        while (true){
        // 读取csv 文件
        DataSet<Tuple3<String,Integer,String>> csvDS = env.readCsvFile("C:\\Users\\wanghuan\\Desktop\\Flink-IIOT\\src\\main\\resources\\data.csv")
                .includeFields("111").ignoreInvalidLines()
                .ignoreFirstLine()
                .lineDelimiter("\n")
                .fieldDelimiter(",")
                .types(String.class,Integer.class,String.class);

        csvDS.print();
        // 每隔几秒读取一次数据
            Thread.sleep(3000);
        }
    }
}
