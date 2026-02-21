package egovframework.egovtest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import egovframework.egovtest.service.TestService;
import egovframework.egovtest.vo.UserVO;

@Controller
@RequestMapping(value = "/egov")
public class EgovController {
	
    @Resource(name = "testService")
    private TestService testService;

    @RequestMapping(value = "/")
    public String root() {
        return "redirect:index.do"; 
    }

    @RequestMapping(value = "index")
    public ModelAndView index(HttpSession session) throws Exception {
        ModelAndView mav = new ModelAndView("egov/index");
        UserVO loginUser = (UserVO) session.getAttribute("loginUser");
        
        mav.addObject("loginUser", loginUser);
        return mav;
    }

    @RequestMapping(value = "login.do")
    public String login(UserVO userVO, HttpSession session) throws Exception {
        UserVO resultVO = testService.getUserVO(userVO); 
        
        if (resultVO != null) {
            session.setAttribute("loginUser", resultVO);
        } else {
            session.removeAttribute("loginUser"); 
        }
        
        return "redirect:/egov/";
    }
    

    @RequestMapping(value = "logout.do")
    public String logout(UserVO userVO, HttpSession session) throws Exception {
    	session.removeAttribute("loginUser"); 
        return "redirect:/egov/";
    }
}
