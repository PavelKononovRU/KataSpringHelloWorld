import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

            HelloWorld beanOne =
                    (HelloWorld) applicationContext.getBean("helloworld");
            HelloWorld beanTwo =
                    (HelloWorld) applicationContext.getBean("helloworld");

            Cat cat1 = (Cat) applicationContext.getBean("cat");
            Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Результат сравнения бинов  \"helloworld\": " + (beanOne == beanTwo));

        System.out.println("Результат сравнения бинов  \"cat\" : " + (cat1 == cat2));
    }
}