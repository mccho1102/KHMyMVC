package ncs.memberList.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ncstest/memberRegister.do")
public class NcsMemberRegisterCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NcsMemberRegisterCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getMethod();
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String birthday = request.getParameter("birthday");
		String gender = request.getParameter("gender");
		
					

		if("GET".equalsIgnoreCase(method)) {
		 // *** (요구사항2) /WEB-INF/ncstestMember/memberRegister.jsp 
		 // 페이지가 보여지도록 작성하시오. *** //
		
			
		}

		else {
		MemberVO mvo = new MemberVO();
								
		mvo.setUserId(userId);
		mvo.setUserName(userName);
		mvo.setBirthday(birthday);
		mvo.setGender(Integer.parseInt(gender));
					
		try {	
		
		int result = dao.memberRegister(mvo);
		if(result==1)
		response.sendRedirect("memberList.do");

		} catch (SQLException e) {
		e.printStackTrace();
		
		// 요구사항 7. 답안
		request.setAttribute("errorMsg", "SQL문 장애발생으로 데이터 입력 실패함!!");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ncstestMember/error.jsp"); 
		dispatcher.forward(request, response);

		}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
