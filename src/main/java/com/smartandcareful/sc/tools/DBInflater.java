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
        Article One= new Article("CZYM JEST CYBERPRZEMOC?","Cyberprzemoc to bardzo popularna forma znęcania się nad ofiarami przy pomocy głównie komputera i telefonu komórkowego z dostępem do internetu. Napastnik najczęściej dąży do wymuszenia danych od ofiary, poniżyć jego samopoczucie, zastraszać i prześladować go.");
        Author Fil= new Author("Filip");
        Article Two= new Article("DLACZEGO CYBERPRZEMOC JEST TAK POPULARNA?","Łatwiej jest poniżać, kiedy istnieje szansa ukrycia się za internetowym pseudonimem. \n" +
                "Nie ma potrzeby konfrontacji z ofiarą oko w oko, dlatego można ją bez problemu nękać. \n" +
                "Sprawca może spreparować poniżającą treść bez potrzeby reagowania na bieżąco.\n" +
                "Sprawca może działać w dowolnym czasie. Ofiara nie ma możliwości ucieczki, ponieważ jej profil cały czas jest dostępny w sieci.\n" +
                "Kompromitujące materiały są dostępne w krótkim czasie dla wielu osób i pozostają w sieci na zawsze.\n");
        Article Three= new Article("KIM SA OFIARY CYBERPRZEMOCY?","Najczęstszymi ofiarami cyberprzemocy są koledzy lub koleżanki z klasy, bądź były chłopak/ była dziewczyna.\n" +
                "W niektórych przypadkach są to osoby niekontaktowe, bezbronne. \n" +
                "Cyberprzemoc często powstaje na skutek żartu, a następnie bardzo często stopniuje się do coraz gorszego stopnia.\n" +
                "Osoby dotknięte cyberprzemocą ze strony rówieśników często same kreują swoją postawę ofiary nieodpowiednim zachowaniem, zakłamaniem, fałszywością.\n");
        Article Four= new Article("CZY TY PRZYCZYNIŁEŚ SIĘ DO CYBERPRZEMOCY?","Cyberprzemocą jest rozsyłanie kompromitujących materiałów.\n" +
                "Włamywanie się na konta pocztowe w celu rozsyłania wstydliwych wiadomości.\n" +
                "Rozsyłanie otrzymanych danych i wiadomości jako zapisu rozmowy, czy kopii e-maila.\n" +
                "Tworzenie ośmieszających stron internetowych.\n" +
                "Podszywanie się pod inne osoby.\n" +
                "Wykluczanie z internetowych społeczności.\n" +
                "Publikowanie często wulgarnych komentarzy i postów\n");
        Article Five= new Article("RODZAJE CYBERPRZEMOCY","Cyberstalking – oznacza on prześladowanie danej osoby w cyberprzestrzeni, najczęściej w sieciach społecznościowych, lecz również przy pomocy wiadomości SMS, rozmów telefonicznych, e-mailów. Często ofiarą stalkera jest ktoś, kogo sam osobiście zna i chce go dręczyć. Od roku 2011 jest uznawana jako czyn zabroniony i podlega karze.\n" +
                "\n" +
                "Wykluczanie – ofiara jest celowo wykluczana z danej grupy, do której by chciała należeć, może czuć się sfrustrowana z powodu niespełnienia własnych potrzeb, gdzie należy. W życiu wirtualnym jest to znacznie gorsze, ponieważ jest tam bardziej widoczne, kto jest lubiany a kto nie – dla przykładu ofiara jest wykluczana z grupy na facebooku, gdzie jest znacznie więcej osób\n" +
                "\n" +
                "Cybergrooming- manipulacja w cyberprzestrzeni w celu nakierowania użytkownika na osobiste spotkanie. Napastnik, który zazwyczaj udaje kogoś innego, znajduje odpowiednią osobę, do której z czasem buduje zaufanie i zmusza ją do osobistego spotkania, na którym następnie w jakiś sposób wykorzystuje ofiarę. W tej dziedzinie często najbardziej narażone są dzieci uzależnione od technologii, spędzają większość czasu online i mają większość swoich przyjaciół tylko w świecie wirtualnym.\n" +
                "Flaming – chodzi o wrogie nastawienie napastnika w stosunku do ofiary w świecie wirtualnym. Jest bardzo przesycona wulgaryzmami i atakami słownymi, gdzie napastnik chce się aż „wykłócać” z ofiarą. Niektórzy użytkownicy specjalnie tworzą fałszywe konta, aby mogli podsycać właśnie w ten sposób różnych innych użytkowników. \n" +
                "\n" +
                "Sexting - przesyłanie tekstów zdjęć i filmów o tematyce seksualnej przez media elektroniczne. Materiały te często trafiają do Internetu i mogą mieć fatalne konsekwencje dla ofiary, ponieważ są często wykorzystywane jako środek szantażu. Niektóre przypadki mogą zakończyć się śmiercią ofiary. Napastnik popełnia przestępstwa związane z pornografią dziecięcą, jeśli ofiara ma mniej niż 18 lat.\n" +
                "\n" +
                "Happy Slapping – chociaż nazwa może brzmieć zabawnie skutki tego rodzaju cyberprzemocy są fatalne. Napastnicy wyłapują ofiarę w prawdziwym życiu, jeden daną osobę upokarza, a drugi całe zdarzenie nagrywa. Później nagrany filmik umieszczają w internecie.\n");
        Article Six= new Article("CO ZROBIĆ JAK PADNIE SIĘ OFIARĄ PRZEŚLADOWANIA W INTERNECIE?","Pierwszą rzeczą, jaką robią sprawcy cyberprzemocy, gdy grozi im zdemaskowanie jest usuwanie dowodów przestępstwa z internetu. Spróbuj zabezpieczyć dowody zrzutami ekranowymi.\n" +
                "Jeśli wiesz, kim jest prześladowca – porozmawiaj z rodzicami, zgłoś problem w szkole, nie wstydź się, każdy z nas może paść ofiarą agresji elektronicznej.\n" +
                "Jeżeli jesteś/byłeś ofiarą cyberprzemocy lub niepokoi Cię jakieś zdarzenie związane z bezpieczeństwem cyfrowym, porozmawiaj z osobą dorosłą.\n" +
                "Jeśli nie wiesz, kim jest prześladowca, po zabezpieczeniu dowodów skontaktuj się z policją.\n");
        Article Seven= new Article("JAK MOŻESZ POMÓC OFIERZE AGRESJI INTERNETOWEJ?","Wesprzyj osobę pokrzywdzoną, pokaż jej, że zależy Ci na niej. Wysłuchaj, a nie oceniaj. Pokaż, że ofiara może Ci ufać. \n" +
                "Zareaguj stosownie do sytuacji ,czasem wystarczy rozmowa, zanim podejmiesz jakiekolwiek kroki, pamiętaj emocje są złym doradcą.\n" +
                "Jako świadek masz moc, której ofiara cyberprzemocy nie posiada. Czasem zwrócenie uwagi agresorowi i pokazanie, że większość osób nie popiera go może zatrzymać cyberprzemoc. \n" +
                "Pomóż ofierze zachować dowody cyberprzemocy w postaci kopii, zrzut ekranu,wydruków.\n" +
                "Pomóż zablokować treści o charakterze cyberprzemocy lub zgłoś je do administratora. Media społecznościowe mają centrum bezpieczeństwa, gdzie możesz zgłaszać takie przypadki. \n");
        Article Eight= new Article("ZAPAMIĘTAJ !","Pamiętaj o tym, że masz prawo (a nawet obowiązek!) się bronić, \n" +
                "Nie musisz być ofiarą! Pamiętaj o tym, że jeżeli sprawca przemocy poczuje się bezkarny to jego działania będą coraz bardziej agresywne i skierowane do coraz większej grupy ofiar.\n" +
                "Wbrew przekonaniu osób, które dopuszczają się cyberprzemocy w sieci nie jesteśmy ani anonimowi, ani bezkarni. Ukrycie się za nickiem nie gwarantuje nikomu bezkarności, lecz „stety i niestety” nie wszyscy są tego świadomi.\n" +
                "ZAPAMIĘTAJ,ŻE KARY DOTYCZĄ NIE TYLKO OSÓB PEŁNOLETNICH ALE RÓWNIEŻ MŁODZIEŻY.\n");
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
