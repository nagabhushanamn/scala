package com.sparkTutorial.rdd.collect

import org.apache.log4j.Level
import org.apache.log4j.Logger
import org.apache.spark.{SparkConf, SparkContext}

object CollectExample {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.ERROR)
    val conf = new SparkConf().setAppName("collect").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val inputWords = List("spark", "hadoop", "spark", "hive", "pig", "cassandra", "hadoop") // scala collections

    val wordRdd = sc.parallelize(inputWords) // RDD

    val words = wordRdd.collect()

    for (word <- words) println(word)
  }
}
