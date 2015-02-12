package com.epam.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epam.model.Assigment;
import com.epam.model.Employee;
import com.epam.model.Member;
import com.epam.model.Project;
import com.epam.service.ActivityService;
import com.epam.service.AssigmentService;
import com.epam.service.EmployeeService;
import com.epam.service.ProjectService;

@Controller
public class IssueController {
	
	
	//private boolean checkUser = true;

	private EmployeeService employeeService;
	private ActivityService activityService;
	private AssigmentService assigmentService;
	private ProjectService projectServece;

	@Autowired(required = true)
	@Qualifier(value = "employeeService")
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Autowired(required = true)
	@Qualifier(value = "activityService")
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	@Autowired(required = true)
	@Qualifier(value = "assigmentService")
	public void setAssigmentService(AssigmentService assigmentService) {
		this.assigmentService = assigmentService;
	}

	@Autowired(required = true)
	@Qualifier(value = "projectService")
	public void setProjectService(ProjectService projectService) {
		this.projectServece = projectService;
	}

//	@RequestMapping("/authentication")
//	public ModelAndView getRegisterForm(
//			@ModelAttribute("employee") Employee employee, BindingResult result) {
//		Map<String, String> model = new HashMap<String, String>();
//		if (!checkUser) {
//			model.put("text", "That username doesn't seem right. Try again?");
//		} else {
//			model.put("text", "Enter your Details");
//		}
//		return new ModelAndView("Register", model);
//	}

	@RequestMapping("/systemDashboard")
	public ModelAndView getSystemDashBoardForm() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = ((UserDetails)principal).getUsername();
		Collection<? extends GrantedAuthority> other = ((UserDetails)principal).getAuthorities();
		if (other.equals("ROLE_ADMIN")){
			System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		}
		
		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("activity", activityService.getActivity());
		model.put("userInfoFirstName", employeeService.getFirstName(username));
		model.put("userInfoLastName", employeeService.getLastName(username));
		model.put("activity", activityService.getActivityCount());
		model.put("assigment", assigmentService.getAssigment());
		model.put("projectName", projectServece.getProjectName());
		model.put("person", employeeService.getPerson());
		return new ModelAndView("SystemDashboard", model);
	}

//	@RequestMapping("/authenticationUser")
//	public ModelAndView saveUserData(
//			@ModelAttribute("employee") Employee employee, BindingResult result) {
//		
//		
//		// userService.addUser(user);
//		checkUser = employeeService.checkUser(employee.getLogin(),
//				employee.getPassWord());
//		if (checkUser == true) {
//			System.out.println("OK");
//			return new ModelAndView("redirect:/systemDashboard.html");
//		} else {
//			System.out.println("NO");
//			return new ModelAndView("redirect:/authentication.html");
//		}
//	}

//	@RequestMapping("/userList")
//	public ModelAndView getUserList() {
//		System.out.println("this is user list");
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("employee", employeeService.getEmployee());
//		return new ModelAndView("UserDetails", model);
//	}

	// break point
	@RequestMapping(value = "/createIssue")
	public ModelAndView createIssue(HttpServletRequest req) {
		System.out.println("this is create Issue");
		System.out.println("description = " + req.getParameter("description"));
		System.out.println("projectName = " + req.getParameter("projectName"));
		System.out.println("Person = " + req.getParameter("person"));
		return new ModelAndView("redirect:/systemDashboard.html");
	}

	@RequestMapping("/search")
	public ModelAndView getSearchIssue(HttpServletRequest req) {
		String assignee =  req.getParameter("assignee");
		String status = req.getParameter("status");
		String project = req.getParameter("project");
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("projectName", projectServece.getProjectName());
		model.put("person", employeeService.getPerson());
		model.put("search", assigmentService.getAllAssigment(assignee, status, project));
		System.out.println("status = " + status);
		System.out.println("Project = " + project);
		System.out.println("assignee = " + assignee);
		return new ModelAndView("Search", model);
	}
	
//	@RequestMapping("/project")
//	public ModelAndView getSearchProject(HttpServletRequest req) {
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("projectName", projectServece.getProjectName());
//		model.put("person", employeeService.getPerson());
//		return new ModelAndView("Project", model);
//	}
	
//	@RequestMapping("/add_activity")
//	public ModelAndView addActivity(HttpServletRequest req) {
//		Map<String, Object> model = new HashMap<String, Object>();
//		model.put("activity", activityService.getActivityCount());
//		model.put("assigment", assigmentService.getAssigment());
//		return new ModelAndView("SystemDashboard", model);
//	}
	
	
	@RequestMapping("/current_project")
	public ModelAndView getCurrentProject(HttpServletRequest req) {
		String name = req.getParameter("name");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("projectName", projectServece.getProjectName());
		model.put("person", employeeService.getPerson());
		System.out.println("this is project assignee to = " + name);
		System.out.println(" this is currebt project controler");
		return new ModelAndView("CurrentProject", model);
	}
	
	
	//----------------------------------------------------------

}
