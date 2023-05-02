package ru.klassen.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    //Задаем Spring конфигурацию
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }


    //Указываем то, что все URL запросы пользователя отправляем на Dispatcher Servlet
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
