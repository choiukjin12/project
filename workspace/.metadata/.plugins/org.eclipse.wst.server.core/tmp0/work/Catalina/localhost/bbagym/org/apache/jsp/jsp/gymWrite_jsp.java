/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-08-24 11:05:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gymWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>gymWrite</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/gymWrite.css\">\r\n");
      out.write("    <link rel=\"icon\" href=\"/img/로고.png\">\r\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("    <script defer src=\"../js/gymWrite.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <form><!--서버에 보내기 위해 form 태그를 사용함--> \r\n");
      out.write("        <table><!--테이블 이용 10행, 2열의 표를 만듬-->\r\n");
      out.write("            <tr><!--tr은 하나의 행을 의미함-->\r\n");
      out.write("                <th colspan=\"2\">운동시설 등록</th><!--th 제목의 셀을 의미함, colspan=2는 2칸의 셀은 가로로 병합을 의미-->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>시설명</th>\r\n");
      out.write("                <td><input type=\"text\" placeholder=\"시설명을 입력해주세요\" id=\"title\" name=\"title\"></td><!--td는 하나의 셀을 의미-->\r\n");
      out.write("                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>시설사진</th>\r\n");
      out.write("                <td><input type=\"file\" id=\"photo\" name=\"photo\" accept=\"image/gif, image/jpeg, image/png\" /></td>\r\n");
      out.write("                <!--input file을 이용하여 파일을 업로드하여 사진을 불러올 수 있도록 함-->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th rowspan=\"3\">주소</th>\r\n");
      out.write("                <!-- <td><input type=\"text\" placeholder=\"주소를을 입력해주세요\" id=\"address\" name=\"address\"></td> -->\r\n");
      out.write("                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->\r\n");
      out.write("                <td>                    \r\n");
      out.write("                    <input type=\"text\" id=\"sample6_postcode\" placeholder=\"우편번호\">\r\n");
      out.write("                    <input type=\"button\" onclick=\"sample6_execDaumPostcode()\" value=\"우편번호 찾기\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><input type=\"text\" id=\"sample6_address\" placeholder=\"주소\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" id=\"sample6_detailAddress\" placeholder=\"상세주소\">\r\n");
      out.write("                    <input type=\"text\" id=\"sample6_extraAddress\" placeholder=\"참고항목\">\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>가격</th>\r\n");
      out.write("                <td><input type=\"text\" placeholder=\"가격을 숫자만으로 입력해주세요. ex)5000\" id=\"price\" name=\"price\" onKeyup=\"this.value=this.value.replace(/[^0-9]/g,'');\"></td>\r\n");
      out.write("                <!-- 정규식을 이용하여 입력받은 값을 숫자로만 입력 받는다 -->\r\n");
      out.write("                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>카테고리</th>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <!--type checkbox를 이용하여 카테고리를 체크 분류할 수 있게 합니다-->\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"헬스\" checked>헬스\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"요가\">요가\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"크로스핏\">크로스핏\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"복싱\">복싱<br>\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"필라테스\">필라테스\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"주짓수\">주짓수\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"골프\">골프\r\n");
      out.write("                    <input type=\"checkbox\" name=\"category\" value=\"수영\">수영\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>내용</th>\r\n");
      out.write("                <!--textarea를 사용해 긴글을 작성 받게 합니다-->\r\n");
      out.write("                <td><textarea id=\"content\" placeholder=\"내용을 입력해주세요\" name=\"content\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>공지사항</th>\r\n");
      out.write("                <!--textarea를 사용해 긴글을 작성 받게 합니다-->\r\n");
      out.write("                <td><textarea id=\"notice\" placeholder=\"공지사항을 입력해주세요\" name=\"notice\"></textarea></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>운영시간</th>\r\n");
      out.write("                <td><textarea id=\"time\" placeholder=\"운영시간을 입력해주세요\" name=\"time\"></textarea></td>\r\n");
      out.write("                <!--textarea를 사용해 긴글을 작성 받게 합니다-->\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <div class=\"btn-container\">\r\n");
      out.write("        <button type=\"button\" value=\"등록\" id=\"btn\"> 등록 </button>\r\n");
      out.write("        <!--button을 페이지리로딩과 폼제출을 막아줌 스크립트를 이용하여 입력한 값들을 전송합니다-->\r\n");
      out.write("        <!-- submit을 하면 작성했던 글들이 사라지는것을 방지하기 위함 -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
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
