package easymall.po;

import java.sql.Timestamp;

public class Orders {

	public Orders() {
		super();
	}
	
	public Orders(String id, String receiverinfo, Integer paystate, Timestamp ordertime, Integer user_id) {
		super();
		this.id = id;
		this.receiverinfo = receiverinfo;
		this.paystate = paystate;
		this.ordertime = ordertime;
		this.user_id = user_id;
	}
	
	
	private String id;
	private Double money;
	private String receiverinfo;
	private Integer paystate;
	private Timestamp ordertime ;
	private Integer user_id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getReceiverinfo() {
		return receiverinfo;
	}

	public void setReceiverinfo(String receiverinfo) {
		this.receiverinfo = receiverinfo;
	}

	public Integer getPaystate() {
		return paystate;
	}

	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}

	public Timestamp getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", money=" + money + ", receiverinfo=" + receiverinfo + ", paystate=" + paystate
				+ ", ordertime=" + ordertime + ", user_id=" + user_id + "]";
	}
	
	
}


