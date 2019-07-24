package ncs.memberList.controller;

import java.io.IOException;

@WebServlet("/ncstest/memberRegister.do")
public class NcsMemberListCtrl extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public NcsMemberListCtrl() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			// *** (요구사항9) ncstest_member 테이블에 입력된 모든 회원정보가 보여지도록 하시오 *** //
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
