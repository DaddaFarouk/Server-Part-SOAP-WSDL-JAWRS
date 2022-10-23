package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
// POJO (Plain Old Java Object)
@WebService(serviceName = "BankWS")
public class BankService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "amount") double mt){
        return mt*10.54;
    }
    @WebMethod
    public Account getAccount(@WebParam(name = "code")int code){
        return new Account(code, Math.random()*9888, new Date());
    }
    @WebMethod
    public List<Account> listAccounts(){
        return List.of(
                new Account(1, Math.random()*9888, new Date()),
                new Account(2, Math.random()*9888, new Date()),
                new Account(3, Math.random()*9888, new Date())
        );
    }
}
