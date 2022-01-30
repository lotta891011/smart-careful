package com.smartandcareful.sc.tools;

import com.smartandcareful.sc.model.Article;
import com.smartandcareful.sc.model.Author;
import com.smartandcareful.sc.repositories.ArticleRepository;
import com.smartandcareful.sc.repositories.AuthorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(ArticleRepository articleRepository, AuthorRepository authorRepository) {
        this.authorRepository= authorRepository;
        this.articleRepository=articleRepository;

    }

    private AuthorRepository authorRepository;
    private ArticleRepository articleRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author Seb= new Author("Sebastian");
        Article One= new Article("Czym jest smart city?","Odpowiedź na to pytanie nie jest jednoznaczna ponieważ odnosi się do bardzo wielu zastosowań \n" +
                "technologicznych, najprościej można je zdefiniować jako Inteligentne miasto które jest zarządzane\n" +
                "przy wykorzystaniu najnowszych technologii. Kluczowe zastosowanie mają jednak technologie\n" +
                "informacyjno - komunikacyjne które pozwalają na komunikację człowieka z infrastrukturą oraz innymi ludźmi.\n");

        Author Fil= new Author("Filip");

        Article Two= new Article("Kiedy zwykłe miasto staje się smart?",
                "Otóż okazuje się, że można ocenić, na ile miasto jest „smart”. W tym celu utworzono klasyfikację miast europejskich. Do kryteriów jakie służą do klasyfikacji miast należą:\n"
                +"inteligentne zarządzanie,\n"
                +"inteligentna gospodarka,\n"
                +"inteligentna mobilność,\n"
                +"inteligentne środowisko naturalne,\n"
                +"inteligentna populacja (mieszkańcy),\n"
                +"inteligentne warunki życia.\n"
                +"Kluczowe jednak okazuje jak bardzo inteligentna jest populacja  oraz jej wykształcenie czy otwartość na nowe rozwiązania bo to przecież my ludzie tworzymy miasta oraz jesteśmy ich najważniejszą częścią.\n");


        Article Three= new Article("Zalety smart city","Niepodważalną zaletą jest na pewno zmniejszenie kosztów, które ma realny wpływ w ponoszeniu standardów życia   \n" +
                "Również oprawienie bezpieczeństwa np. nowoczesne przejścia dla pieszych z dodatkowym oświetleniem i wykrywaniem pieszego jest dużym plusem.      \n" +
                "Oprócz tego poprawienie komfortu życia oraz zrównoważony rozwój który pojawia spójność infrastruktury sprzyja tym technologiom.  \n") ;

        Article Four= new Article("Wady smart city","Jednym z minusów jest na przykład to, że niektóre grupy społeczne mogą zostać wykluczone ponieważ mogą sobie nie poradzić z nowymi technologiami zwłaszcza starsi ludzi lub osoby niepełnosprawne . Oprócz tego poprawa bezpieczeństwa najczęściej wiąże się z zabraniem części prywatności, przestajemy być anonimowi oraz jesteśmy coraz bardziej obserwowani.");

        Article Five= new Article("Przyczyny rozwoju smart city","Ciągłe zwiększanie ludności przyczynia się do urbanizacji miast, miasta stają się coraz większe. Aby usprawnić funkcjonowanie miasta wykorzystuje się najnowsze technologie.\n" +
                "Chodź wiele osób pomija aspekt klimatyczny jest on bardzo ważny ponieważ borykamy się z brakiem zasobów naturalnych  .\n" +
                "Brak stabilności światowego systemu gospodarczego które powoduje rozwarstwianie się społeczeństwa duży wpływ na poprawę tego problemu ma walka z wykluczeniem cyfrowym.");

        Article Six= new Article("Big Data","Big Data technologia która polega na zbieraniu ogromnych ilości danych w celu zoptymalizowania różnego rodzaju procesów\n" +
                "Wiele osób może nie zdawać sobie sprawy z tego, że niemal wszystkie dane mogą zostać zebrane w jednym miejscu, powiązane ze sobą i przeanalizowane. Następnie z tych danych mogą być wyciągane pewne wnioski.\n" +
                "Zwiększenie ilości przetwarzanych danych pozwala na odkrywanie ukrytych powiązań i z nich powtarzalnych schematów które byłby niezauważalne przy mniejszej ilości informacji \n" +
                "Big Data wykorzystywana jest do wielu użytecznych celów takich walka z nowotworami, rozszyfrowanie genomu, badania astronomiczne, walka z terroryzmem, badania dotyczące mechaniki kwantowej, oraz co ważne w smart city gdzie znajduje zastosowanie w przeciwdziałaniu korkom w wielkich metropoliach amerykańskich i azjatyckich.\n" +
                "Dzięki technologii big data w przyszłości będzie możliwe większe zoptymalizowanie ruchu drogowego, komunikacyjnego  oraz lepsze reagowanie na potrzeby ludzi żyjących w miastach niestety gromadzenie wielkich ilości danych tworzy też ryzyko wykorzystania ich do innych celów niż zostały zgromadzone co niestety może  przyczynić się to do zmniejszania prywatności po przez wyciek danych.");

        Article Seven= new Article("Przyszłość zakupów","Sklepy w pełni samoobsługowe czyli takie w których nie ma żadnych pracowników kas, są przyszłością zakupów w smart city. Ich działanie ma polegać na tym że po spakowaniu produktów można wyjść a pieniądze zostaną pobrane z karty bądź aplikacji po opuszczeniu sklepu. Dzięki zautomatyzowaniu procesu magazynowania  będzie możliwe uzupełnię zapasu bez konieczności wcześniejszej wizyty w sklepie, lista produktów wymagających uzupełnienia zostanie wykonana automatycznie. Co znacznie uprości prowadzenie sklepu.");

        Article Eight= new Article("Pierwsze chodź niedoskonałe sklepy","eden z pierwszych sklepów bez obsługi w Polsce otworzyła żabka w oparciu o technologię OASIS który wykorzystuje system kamer wykorzystujący zawansowane algorytmy sztucznej inteligencji, rozmieszczenie kamer pozwala śledzić każdy ruch kupującego wraz z tym co zabiera on z sklepowej półki po zabraniu produktu jest on dodany do listy zakupów. ");

        authorRepository.save(Seb);
        authorRepository.save(Fil);
        articleRepository.save(One);
        articleRepository.save(Two);
        articleRepository.save(Three);
        articleRepository.save(Four);
        articleRepository.save(Five);
        articleRepository.save(Six);
        articleRepository.save(Seven);
        articleRepository.save(Eight);





    }
}
