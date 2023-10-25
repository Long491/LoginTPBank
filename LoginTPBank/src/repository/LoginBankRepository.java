/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DataAccess.LoginBankDAO;
import java.util.Locale;

/**
 *
 * @author Asus
 */
public class LoginBankRepository implements ILoginBankRepository{

    @Override
    public void login(Locale language) {
        LoginBankDAO.Instance().login(language);
    }
}