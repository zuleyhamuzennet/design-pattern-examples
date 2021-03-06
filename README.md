# Design Patterns

## Factory Method Pattern

- En basit haliyle, nesnelerin üretilme işlemini merkezi bir hale getirerek kod tekrarını önlememize yardımcı olan patterndir. Aynı abstractları inheritance almış nesnelerin üretimini yapan pattern de diyebiliriz.

## Facade Design Pattern

- Facade Bir alt sistemin parçalarını oluşturan classları istemciden soyutlayarak kullanımı daha da kolaylaştırmak için tasarlanmış tasarım kalıbıdır. Mimarisel açıdan ise, karmaşık ve detaylı bir sistemi organize eden ve bir bütün olarak clientlara(istemcilere) sunan yapıdır. Anlayacağınız, karmaşık ve detaylı olarak nitelendirdiğimiz bu sistemi bir alt sistem olarak varsayarsak eğer bu sistemi kullanacak clientlara daha basit bir arayüz sağlamak ve alt sistemleri bu arayüze organize bir şekilde dahil etmek ve bu alt sistemlerin sağlıklı çalışabilmesi için bu arayüz çatısı altında işin algoritmasına uygun işlev sergilemek istersek Facade Design Pattern’i kullanmaktayız.

## Observer Design Pattern

- Observer pattern, bir nesne kümesi arasındaki one-to-many ilişkiyi tanımlar. Bir nesnenin durumu değiştiğinde, bütün bağımlılarına bildirilir. Observer’lar (Gözlemciler), Subject (Özne)‘e bağımlıdır. Subject’in durumu değiştiğinde gözlemcilere haber verilir. Subject, object’in “durum bilgisini” tutar ve onu kontrol eder.
- Subject ve Observerlar arasında One Subject -to-Many Observers ilişkisi vardır. Subject bu verilerin tek sahibi olduğu için, gözlemciler, veriler değiştiğinde onları güncellemek için Subject’e bağımlıdır. Birçok nesnenin aynı veriyi kontrol etmesine izin vermekten daha temiz bir Object Oriented tasarımdır.
- Loose Coupling’in gücü: Observer Design Pattern’da loose coupling ilişkisi vardır. İki obje birbiriyle ilişkilidir ama birbiri hakkında çok az şey bilirler. Birinde yaptığımız değişlik diğerini etkilemez.

## Strategy Design Pattern

- Strateji tasarım deseni geliştirdiğimiz uygulama içinde algoritmaları sınıflandırmamızı ve çalışma anında kullanacağımız algoritmayı seçmemizi sağlar. Bu algoritmalar kendi içinde kapsüllenerek (encapsulate) programın geri kalanından soyutlanır ve uygulamamızın loosely coupled bir yapıda olmasına yardım eder. Örneğin bir maliyet hesabında LIFO mu yoksa FIFO mu kullanacağımızı çalışma anında belirlemek istiyorsak strateji tasarım desenini kullanarak bunu nesne yönelimli programlama ilkeleri doğrultusunda yapabiliriz.

## Template Design Pattern

- Şablon metot kalıbı davranışsal tasarım kalıpları grubunda yer alır. Şablon metot kalıbı bir işlem için gerekli adımları soyut olarak tanımlar ve bir şablon metot ile algoritmanın nasıl çalışacağını belirler. Alt sınıflar algoritma için gerekli bir ya da birden fazla metodu kendi bünyelerinde gerçekleyerek kullanılan algoritmanın kendi istekleri doğrultusunda çalışmasını sağlarlar. Böylece hem kod tekrarının önüne geçilerek kodun tekrar kullanılabilirliği hem de algoritma iskeletinde yapılacak bir düzenlemenin tek bir yerden yapılması sağlanır. Örneğin ata sınıfa (parent class) konulacak ve tanımlaması yapılmış bir yöntemle, alt sınıfın akışına müdahale etmesi sağlanabilir.

## Front Controller Design Pattern

- Front Controller Design Pattern, tüm taleplerin tek bir işleyici tarafından ele alınabilmesi için merkezi bir talep işleme mekanizması sağlamak için kullanılır. Bu işleyici, talebin kimlik doğrulaması / yetkilendirmesi / günlüğe kaydedilmesi veya takibini yapabilir ve ardından istekleri ilgili işleyicilere iletebilir. Bu tür tasarım modelinin varlıkları şu şekildedir.
- Front Controller : Sistemdeki tüm talepleri ele almak için ilk temas noktasıdır. Controller, bir kullanıcının kimlik doğrulamasını ve yetkilendirmesini tamamlamak veya kontak erişimini başlatmak için bir yardımcıya yetki verebilir.
- Dispatcher : Front Controller may use a dispatcher object which can dispatch the request to corresponding specific handler.
- View : Kullanıcıya gelen bilgileri temsil eder ve görüntüler. View, bir modelden bilgi alır. 

## Adapter Design Pattern

- Bir Adaptör modeli, aksi takdirde doğrudan bağlanamayacak iki uyumsuz arayüz arasında bir bağlayıcı görevi görür. Bir Bağdaştırıcı, mevcut bir sınıfı yeni bir arabirimle sarmalar, böylece istemcinin arabirimiyle uyumlu hale gelir.
Bu kalıbı kullanmanın arkasındaki ana sebep, mevcut bir arayüzü müşterinin beklediği başka bir arayüze dönüştürmektir. Genellikle uygulama tasarlandıktan sonra uygulanır.

## Prototype Design Pattern

- Bu model, mevcut nesnenin bir klonunu oluşturmayı söyleyen bir prototip arayüzünün uygulanmasını içerir. Bu desen, doğrudan nesnenin yaratılması maliyetli olduğunda kullanılır. Örneğin, maliyetli bir veritabanı işleminden sonra bir nesne oluşturulacaktır. Nesneyi önbelleğe alabilir, bir sonraki talepte klonunu döndürür ve gerektiğinde veritabanını güncelleyerek veritabanı çağrılarını azaltırız.
- Bu klonlama(kopyalama) işleminde, deep-copy yöntemi kullanılıyor. Yani bir nesne, birebir kopyalanarak yeni bir referans değişkene atılıyor.

# Kaynaklar

- [Factory Design Pattern](https://medium.com/bili%C5%9Fim-hareketi/factory-fabrika-pattern-c14baca707be)
- [Facade Design Pattern](https://www.tutorialspoint.com/design_pattern/facade_pattern.htm)
- [Observer Design Pattern](https://medium.com/t%C3%BCrkiye/observer-g%C3%B6zlemci-pattern-16cbe6d4bfbe)
- [Strategy Design Pattern](https://metinalniacik.medium.com/strategy-design-pattern-strateji-tasar%C4%B1m-%C3%B6r%C3%BCnt%C3%BCs%C3%BC-d7a43290969c)
- [Template Design Pattern](https://www.journaldev.com/1763/template-method-design-pattern-in-java)
- [Front Controller Design Pattern](https://www.geeksforgeeks.org/front-controller-design-pattern/)
- [Adapter Design Pattern](https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm)
- [Prototype Design Pattern](https://medium.com/@yasinmemic/prototype-design-pattern-nedir-37dc82983bef)
- [Singleton Design Pattern](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)

