/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-24 10:14:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class announcement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/announcement.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"../img/로고.png\">\r\n");
      out.write("    <title>공지사항 page</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"title\">\r\n");
      out.write("            <h2>공지</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- 1번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>다짐보다 싸면 100% 전액 환불!</div>\r\n");
      out.write("            <div class=\"date-div\"><span class=\"date\">2021.04.09.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 2번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>3차 코로나19 관련 홀딩 추가 공지</div>\r\n");
      out.write("                <div class=\"date-div\"><span class=\"date\">2020.12.08.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 3번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\">\r\n");
      out.write("                <span class=\"blueText\">[공지]</span>코로나19 사회적 거리두기로 인한 고객센터 운영 안내</div>\r\n");
      out.write("                <div class=\"date-div\"><span class=\"date\">2020.08.31.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 4번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>2차 코로나19 관련 홀딩 추가 공지</div>\r\n");
      out.write("                <div class=\"date-div\"> <span class=\"date\">2020.08.28.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 5번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\">\r\n");
      out.write("                <span class=\"blueText\">[공지]</span>코로나19 관련 홀딩 및 시작일 연기 제공 종료</div>\r\n");
      out.write("            <div class=\"date-div\"> <span class=\"date\">2020.05.06.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 6번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>코로나19 정부 지침 관련 운동기간 연장안내</div>\r\n");
      out.write("                <div class=\"date-div\"><span class=\"date\">2020.03.24.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 7번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>다짐보다 싸면 100% 전액 환불!</div>\r\n");
      out.write("                <div class=\"date-div\"> <span class=\"date\">2021.04.09.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 8번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>3차 코로나19 관련 홀딩 추가 공지</div>\r\n");
      out.write("                <div class=\"date-div\"> <span class=\"date\">2020.12.08.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 1번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>코로나19 사회적 거리두기로 인한 고객센터 운영 안내</div>\r\n");
      out.write("                <div class=\"date-div\"> <span class=\"date\">2020.08.31.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 9번째 div -->\r\n");
      out.write("        <a href=\"../ljm/noticeDetail.html\">\r\n");
      out.write("        <div class=\"div\" id=\"last-div\">\r\n");
      out.write("            <div class=\"inner-div\"><span class=\"blueText\">[공지]</span>2차 코로나19 관련 홀딩 추가 공지</div>\r\n");
      out.write("                <div class=\"date-div\"><span class=\"date\">2020.08.28.</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <!-- 하단 버튼 -->\r\n");
      out.write("        <div class=\"button-div\">\r\n");
      out.write("            <div class=\"main-button\">\r\n");
      out.write("                <button class=\"button\"> <b><<</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b><</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>1</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>2</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>3</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>4</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>5</b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>></b> </button>\r\n");
      out.write("                <button class=\"button\"> <b>>></b> </button>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- div container 닫는 태그-->\r\n");
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
