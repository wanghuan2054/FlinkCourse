package stream
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

object FileStreamingSource {

  def main(args: Array[String]): Unit = {

    val env = StreamExecutionEnvironment.getExecutionEnvironment;
    val inputPath = "D:\\Users\\10024908\\workspace\\FlinkLearning\\src\\main\\resources\\1.xlsx";
    val stream = env.readTextFile(inputPath) ;
    stream.print();
    env.execute("file source streaming test");
  }
}