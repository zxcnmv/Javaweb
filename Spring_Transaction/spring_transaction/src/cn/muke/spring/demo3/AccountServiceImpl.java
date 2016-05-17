package cn.muke.spring.demo3;


/*
 * ת��ҵ���߼�ʵ����
 * */
public class AccountServiceImpl implements AccountService {

	//ע��ת��DAOʵ����Ľӿ�
	private AccountDAO accountDAO;
	
    public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
    

	/**
     * @param out     :ת���ʺ�
     * @param in      :ת���ʺ�
     * @param money   :ת�˽��
     * */
	@Override
	public void transfer( String out, String in, Double money) {
		
		accountDAO.outMoney(out, money);
		int i = 1/0;
		accountDAO.inMoney(in, money);
		
		
	}

}