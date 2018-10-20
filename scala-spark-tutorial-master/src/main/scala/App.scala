import org.apache.spark.{SparkConf, SparkContext}

object App {

  def main(args: Array[String]): Unit = {


    val list = List("veg1,veg2,veg3", "nveg1", "nveg1") // 1
    //
    //    val newList=list.flatMap(item=>item.split(","))
    //    println(newList)



    val conf = new SparkConf().setAppName("wordCounts").setMaster("local[3]")
    val sc = new SparkContext(conf)

    var rdd = sc.parallelize(list);

    val newRdd = rdd.flatMap(item => item.split(","))
    val newList = newRdd.collect();

    newList foreach println
  }

}
