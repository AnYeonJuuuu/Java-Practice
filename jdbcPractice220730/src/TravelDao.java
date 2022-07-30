package travel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.MemberVo;
import util.JDBCTemplate;

public class TravelDao {

	// 카테고리 1 : 관광지 메소드
	public TravelVo attraction(int inputnum) throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		
		String sql = "SELECT P.PURPOSE, C.CATEGORY, TRAVEL_NAME, TRAVEL_ADDRESS FROM TRAVEL T JOIN CATEGORY C ON T.CATEGORY = C.NO JOIN PURPOSE P ON T.THEME = P.NO WHERE T.CATEGORY = ? ";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, inputnum);
		
		ResultSet rs = pstmt.executeQuery();
		
		TravelVo vo = null;
		
		if(rs.next()) {
			String purpose = rs.getString("P.PURPOSE");
			String category = rs.getString("C.CATEGORY");
			String travelName = rs.getString("TRAVEL_NAME");
			String travelAddress = rs.getString("TRAVEL_ADDRESS");
			
			vo = new TravelVo();
			vo.setPurpose(purpose);
			vo.setCategory(category);
			vo.setTravel_name(travelName);
			vo.setTravel_address(travelAddress);
			
			
		}
		
		return vo;
	
	}
	
}
