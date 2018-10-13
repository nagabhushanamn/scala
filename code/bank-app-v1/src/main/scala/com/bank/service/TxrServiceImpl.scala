package com.bank.service

import com.bank.BankApp.logger
import com.bank.repository._
import com.bank.model._


/*

  design & performance issues
  ------------------------------


  => tight-coupling between dependent & dependency objects
      -> cant extend our module with new features easily
  => on every txr, we are creating new dependency & discarding end of txr
      -> slow,memory/resource-use high
  => unit-testing not possible
      -> dev/bug fix slow


  why these issues are raising in this component ?

  ==> dependent-object itself created its own dependency-object


  soln:

    => don't create dependency in dependency's class, do lookup/get from factory/singleton objects

  limitation on factory lookup

    => factory-location tight-coupling

   best-soln:

    => don't create/lookup, inject by third-party  ==> IOC ( Inversion of Control )

     how to implement IOC ?

     => using dependency injection ( di )



    -------------------------------------------------------------------


    S.O.L.I.D. STANDS FOR:

    S — Single responsibility principle
    O — Open for extension, closed for modification principle
    L — Liskov substitution principle
    I — Interface/Trait segregation principle
    D — Dependency Inversion principle

    ---------------------------------------------------------------------


 */

class TxrServiceImpl(val accountRepository: AccountRepository) {

  logger.info("TxrServiceImpl instance created..")

  def txr(amount: Double, fromAccNum: String, toAccNum: String) = {

    logger.info("Txr initiated...")


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
