package com.bank.service

import com.bank.BankApp.logger
import com.bank.repository._
import com.bank.model._


/*

  design & performance issues
  ------------------------------

  


 */

class TxrServiceImpl {

  logger.info("TxrServiceImpl instance created..")

  def txr(amount: Double, fromAccNum: String, toAccNum: String) = {

    logger.info("Txr initiated...")

    val accountRepository = new JdbcAccountRepositoryImpl()

    //  load from & to accounts
    val fromAccount = accountRepository.loadAccount(fromAccNum)
    val toAccount = accountRepository.loadAccount(toAccNum)

    // debit & credit
    val debitedFromAccount = fromAccount.copy(balance = fromAccount.balance - amount)
    val creditedToAccount = toAccount.copy(balance = toAccount.balance + amount)

    // update both accounts
    accountRepository.updateAccount(debitedFromAccount)
    accountRepository.updateAccount(creditedToAccount)

    logger.info("Txr success...")

  }

}
