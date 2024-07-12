
public class Post {
	private int id;
	private String title;
	private String content;
	private Date pdate;
	private UserDetails user;
	
	public Post(int id,String title,String content,Date pdate,UserDetails user)
	{
		super();
		this.id=id;
		this.title=title;
		this.content=content;
		this.pdate=pdate;
		this.user=user;
		
		
	}
	public Post() {
		super();
	}

}
