# SpringMvc_exampleCode    
## Spring Web MVC는 Servlet API를 기반으로 구축된 독창적인 웹 프레임워크        
## MVC 패턴은 소프트웨어를 구성하는 요소들을 Model, View, Controller로 구분하여 각각의 역할을 분리합니다.     
![image](https://github.com/eunchaelyu/SpringMvc_exampleCode/assets/119996957/6658bdf6-c5c8-4478-8e72-7322ff27e25f)    

1. 사용자가 Client(브라우저)를 통해 서버에 HTTP Request 즉, API 요청을 합니다.    
2. 요청을 받은 Servlet 컨테이너는 HttpServletRequest, HttpServletResponse 객체를 생성합니다.    
    1. 약속된 HTTP의 규격을 맞추면서 쉽게 HTTP에 담긴 데이터를 사용하기 위한 객체입니다.    
3. 설정된 정보를 통해 어떠한 Servlet에 대한 요청인지 찾습니다.    
4. 해당 Servlet에서 service 메서드를 호출한 뒤 브라우저의 요청 Method에 따라 doGet 혹은 doPost 등의 메서드를 호출합니다.    
5. 호출한 메서드들의 결과를 그대로 반환하거나 동적 페이지를 생성한 뒤 HttpServletResponse 객체에 응답을 담아 Client(브라우저)에 반환합니다.    
6. 응답이 완료되면 생성한 HttpServletRequest, HttpServletResponse 객체를 소멸합니다.


