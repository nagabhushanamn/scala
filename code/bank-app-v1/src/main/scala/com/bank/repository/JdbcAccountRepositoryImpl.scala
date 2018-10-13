package com.bank.repository

import com.bank.BankApp.logger
import com.bank.model._;

class JdbcAccountRepositoryImpl extends AccountRepository {

  logger.info("JdbcAccountRepositoryImpl instance created...")

  def loadAccount(num: String) = {
    logger.info(s"loading account $num")
    //TODO..

    Account(num, 1000.00)
  }

  def updateAccount(account: Account) = {
    logger.info(s"updaing account ${account.num}")
    //TODO..
  }

}
