package com.example.OnlineRetailerManagement.Controllers;

import java.security.Principal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.OnlineRetailerManagement.Model.Doorassembly;
import com.example.OnlineRetailerManagement.Model.Doorframe;
import com.example.OnlineRetailerManagement.Model.Doorhanding;
import com.example.OnlineRetailerManagement.Model.Doorheight;
import com.example.OnlineRetailerManagement.Model.Doorpaneltype;
import com.example.OnlineRetailerManagement.Model.Doorunitfinish;
import com.example.OnlineRetailerManagement.Model.Doorwidth;
import com.example.OnlineRetailerManagement.Model.Dummyitems;
import com.example.OnlineRetailerManagement.Model.Manufacturer;
import com.example.OnlineRetailerManagement.Model.UserRole;
import com.example.OnlineRetailerManagement.Model.Userclass;
import com.example.OnlineRetailerManagement.Repositories.DoorAssemblyRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorFrameRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorFrameThicknessRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorGlassCoatingRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorGlassThicknessRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorGlassTypeRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorHandingRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorHandleColorRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorHandleRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorHeightRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorLockRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorPanelTypeRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorTypeRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorUnitFinishRepository;
import com.example.OnlineRetailerManagement.Repositories.DoorWidthRepository;
import com.example.OnlineRetailerManagement.Repositories.PredrillRepository;
import com.example.OnlineRetailerManagement.Repositories.RoleDao;
import com.example.OnlineRetailerManagement.Repositories.UserDao;

@Controller
public class DoorController {
	@Autowired
	private DoorTypeRepository doortyperepository;
	@Autowired
	private DoorFrameRepository doorframerepository;
	@Autowired
	private DoorWidthRepository doorwidthrepository;
	@Autowired
	private DoorHeightRepository doorheightrepository;
	@Autowired
	private DoorPanelTypeRepository doorpaneltyperepository;
	@Autowired
	private DoorHandingRepository doorhandingrepository ;
	@Autowired
	private DoorAssemblyRepository doorassemblyrepository;
	@Autowired
	private DoorUnitFinishRepository doorunitfinishrepository;
	@Autowired
	private DoorGlassTypeRepository doorglasstyperepository;
	@Autowired
	private DoorGlassCoatingRepository doorglasscoatingrepository;
	@Autowired
	private DoorGlassThicknessRepository doorglassthicknessrepository;
	@Autowired
	private DoorHandleRepository doorhandlerepository;
	@Autowired
	private DoorHandleColorRepository doorhandlecolorrepository;
	@Autowired
	private DoorLockRepository doorlockrepository;
	@Autowired
	private DoorFrameThicknessRepository doorframethicknessrepository;
	@Autowired
	private PredrillRepository predrillrepository;
	@Autowired
	private Dummyitems dummyitems;
	@Autowired
	private RoleDao roleDao;
	@Autowired
	private UserDao userDao;	
	@Autowired
	private Manufacturer manufacturer;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;	
	static Long userId = 0l;
	@RequestMapping("/")
	public String home(Model model) {
		System.out.print("index");
		return "redirect:/login";
	}
	@RequestMapping("/login")
	public String login(){
	return "login";
	}
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signup(Model model, @RequestParam(value="person",required=false) String person){
		Userclass userclass=new Userclass();
		
		System.out.println("person is " + person);
		model.addAttribute("person",person);
		model.addAttribute("user",userclass);
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(@ModelAttribute("user") Userclass userclass,@RequestParam(value="person", required = false) String person) {
		System.out.println(" v person is " + person);
		System.out.println(userclass.toString());
		userclass.setPassword(passwordEncoder.encode(userclass.getPassword()));
		Set<UserRole> userroles = new HashSet<>();
		if(userDao.findmaxuserid() == null) userId=1l;
		else userId=userId+1;			
		userclass.setId(userId);
		if(userId ==1)
			userroles.add(new UserRole(userId,userclass,roleDao.findByName("ROLE_ADMIN")));
		else			
			userroles.add(new UserRole(userId,userclass,roleDao.findByName("ROLE_USER")));
		userclass.getUserroles().addAll(userroles);
		userDao.save(userclass);
		if(!person.equals("manufacturer"))
		return "manufacturer";
		else
			return "redirect:/login";
	}
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request,Model model,Principal principal) {
		return "welcome";
	}
	@RequestMapping("/welcomesubmit")
	public String welcomesubmit(HttpServletRequest request,Model model,Principal principal) {
		System.out.println(principal.getName());
		String person = userDao.findPersonName(principal.getName());
		System.out.println("person in welcome submit"+person);
		if(person.length()==0) return "manufacturer";
		else
		return person;
	}
	/*@RequestMapping("/manufacturer")
	public String manufacturer(HttpServletRequest request,Model model,Principal principal) {
		return "manufacturerlogin";
	}*/
	@RequestMapping("/manufacturerproducts")
	public String manufacturerproducts(HttpServletRequest request,Model model,Principal principal) {
		return "manufacturerproducts";
	}
	@RequestMapping("/distributorlogin")
	public String distributor(HttpServletRequest request,Model model,Principal principal) {
		return "distributorlogin";
	}
	@RequestMapping("/products")
	public String home(HttpServletRequest request,Model model,Principal principal) {
		System.out.println(principal.getName());
		System.out.print("sdfsdfkjvv");
		request.setAttribute("doortypes",doortyperepository.findAll());
		return "doortype";
	}
	
