package com.zeus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zeus.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@RequestMapping(value="/registerAjaxForm", method=RequestMethod.GET)
	public String registerAjaxForm() {
		log.info("registerAjaxForm");
		return "registerAjaxForm";
	}
	
	/* home 설정
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		//info 레벨의 로그를 출력한다.
		log.info("환영합니다. 클라이언트 지역은 " + locale + "입니다.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcome() {
		//미리 정의된 메시지에 값을 넘겨준다.
		String[] args = {"이순신"};
		
		// 스프링 프레임워크로부터 MessageSource를 주입받은 다음 getMessage 메소드를 호출한다.
		String message = messageSource.getMessage("welcome.message", args, Locale.KOREAN);
		log.info("Welcome message : " + message);
		
		return "home";
	}
	
	@GetMapping(value="/formHome")
	public String formHome() {
		log.info("GET 방식 formHome");
		
		return "formHome";
	}
	@GetMapping(value="/gohome03")
	public String home01() {
		log.info("String 타입 home01");
		
		return "home01";
	}
	
	@GetMapping(value="/gohome04")
	public String home02() {
		log.info("String 타입 home02");
		
		return "home02";
	}
	
	@GetMapping(value="/sub/gohome05")
	public String home03() {
		log.info("String 타입 home04");
		
		return "home03";
	}
	
	@GetMapping(value="/gohome06")
	public String home04() {
		log.info("String 타입 home05");
		
		return "redirect:/sub/gohome07";
	}
	
	@GetMapping(value="/sub/gohome07")
	public String home05() {
		log.info("String 타입 home05");
		
		return "/sub/home05";
	}
	
	@ResponseBody
	@GetMapping(value="/gohome08")
	public Member home06() {
		log.info("자바빈즈 클래스 타입 home06");
		
		Member member = new Member();
		
		return member;
	} */
	
	/*
	@ResponseBody
	@GetMapping(value="/gohome09")
	public List<Member> home07(){
		log.info("컬렉션 List 타입 home07");
		
		List<Member> list = new ArrayList<Member>();
		
		Member member = new Member();
		member.setUserId("user01");
		member.setPassword("hong1234");
		member.setUserName("홍길동");
		list.add(member);
		
		Member member2 = new Member();
		member2.setUserId("user02");
		member2.setPassword("lee5678");
		member2.setUserName("이순신");
		list.add(member2);
		
		return list;
	}
	
	@ResponseBody
	@GetMapping(value="/gohome10")
	public Map<String, Member> home08(){
		log.info("컬렉션 Map 타입 home08");
		
		Map<String, Member> map = new HashMap<String, Member>();
		
		Member member = new Member();
		member.setUserId("user03");
		member.setPassword("gap1234");
		member.setUserName("갑돌이");
		map.put("key1", member);
		
		Member member2 = new Member();
		member2.setUserId("user04");
		member2.setPassword("gap5678");
		member2.setUserName("갑순이");
		map.put("key2", member2);
		
		return map;
	}
	*/
}
