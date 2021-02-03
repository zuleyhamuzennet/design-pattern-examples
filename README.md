# Design Patterns

# Açıklamalar

## Factory Pattern

## Facade Pattern

Facade Bir alt sistemin parçalarını oluşturan classları istemciden soyutlayarak kullanımı daha da kolaylaştırmak için tasarlanmış tasarım kalıbıdır. Mimarisel açıdan ise, karmaşık ve detaylı bir sistemi organize eden ve bir bütün olarak clientlara(istemcilere) sunan yapıdır. Anlayacağınız, karmaşık ve detaylı olarak nitelendirdiğimiz bu sistemi bir alt sistem olarak varsayarsak eğer bu sistemi kullanacak clientlara daha basit bir arayüz sağlamak ve alt sistemleri bu arayüze organize bir şekilde dahil etmek ve bu alt sistemlerin sağlıklı çalışabilmesi için bu arayüz çatısı altında işin algoritmasına uygun işlev sergilemek istersek Facade Design Pattern’i kullanmaktayız.

## Observer Design Pattern

- Observer pattern, bir nesne kümesi arasındaki one-to-many ilişkiyi tanımlar. Bir nesnenin durumu değiştiğinde, bütün bağımlılarına bildirilir. Observer’lar (Gözlemciler), Subject (Özne)‘e bağımlıdır. Subject’in durumu değiştiğinde gözlemcilere haber verilir. Subject, object’in “durum bilgisini” tutar ve onu kontrol eder.
- Subject ve Observerlar arasında One Subject -to-Many Observers ilişkisi vardır. Subject bu verilerin tek sahibi olduğu için, gözlemciler, veriler değiştiğinde onları güncellemek için Subject’e bağımlıdır. Birçok nesnenin aynı veriyi kontrol etmesine izin vermekten daha temiz bir Object Oriented tasarımdır.
- Loose Coupling’in gücü: Observer Design Pattern’da loose coupling ilişkisi vardır. İki obje birbiriyle ilişkilidir ama birbiri hakkında çok az şey bilirler. Birinde yaptığımız değişlik diğerini etkilemez.

# Kaynaklar

- [Factory Pattern](https://medium.com/bili%C5%9Fim-hareketi/factory-fabrika-pattern-c14baca707be)
- [Facade Pattern](https://www.tutorialspoint.com/design_pattern/facade_pattern.htm)
- [Observer Design Pattern - Örnek](https://medium.com/t%C3%BCrkiye/observer-g%C3%B6zlemci-pattern-16cbe6d4bfbe)
- [Observer Design Pattern- Açıklama](https://medium.com/i%CC%87yi-programlama/observer-g%C3%B6zlemci-design-pattern-535df620b720)
 