	@GetMapping(value="/doorframe/{id}")
	public String screen(HttpServletRequest request,@PathVariable long id ) {
		dummyitems.setDoortypeid(id);
		List<Doorframe> doorframes = doorframerepository.findBydoorframename(id);
		System.out.print(doorframes);
		request.setAttribute("doorframes",doorframes);
			return "doorframe";
	}

	@GetMapping("/doorwidth/{doorframeid}")
	public String doorwidth(HttpServletRequest request,@PathVariable long doorframeid){
		long doortypepropid= dummyitems.getDoortypeid();
		dummyitems.setDoorframeid(doorframeid);
		List<Doorwidth> doorwidths = doorwidthrepository.findBydoorwidth(doortypepropid,doorframeid);		
		request.setAttribute("doorwidths",doorwidths);
		System.out.print(doorwidths);
			return "doorwidth";
	}
	@GetMapping("/doorheight/{doorwidthid}")
	public String doorheight(HttpServletRequest request,@PathVariable long doorwidthid){
		long doortypepropid= dummyitems.getDoortypeid();
		long doorframeid = dummyitems.getDoorframeid();
		dummyitems.setDoorwidthid(doorwidthid);
		List<Doorheight> doorheights = doorheightrepository.findBydoorheight(doortypepropid,doorframeid,doorwidthid);
		request.setAttribute("doorheights",doorheights);
		System.out.print(doorheights);
			return "doorheight";
	}
	@GetMapping("/doorpanel/{doorheightid}")
	public String doorpanel(HttpServletRequest request,@PathVariable long doorheightid) {
		dummyitems.setDoorheightid(doorheightid);
		long doortypepropid= dummyitems.getDoortypeid();
		long doorframeid = dummyitems.getDoorframeid();
		long doorwidthid = dummyitems.getDoorwidthid();
		/*String doortypename= doortyperepository.findBydoortype(dummyitems.getDoortypeid());
		String doorframename = doorframerepository.findBydoorframe(dummyitems.getDoorframeid());
		Long doorwidth = doorwidthrepository.finddoorwidth(dummyitems.getDoorwidthid());
		Long doorheight = doorheightrepository.findBydoorheight(dummyitems.getDoorheightid());
		String orderitemstring = doortypename + doorframename+doorwidth+doorheight;
		System.out.print(doortypename+doorframename+doorwidth+doorheight);
		return "order";*/
		List<Doorpaneltype> doorpanels = doorpaneltyperepository.findBydoorpanel(doortypepropid,doorframeid,doorwidthid,doorheightid);
		request.setAttribute("doorpanels",doorpanels);
		return "doorpanel";
	}
	@GetMapping("/doorhanding/{doorpanelid}")
	public String doorhanding(HttpServletRequest request,@PathVariable long doorpanelid) {
		dummyitems.setDoorheightid(doorpanelid);
		long doortypepropid= dummyitems.getDoortypeid();
		long doorframeid = dummyitems.getDoorframeid();
		long doorwidthid = dummyitems.getDoorwidthid();
		long doorheightid = dummyitems.getDoorheightid();
		List<Doorhanding> doorhandings = doorhandingrepository.findBydoorhanding(doortypepropid,doorframeid,doorwidthid,doorheightid, doorpanelid);
		request.setAttribute("doorhandings",doorhandings);
		return "doorhanding";
	}
	@GetMapping("/doorassembly/{doorhandingid}")
	public String doorassembly(HttpServletRequest request,@PathVariable long doorhandingid) {
		dummyitems.setDoorhandingid(doorhandingid);
		long doortypepropid= dummyitems.getDoortypeid();
		long doorframeid = dummyitems.getDoorframeid();
		long doorwidthid = dummyitems.getDoorwidthid();
		long doorheightid = dummyitems.getDoorheightid();
		long doorpanelid = dummyitems.getDoorpanelid();
		List<Doorassembly> doorassemblies = doorassemblyrepository.findBydoorassembly(doortypepropid,doorframeid,doorwidthid,doorheightid, doorpanelid,doorhandingid);
		request.setAttribute("doorassemblies",doorassemblies);
		return "doorassembly";
	}
	@GetMapping("/doorunitfinish/{doorassemblyid}")
	public String order(HttpServletRequest request,@PathVariable long doorassemblyid) {
		dummyitems.setDoorheightid(doorassemblyid);
		long doortypepropid= dummyitems.getDoortypeid();
		long doorframeid = dummyitems.getDoorframeid();
		long doorwidthid = dummyitems.getDoorwidthid();
		long doorheightid = dummyitems.getDoorheightid();
		long doorpanelid = dummyitems.getDoorpanelid();
		long doorhandingid = dummyitems.getDoorhandingid();
		List<Doorunitfinish> doorunitfinishes = doorunitfinishrepository.findBydoorunitfinish(doortypepropid,doorframeid,doorwidthid,doorheightid, doorpanelid, doorhandingid,doorassemblyid);
		request.setAttribute("doorunitfinishes",doorunitfinishes);
		return "doorunitfinish";
	}
}
