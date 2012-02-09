package com.brightedu.model.edu;

import java.io.Serializable;
import java.util.Date;

public class BankAccount extends BankAccountKey implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.bank_account.account
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column edu.bank_account.register_date
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private Date register_date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table edu.bank_account
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.bank_account.account
     *
     * @return the value of edu.bank_account.account
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.bank_account.account
     *
     * @param account the value for edu.bank_account.account
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column edu.bank_account.register_date
     *
     * @return the value of edu.bank_account.register_date
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public Date getRegister_date() {
        return register_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column edu.bank_account.register_date
     *
     * @param register_date the value for edu.bank_account.register_date
     *
     * @mbggenerated Thu Feb 09 18:11:26 CST 2012
     */
    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }
}