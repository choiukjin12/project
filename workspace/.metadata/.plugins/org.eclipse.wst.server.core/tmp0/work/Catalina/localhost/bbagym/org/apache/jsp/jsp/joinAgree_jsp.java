/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-24 10:27:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinAgree_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>이용약관</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/joinAgree.css\">\r\n");
      out.write("    <link rel=\"icon\" herf=\"/img/로고.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2>이용약관 동의</h2>\r\n");
      out.write("        <form action=\"joinInform.html\">\r\n");
      out.write("            <div class=\"agree-container\">\r\n");
      out.write("                <label for=\"\" class=\"agree-label\">\r\n");
      out.write("                    <div class=\"agree-all\">\r\n");
      out.write("                        <input type=\"checkbox\" id=\"all\" value=\"all\" class=\"all\">\r\n");
      out.write("                        <h3>전체 이용약관에 동의합니다.</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"agree-content\">\r\n");
      out.write("                        <div class=\"agree\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"agreement\" value=\"personal\" class=\"agreement must\">\r\n");
      out.write("                            <span class=\"agree-text\">개인정보 수집·이용에 동의합니다.</span>\r\n");
      out.write("                            <span class=\"agree-must\">(필수)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"\" class=\"a\">내용보기</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"personal-inform\">\r\n");
      out.write("                        <p>개인정보 수집</p>\r\n");
      out.write("                        <p>목적: 회원권 상품 판매 및 중개 서비스의 이행 및 서비스 제공</p>\r\n");
      out.write("                        <p>항목: 이름, 주소, 성별, 이메일, 비밀번호, 휴대폰 번호</p>\r\n");
      out.write("                        <p>보유기간: 탈퇴 시 즉시 파기</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"agree-content\">\r\n");
      out.write("                        <div class=\"agree\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"agreement\" value=\"tos\" class=\"agreement must\">\r\n");
      out.write("                            <span>이용약관에 동의합니다.</span>\r\n");
      out.write("                            <span class=\"agree-must\">(필수)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"\">내용보기</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"agree-content\">\r\n");
      out.write("                        <div class=\"agree\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"agreement\" value=\"gps\" class=\"agreement must\">\r\n");
      out.write("                            <span>위치기반 서비스 약관에 동의합니다.</span>\r\n");
      out.write("                            <span class=\"agree-must\">(필수)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <a href=\"\">내용보기</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"agree-content\">\r\n");
      out.write("                        <div class=\"agree\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"agreement\" value=\"age\" class=\"agreement must\">\r\n");
      out.write("                            <span>만 14세 이상입니다.</span>\r\n");
      out.write("                            <span class=\"agree-must\">(필수)</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"agree-content\">\r\n");
      out.write("                        <div class=\"agree\">\r\n");
      out.write("                            <input type=\"checkbox\" id=\"agree\" value=\"\" class=\"agreement\">\r\n");
      out.write("                            <span>마케팅 정보 수신에 동의합니다.</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <input type=\"submit\" value=\"가입하기\" class=\"join-btn\" name=\"join-btn\" disabled>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.7.0.js\" integrity=\"sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"../js/joinAgree.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}