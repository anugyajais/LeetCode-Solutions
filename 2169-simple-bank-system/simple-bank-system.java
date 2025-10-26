class Bank {
    private long balance[];
    public Bank(long[] balance) {
       
        this.balance = balance.clone();
    }
    public boolean isvalid(int account){
        return account>=1 && account<=balance.length;
    }
    public boolean transfer(int account1, int account2, long money) {
        if(!isvalid(account1) || !isvalid(account2)){
            return false;
        }
        if(withdraw(account1 , money)){
            deposit(account2, money);
        }
        else{
            return false;
        }
        return true;

    }
    public boolean deposit(int account, long money) {
        if(!isvalid(account)) return false;
        balance[account-1] += money;
        
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isvalid(account))return false;
        if(balance[account-1] <money) return false;
        balance[account-1]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */