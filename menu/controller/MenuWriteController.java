package com.kh.cook.menu.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.kh.cook.bobstory.controller.FileUploader;
import com.kh.cook.member.vo.MemberVo;
import com.kh.cook.menu.service.MenuService;
import com.kh.cook.menu.vo.MenuAttachmentVo;
import com.kh.cook.menu.vo.MenuCateVo;
import com.kh.cook.menu.vo.MenuVo;
import com.kh.cook.product.vo.ProductVo;
@WebServlet(urlPatterns = "/menu/write")

@MultipartConfig(
//		location = "/khtmp",
		fileSizeThreshold = 1024 * 1024 ,
		//파일 한 개 자체의 사이즈(기억할 것 1)
		maxFileSize = 1024 * 1024 * 50,
		//리퀘스트 총 크기(기억할 것 2)
		maxRequestSize = 1024 * 1024 * 50 * 5
	)
public class MenuWriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s = req.getSession();
		
		MemberVo loginMember = (MemberVo)s.getAttribute("loginMember");
		

			List<MenuCateVo> cateList = new MenuService().selectMenuCateList();
			String result = new MenuService().menuNum();
			

			
			//새로운 메뉴 넘버
			req.setAttribute("result", result);
			//메뉴 카테고리
			req.setAttribute("MenuCateList", cateList);
			//넘버로 바꿔서 입력
//		req.setAttribute("changeInput", changeInput);
			
			req.getRequestDispatcher("/views/menu/menuWrite.jsp").forward(req, resp);
		
//		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s = req.getSession();
		
//		MemberVo loginMember = (MemberVo)s.getAttribute("loginMember");
		
		String menuCate = req.getParameter("menuCate");
		String reName = req.getParameter("re-name");
		String reInfo = req.getParameter("re-info");
		String cal = req.getParameter("cal");
		String content = req.getParameter("content");
		String writeProd = req.getParameter("write-prod");

		Part f = req.getPart("f");
		
		MenuAttachmentVo menuAttachmentVo = null;
		
		//사진 일단 보류..
		String rootPath = req.getServletContext().getRealPath("/");
		if(f.getSubmittedFileName().length() > 0) {
			// req.getServletContext().getRealPath("/") <- 최상단 경로
			menuAttachmentVo = MenuFileUploader.uploadFile(f, rootPath);
			
		}
		
		
		MenuVo menuVo = new MenuVo();
		menuVo.setMenuCateNo(menuCate);
		menuVo.setMenuName(reName);
		menuVo.setMenuInfo(reInfo);
		menuVo.setCal(cal);
		menuVo.setRecipe(content);
		menuVo.setMenuCateNo(writeProd);

		
		int result = new MenuService().menuWrite(menuVo, menuAttachmentVo);
		
		if(result == 1) {
			s.setAttribute("alerMsg", "레시피 등록 완료!");
			resp.sendRedirect("/cookTeacher/views/menu/recipe_cate.jsp");
		}else {
			if( menuAttachmentVo != null) {
				String savePath = rootPath + menuAttachmentVo.getFilePath() + "/" + menuAttachmentVo.getChangeName();
				new File(savePath).delete();
			}
			System.out.println("네 글쓰기 오류임다^^");
		}
	
	}
}
