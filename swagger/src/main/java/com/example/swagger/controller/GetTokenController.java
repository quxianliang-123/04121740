package com.example.swagger.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class GetTokenController {

	//	//　パラメタが使用してない
	//	@GetMapping(path = "/customers")
	//	public String customers(Model model) {
	//
	//		// TOKENをKEYCLOAKから取得する
	//		Authentication authToken = SecurityContextHolder.getContext().getAuthentication();
	//		Map<String, Object> attributes = new HashMap<>();
	//
	//		try {
	//			attributes = ((OAuth2AuthenticationToken) authToken).getPrincipal().getAttributes();
	//		} catch (Exception e) {
	//
	//			//エラーを投げる
	//			e.getMessage();
	//		}
	//
	//		// TOKENのpreferred_usernameをSTRINGで見る
	//		String a = attributes.get("preferred_username").toString();
	//
	//		System.out.println(a);
	//		return "customers";
	//	}

	//	@GetMapping("/userinfo")
	//	public String getUserInfo() {
	//		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
	//				.getRequest();
	//		KeycloakAuthenticationToken keycloakAuthenticationToken = (KeycloakAuthenticationToken) request
	//				.getUserPrincipal();
	//		KeycloakPrincipal<KeycloakSecurityContext> principal = (KeycloakPrincipal) keycloakAuthenticationToken
	//				.getPrincipal();
	//		String token = principal.getKeycloakSecurityContext().getIdTokenString();

	//		KeycloakPrincipal keycloakPrincipal = (KeycloakPrincipal) SecurityContextHolder.getContext().getAuthentication()
	//				.getPrincipal();
	//		String userId = keycloakPrincipal.getKeycloakSecurityContext().getToken().getSubject();

	//		return "customers";
	//	}

	@GetMapping(value = "/")
	public String getHome() {
		return "index";
	}

	@GetMapping(value = "/home")
	public String getBooks(Model model) {
		return "home";
	}

}
