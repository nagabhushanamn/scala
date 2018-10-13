package com.bank.repository

import com.bank.model.Account


// API / interface / trait / contract / abstraction

trait AccountRepository {

  def loadAccount(num: String): Account
  def updateAccount(account: Account)

}
