package com.bank

import com.bank.service.TxrServiceImpl
import org.apache.log4j.Logger

object BankApp {

  val logger = Logger.getLogger("bank")

  def main(args: Array[String]): Unit = {

    logger.info("started..")

    println("-" * 50)
    // Init-phase  ==> keep all components are ready to serve
    //------------------------------------------------------------
    var txrService = new TxrServiceImpl();
    //------------------------------------------------------------
    println("-" * 50)


    println("-" * 50)
    // Use-phase  ==> react to requests
    //------------------------------------------------------------

    // #req-1
    txrService.txr(100.00, "1", "2")
    println()
    //req-2
    txrService.txr(100.00, "2", "1")

    println("-" * 50)
    //------------------------------------------------------------
    println("-" * 50)

    println("-" * 50)
    // destroy-phase  ==> clean properly before end
    //------------------------------------------------------------

    //..

    //------------------------------------------------------------
    println("-" * 50)

    logger.info("finished..")

  }

}
