
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PostDao {
	
	private Connection conn;
	
	public PostDao() {
		super();
		this.conn=conn;
	}
	
	public boolean AddNotes(String ti,String)
	{
		
		boolean f=false;
		
		try {
			String query="insert into post(title,content,uid) values(?,?,?)";
			
			PreparedStatement ps=conn.prepareStatement(qu);
			ps.setString(1,po.getTitle());
			ps.setString(2,po.getContent());
			ps.setInt(3, po.getUser().getId());
			
			int i=ps.executeUpdate();
			if(i==1)
			{
				f=true;
			}
		}
		
		catch (Exception e)
		{
			
		}
		
		return list;
	}
	
	public Post getDataById(int noteId)
	{
		
		Post p=null;
		try {
			String qu="select * from post where id=?";
			
			PreparedStatement ps=conn.prepareStatement(qu);
			ps.setInt(1, noteId);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				p=new Post();
				
				p.setId(rs.getInt(1));
				p.setTitle(rs.getString(2));
				p.setContent(rs.getString(3));
			}
		
		return o;
		
		
	}
		public boolean PostUpdate(int nid,String ti,String co)
		{
			
			boolean f=false;
			
			try {
				String qu="update post set title=?,content=? where id=?";
				PreparedStatement ps=conn.preparedStatement(qu);
				ps.setString(1, ti);
				ps.setString(2,co);
				ps.setInt(3,nid);
				int i=ps.executeUpdate();
				
				if(i==1)
				{
					f=true;
				}
				
				
			}
				
			}
			catch (Exception e)
			e.printStackTrace();
		}
	
	return f;
	
	

}


public boolean DeleteNotes(int nid)

{
	
	boolean f=false;
	
	try {
		
		String que="delete from post where id=?";
		PreparedStatement ps=conn.prepareStatement(qu);
		ps.setInt(1, nid);
		int x=ps.executeUpdate();
		if(x==1)
		{
			f=true;
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return f;
}
